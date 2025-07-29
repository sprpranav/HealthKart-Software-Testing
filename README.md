# HealthKart Portal Testing

This project involves comprehensive testing of the HealthKart e-commerce web portal using various testing methodologies and tools to ensure functionality, performance, and reliability.

## Overview

HealthKart is an online shopping portal for health and wellness products. The testing process covers functional validation, load testing, and manual testing to identify and fix bugs, improve user experience, and guarantee smooth operations.

## Testing Approaches

### 1. Manual Testing
- Performed exploratory and regression testing across various modules.
- Verified UI elements, workflows, form validations, and error handling.
- Documented bugs and inconsistencies for further development fixes.

### 2. Selenium IDE
- Created and executed automated test scripts for repetitive functional tests.
- Recorded user actions on the portal and replayed them for regression testing.
- Validated critical user journeys like user login, product search, cart management, and checkout.

### 3. Selenium WebDriver with TestNG and Page Object Model (POM)
- Developed automated tests using Selenium WebDriver for dynamic interaction with web elements.
- Managed test execution and reporting with the TestNG framework.
- Structured test code using the Page Object Model (POM) design pattern to improve maintainability.
- Automated critical features including:
  - **Search Bar** functionality testing.
  - **Filter and Sort** options validation.
  - Verification of **Product View and Description**.
  - **Add to Cart** functionality testing.
  - Verification of **Icon Visibility** for important UI elements.

### 4. JMeter
- Conducted load testing to evaluate performance under various user loads.
- Simulated multiple concurrent users to test server response time and stability.
- Analyzed throughput, latency, and error rates to ensure scalability.

## Tools Used
- **Selenium IDE:** Browser-based record and playback tool for automation testing.
- **Selenium WebDriver:** Browser automation tool for dynamic web testing.
- **TestNG:** Java testing framework for managing test cases and generating reports.
- **JMeter:** Open-source tool for performance and load testing.
- **Manual Testing:** Exploratory and structured test case execution.

## Project Outcome
- Identified functional bugs and UI glitches which were reported and fixed.
- Assessed the HealthKart portal’s ability to handle peak traffic loads effectively.
- Ensured overall improved user experience and system reliability.

## How to Run Tests

- **Selenium IDE:** Open the Selenium IDE plugin in the browser, load the recorded test suite, and run.
- **Selenium WebDriver with TestNG:** Execute TestNG test suites via your IDE or build tools like Maven.
- **JMeter:** Import the test plan `.jmx` file in JMeter, configure thread groups, and execute load tests.
- **Manual Testing:** Follow documented test cases and verify results against expected outcomes.

## Future Enhancements
- Implement continuous integration with automated test runs.
- Extend test coverage with advanced Selenium WebDriver scripting.
- Integrate performance monitoring tools for real-time insights.

---

*This testing project demonstrates a multi-faceted approach to ensure the quality and performance of the HealthKart e-commerce portal.*

