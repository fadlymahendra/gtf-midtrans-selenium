# Prerequisites
1. Java 8 or higher 
2. Maven 3.x
3. Use Java JDK instead of JRE
4. Download Chrome driver and Chrome for Testing 121 version. For google chrome version 151 and above, please refer to this dashboard https://googlechromelabs.github.io/chrome-for-testing/
5. Before executing the tests, (Somehow) need to open the Chrome for Testing

# Usage
Fork or clone the repository:
``` git clone git@github.com:fadlymahendra/gtf-midtrans-selenium.git ```


# Navigate to the project directory:
``` cd gtf-midtrans-selenium```

# Run the tests with Maven:
``` mvn clean test ```

The tests will execute in parallel, and you can view the test results in the target/cucumber-reports directory.

# Customization
To adjust the level of parallelism, edit the testng.xml file and update the thread-count attribute to the desired number of threads:

``` <suite name="Cucumber Parallel Suite" verbose="1" parallel="tests" thread-count="5"> ```
You can also add or remove <test> elements in the testng.xml file to control the number of parallel test executions.

# Contributing
Feel free to submit issues or pull requests if you find any bugs or have suggestions for improvements.

# License
This project is licensed under the MIT License. See the LICENSE file for more information.

# Credit 
This test framework is cloned from https://github.com/naveenanimation20/Cucumber7.xTestNGLatestPOC

