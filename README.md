# Basic Statistics

A Java-based implementation for computing statistics on a set of numbers.
This implementation is intended to be used in software engineering courses as
a subject software system.

How to build and test (from Terminal):

1. Make sure that you have Ant installed.

2. cd into the root directory, which contains the build.xml build file.

3. Run `ant` to compile.

4. Compiled java classes will be in the `bin` directory.

5. Run `ant test` to run all unit tests.

6. Whenever you want to clean up the project, run `ant clean`

How to run (from Terminal):

1. After building the project (i.e., running `ant`), cd into the `bin`
   directory and run: `java BasicStats`. The application's GUI should show up.

Program features:
* Displayed numbers
* Mean computation
* Median computation
* Mode computation
