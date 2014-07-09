#!/bin/bash
# Based on: http://stackoverflow.com/questions/10118381/bash-script-to-automatically-test-program-output-c
# If number of arguments less then 1; print usage and exit
# if [ $# -lt 1 ]; then
#     printf "Usage: $0 <application>\n"
#     exit 1
# fi

diff="diff -iad"   # Diff command, or what ever

# An array, do not have to declare it, but is supposedly faster
# declare -a file_base=("assignment_expression" "compound_print" "type_checking")
if [ $# -lt 1 ]; then
  declare -a file_base=(tests/*.st)
else
  file_base=($1)
fi
# Loop the array

for file in "${file_base[@]}"; do
    # Padd file_base with suffixes
    file_in="$file.in"             # The in file
    file_source="$file"             # The in file
    file_out_val="$file.out"       # The out file to check against

    # Validate infile exists (do the same for out validate file)

    if [ ! -f "$file_source" ]; then
        printf "Source file %s is missing\n" "$file_source"
        continue;
    fi

    if [ ! -f "$file_in" ]; then
        printf "In file %s is missing\n" "$file_in"
        continue;
    fi    
    if [ ! -f "$file_out_val" ]; then
        printf "Validation file %s is missing\n" "$file_out_val"
        continue;
    fi

    printf "== Testing %s against %s\n" "$file_source" "$file_in"

    # Run application, redirect in file to app, and output to out file
    java -jar stil.jar "$file_source"
    e_code=$?
    if [ $e_code != 0 ]; then
            printf "===== Generation FAIL : %d\n" "$e_code"
            exit 1;
    else
            printf "======== Generation OK!\n"
    fi
    cd gen; java Program < "../$file_in" > output.txt 2>&1; cd ..

    # Execute diff
    $diff "gen/output.txt" "$file_out_val"


    # Check exit code from previous command (ie diff)
    # We need to add this to a variable else we can't print it
    # as it will be changed by the if [
    # Iff not 0 then the files differ (at least with diff)
    e_code=$?
    if [ $e_code != 0 ]; then
            printf "===== TEST FAIL : %d\n" "$e_code"
            exit 1;
    else
            printf "===== TEST OK!\n"
    fi

    # # Pause by prompt
    # read -p "Enter a to abort, anything else to continue: " input_data
    # # Iff input is "a" then abort
    # [ "$input_data" == "a" ] && break

done

# Clean exit with status 0
exit 0