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
echo "Options: build (a)ntler - (c)ompile - (r)un tests - (g)enerate code - run (j)asmine"
if [[ $buildgram = true ]]; then
    echo "(a) Building ANTLR grammars"
    cd src/vb/stil/; java org.antlr.Tool *.g; cd ../../..;
fi
# java org.antlr.Tool src/vb/stil/*.g


if [[ $compile = true ]]; then
    echo "(c) Compiling..."
    ant
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
    echo "(g) Generating code and compile"
    java -jar stil.jar program.st
fi

if [[ $runjasmin = true ]]; then
    echo "==== RUNNING PROGRAM ===="
    cd gen; java Program
    echo "====      END        ===="
fi