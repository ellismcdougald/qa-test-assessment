# README

Name: Ellis McDougald / Contact: ecmcdougald@gmail.com

This is my submission for the technical assessment for the Co-Op Automation Test Engineer at Resolver. It contains the six requested tests written in Java using the JUnit5 framework with Selenium Webdriver.

## Prerequisites

- Java JDK 17 or newer
- [Maven](https://maven.apache.org/install.html)
- Google Chrome

## Clone the Repo

```bash
git clone https://github.com/ellismcdougald/qa-test-assessment.git
cd qa-test-assessment
```

## Run Tests

To run all the tests, use:

```bash
mvn test
```

To run an individual test, e.g. Test1, use:

```bash
mvn test -Dtest=Test1
```

Note that tests are currently configured to run in headless mode. This can be disabled by setting `headless` to `false` in `AbstractTest.java`.
