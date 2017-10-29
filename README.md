# Basic Statistics

Basic Statistics is a Java-based implementation for computing statistics on a set of numbers.
This implementation is intended to be used in software engineering courses as
a subject software system.

Basic Statistics uses the Apache Ant build system. **Make sure that you have [Ant](https://ant.apache.org) installed.**

#### How to build Basic Statistics and run its tests from the terminal:

1. Change into the Basic Statistics root directory, which contains the *build.xml* build file.

3. Run `ant` to compile Basic Statistics.

4. The compiled Basic Statistics class files will be in the `bin` directory.

5. Run `ant -lib lib/ test` to run all Basic Statistics unit tests.

6. Whenever you want to clean up the project, run `ant clean`

How to run Basic Statistics (from the terminal):

1. After building the project (i.e., running `ant`), cd into the `bin` directory and run: `java BasicStats`. The application's GUI will show up.

#### Program features:
* Displays a set of entered numbers.
* Computes the mean of the set of numbers.
* Computes the median of the set of numbers.
* Computes the mode of the set of numbers.

## Troubleshooting

#### Outdated version of JUnit
If your system uses an outdated version of JUnit, you may encounter the following error:
```
[junit] junit/framework/JUnit4TestAdapterCache
[junit] java.lang.NoClassDefFoundError: junit/framework/JUnit4TestAdapterCache
```
Run `ant -lib lib/ <target>` to explicitly use JUnit4, which is provided in the *lib* directory. For example, run `ant -lib lib/ test` to run all Basic Statistics unit tests.

#### Java JDK not installed or misconfigured
If a Java JDK is not installed or properly configured on your system, you may encounter the following error: 
```
BUILD FAILED
build.xml:17 Unable to find a javac compiler;
```
Make sure that you have a JDK installed and that the JAVA_HOME environment variable is properly set.
