# Basic Statistics

A Java-based implementation for computing statistics on a set of numbers.
This implementation is intended to be used in software engineering courses as
a subject software system.

How to build and run tests from the terminal:

1. Basic Statistics uses Apache Ant.  Make sure that you have Ant installed.  https://ant.apache.org/

2. cd into the Basic Statistics root directory, which contains the `build.xml` build file.

3. Run `ant` to compile Basic Statistics.

4. The compiled Basic Statistics class files will be in the `bin` directory.

5. Run `ant -lib lib/ test` to run all Basic Statistics unit tests.

6. Whenever you want to clean up the project, run `ant clean`

How to run Basic Statistics (from the terminal):

1. After building the project (i.e., running `ant`), cd into the `bin` directory and run: `java BasicStats`. The application's GUI will show up.

Program features:
* Displays a set of entered numbers.
* Computes the mean of the set of numbers.
* Computes the median of the set of numbers.
* Computes the mode of the set of numbers.
