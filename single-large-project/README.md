# A single, large project
This test project is a single, large project, containing 50000 source files.

# Instructions
* Assuming you have installed `gradle-profiler`, as described in the top-level readme.
## For Gradle:

```
gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --gradle-version 8.7
# swith to your gradle version
```
* Open the .html generated under '/profile-out-9'

## For Apache Maven:

```
export MAVEN_HOME=/path/to/apache-maven
export MAVEN_OPTS="-Xms2g -Xmx2g"
# gradle-profiler gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --maven   -- wrong command duplicated gradle-profiler
gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --maven
```
* Problems
  * Problem1: "java.lang.IllegalArgumentException: Unknown scenario 'gradle-profiler' requested. Available scenarios are: nonAbiChange"
    * Solution: `gradle-profiler` was duplicated
  * Problem2: "Target option 1.5 is no longer supported. Use 1.6 or later"
    * Attempt1: Update org.apache.maven.plugins:maven-compiler-plugin v3.1.0
    * Attempt2: Update org.apache.maven.plugins:maven-compiler-plugin v1.11.0
    * Attempt3: Comment the configuration
    * Attempt4: `.. --maven 3.1`
    * Solution: TODO:
* Open the .html generated under '/profile-out-12'
