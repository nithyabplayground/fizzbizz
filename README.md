## Running the tests

* To run the unit tests, call `mvn test`
* To run the integration tests as well, call `mvn verify`
* Code coverage reports are generated when `mvn verify` (or a full `mvn clean install`) is called.

## Conventions

This example follows the following basic conventions:

| | unit test | integration test |
| --- | --- | --- |
| **resides in:** | `src/test/java/*Test.java` | `src/test/java/*IT.java` |
| **executes in Maven phase:** | test | verify |
| **handled by Maven plugin:** | [surefire](http://maven.apache.org/surefire/maven-surefire-plugin/) | [failsafe](http://maven.apache.org/surefire/maven-failsafe-plugin/) |
