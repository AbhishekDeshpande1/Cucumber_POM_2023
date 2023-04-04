# Cucumber Selenium Test

The Automation scripts in this project are developed using the Cucumber (v 7.x.x) ,Selenium (v 4.x.x) , Junit v(5.x.x) BDD framework with Java as programming language. 
It generates Extent Spark Report and PDF Report.


## Installation (pre-requisites)
1. JDK 1.8+ (make sure Java class path is set)
2. Maven (make sure .m2 class path is set)
3. Eclipse
4. Eclipse Plugins for
   * Maven
   * Cucumber

## Setup

* Install dependencies  `` mvn install ``

# Test data 
* Go to project 
* Open project.properties
* Add browser name which you have installed in system
## Running your tests
* To run the test on open terminal 
* Go to project directory path 
* Enter command as : ``  mvn -Dtest=Test test  ``

## Reporters

### Extent PDF Report:
Generates Spark report at project directory path:  `` test-output/PdfReport ``

### Spark Extent Report:
Generates HTML report at project directory path:  `` test-output/SparkReport ``

### ScreenShots :
Capture Screenshot after successful scenario  at project directory path:  `` Screenshot ``
