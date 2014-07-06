echo "Generating code"
java -Dfile.encoding=UTF-8 -classpath bin vb.stil.Stil gunit/program.st
echo "Compiling with Jasmin"
java -jar jasmin.jar -d gen/ gen/program.j 

echo "==== RUNNING PROGRAM ===="
cd gen; java Program
echo "====      END        ===="