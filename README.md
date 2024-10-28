
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | YINGTONG ZHOU              |
| Date         | 10/26/2024                 |
| Course       | Fall                       |
| Assignment # | 3                          |

# Assignment Overview
Assignment 3 requires developing an email generation system that generates and sends customized email messages to different types of customers. Each customer type, such as Business, Returning, Frequent, New, and VIP customers, receives a unique email message tailored to their specific needs. This notification system enables businesses to maintain meaningful communication with customers and enhances customer engagement.

# GitHub Repository Link:
https://github.com/hanatuse/cs-665-assignment-3

# Assumptions
- Each customer type receives a specific email with customized content:
    - **Business Customers**: Receive a partnership acknowledgment email.
    - **Returning Customers**: Receive a welcome-back message that mentions their recent purchase.
    - **Frequent Customers**: Receive a loyalty discount code.
    - **New Customers**: Receive a welcome offer.
    - **VIP Customers**: Receive an exclusive offer along with VIP support contact information.
- Email customization is achieved through different `Email` implementations for each customer type.
- Customer types are created using a factory pattern, ensuring flexibility and maintainability.

# Implementation Description

- **Flexibility of Implementation**:  
  The implementation is designed with flexibility in mind, allowing easy addition of new customer types or email variations. The `CustomerFactory` class is used to create instances of each customer type, and each customer has its own associated email type. This setup allows adding new customer types or modifying email content without affecting the core system, adhering to the Open/Closed Principle.

- **Simplicity and Understandability**:  
  The system is designed with clear separation of responsibilities. Each customer type has its own class with specific email generation logic, making the code modular and easy to understand. The `CustomerFactory` handles customer instantiation, making the main logic cleaner and easier to follow. This modular design makes the codebase accessible for other developers to read and maintain.

- **Avoidance of Duplicated Code**:  
  The use of the `Customer` abstract class and specific `Email` implementations helps avoid code duplication. Each customer type’s email logic is encapsulated in its respective class, and common fields (e.g., `name`, `email`) are defined in the `Customer` abstract class, following the DRY (Don't Repeat Yourself) principle.

- **Design Patterns Used**:  
  The implementation leverages the **Factory Method Pattern** to handle the creation of customer instances based on customer type. Additionally, the **Strategy Pattern** is utilized via the `Email` interface to define different email generation strategies for each customer type. These patterns enhance the flexibility, scalability, and maintainability of the system.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




