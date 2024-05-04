# A single, medium project
This test project is a single, medium project, containing 5000 source files.

# Instructions
* Assuming you have installed `gradle-profiler`, as described in the top-level readme.

## For Gradle:
```
gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --gradle-version 8.7
# swith to your gradle version
```
* Open the .html generated under '/profile-out-3'

## For Apache Maven:
```
export MAVEN_HOME=/path/to/apache-maven
export MAVEN_OPTS="-Xms2g -Xmx2g"
# gradle-profiler gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --maven    -- wrong command duplicated gradle-profiler
gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --maven
```
* Problems:
  * Problem1: "Target option 1.5 is no longer supported. Use 1.6 or later"
    * Note: == 'single-large-project'