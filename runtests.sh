#!/bin/bash

buildgram=true
compile=true
rungunit=true
runjasmine=true

while getopts 'gcrj' flag; do
  case "${flag}" in
    g) buildgram=false ;;
    c) compile=false ;;
    r) rungunit=false ;;
    j) runjasmine=false ;;
    *) error "Unexpected option ${flag}" ;;
  esac
done

# cp tests/* bin/

if [[ $buildgram = true ]]; then
echo "Building Antlr grammars"
java org.antlr.Tool src/vb/stil/*.g
fi
# java org.antlr.Tool src/vb/stil/*.g


if [[ $compile = true ]]; then
echo "Compiling..."
# TODO: make this platform agnostic
java -jar /Applications/eclipse/plugins/org.eclipse.jdt.core_*.jar -d bin/ -1.7 src/
fi

if [[ $rungunit = true ]]; then
echo "Running gunit tests..."
cd bin; java org.antlr.gunit.Interp ../gunit/Stil.gunit
java org.antlr.gunit.Interp ../gunit/StilChecker.gunit
fi

if [[ $runjasmine = true ]]; then
echo "Compiling with jasmine"
java -jar jasmin.jar gen/program.j
cd gen; java program
fi