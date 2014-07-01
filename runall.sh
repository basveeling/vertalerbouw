#!/bin/bash

buildgram=true
compile=true
rungunit=true
runjasmin=true
generatecode=true

while getopts 'agcrj' flag; do
    case "${flag}" in
        a) buildgram=false ;;
        c) compile=false ;;
        r) rungunit=false ;;
        j) runjasmin=false ;;
        g) generatecode=false ;;
        *) error "Unexpected option ${flag}" ;;
    esac
done

# cp tests/* bin/

if [[ $buildgram = true ]]; then
    echo "(a) Building ANTLR grammars"
    cd src/vb/stil/; java org.antlr.Tool *.g; cd ../../..;
fi
# java org.antlr.Tool src/vb/stil/*.g


if [[ $compile = true ]]; then
    echo "(c) Compiling..."
    # TODO: make this platform agnostic
    java -jar /Applications/eclipse/plugins/org.eclipse.jdt.core_*.jar -d bin/ -1.7 src/
fi

if [[ $rungunit = true ]]; then
    echo "(r) Running GUnit tests..."
    echo "==== GUNIT ===="
    cd bin; java org.antlr.gunit.Interp ../gunit/Stil.gunit
    java org.antlr.gunit.Interp ../gunit/StilChecker.gunit
    cd ../
    echo "==== END ===="
fi

if [[ $generatecode = true ]]; then
    echo "(g) Generating code"
    java -Dfile.encoding=UTF-8 -classpath bin vb.stil.Stil gunit/program.st
fi

if [[ $runjasmin = true ]]; then
    echo "(j) Compiling with Jasmin"
    java -jar jasmin.jar -d gen/ gen/program.j 

    echo "==== RUNNING PROGRAM ===="
    cd gen; java Program
    echo "====      END        ===="
fi