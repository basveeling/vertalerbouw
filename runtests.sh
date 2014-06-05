#!/bin/bash

buildgram=true
compile=true
rungunit=true
makejunit=false

while getopts 'gcrj' flag; do
  case "${flag}" in
    g) buildgram=false ;;
    c) compile=false ;;
    r) rungunit=false ;;
    j) makejunit=true ;;
    *) error "Unexpected option ${flag}" ;;
  esac
done

# cp tests/* bin/

if [[ $buildgram = true ]]; then
echo "Building Antlr grammars"
java org.antlr.Tool src/vb/stil/Stil.g
fi
# java org.antlr.Tool src/vb/stil/*.g


if [[ $compile = true ]]; then
echo "Compiling..."
java -jar /Applications/eclipse/plugins/org.eclipse.jdt.core_*.jar -d bin/ -1.7 src/
fi

if [[ $rungunit = true ]]; then
echo "Running gunit tests..."
cd bin; java org.antlr.gunit.Interp ../gunit/Stil.gunit
fi

if [[ $makejunit = true ]]; then
echo "Make junit tests from gunit..."
cd bin; java org.antlr.gunit.Interp -o ../gunit/Stil.gunit
fi