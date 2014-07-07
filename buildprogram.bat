@ECHO OFF
java -Dfile.encoding=UTF-8 -cp bin;jasmin.jar;classpath/* vb.stil.Stil -no_jar program.st
pause