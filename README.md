Stil
==============
##Simple and Tranquil Imperative Language

### Compilation
Compiling is done with ANT. Make sure this is installed by following the steps on http://ant.apache.org/manual/install.html

Open a shell in the root directory of the stil project and run:
```
$ ant
```

### Running tests
STIL includes two sets of tests: GUnit for gramatical tests and a custom code generation testing framework.
Running GUnit tests:
__OSX/UNIX:__
```
$ cd bin
$ java -cp classpath/antlr.jar:. org.antlr.gunit.Interp ../gunit/Stil.gunit
$ java -cp classpath/antlr.jar:. org.antlr.gunit.Interp ../gunit/StilChecker.gunit
$ cd ..
```
__Windows:__
```
$ cd bin
$ java -cp ..\classpath\*;. org.antlr.gunit.Interp ..\gunit\Stil.gunit
$ java -cp ..\classpath\*;. org.antlr.gunit.Interp ..\gunit\StilChecker.gunit
$ cd ..
```
### Compiling and Running Stil Programs
A still program consists of one .st file. This is compiled to a jasmin .j file which in turn is assembled to a class file (both stored in the gen/ folder).

Compilation and running is done by editing program.st in the root directory and running:

__OSX/UNIX:__
```
$ ./buildprogram.sh
$ ./runprogram.sh
```
__Windows:__
```
$ buildprogram.bat
$ runprogram.bat
```
