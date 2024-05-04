# Multi-project build

This test project is a "hierarchical" multi-project (or multi-module in the Maven world) build:
   - 100 projects
   - each project has 500 source files
   - inter-project dependencies simulate "real world" projects with "upper" projects depending on up-to 3 "lower level" projects
   
![Project dependencies](graph.png)

This allows us to test 2 different scenarios :

- making an ABI (application binary interface) breaking change in a low-level dependency
- making an ABI-compatible change in a low-level dependency
   
# Instructions
* Assuming you have installed `gradle-profiler`, as described in the top-level readme.
## For Gradle:
```
gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --gradle-version 8.7
# swith to your gradle version
```
* Problems
  * Problem1: "Execution failed for task ':project10:compileJava'"
    * Solution: TODO
* Open the .html generated under '/profile-out-4'

## For Apache Maven:

```
export MAVEN_HOME=/path/to/apache-maven
export MAVEN_OPTS="-Xms2g -Xmx2g"
# gradle-profiler gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --maven      -- wrong command duplicated gradle-profiler
gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --maven
```
* Problems:
  * Problem1: " Failed to execute goal on project project1: Could not resolve dependencies for project org.gradle:project1:jar:1.0-SNAPSHOT: "
    * Solution: TODO
* Open the .html generated under  profile-out-5


