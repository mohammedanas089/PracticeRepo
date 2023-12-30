This file includes some of the debug/error solution found to resolve certain situations

- The name of test bean xml should be "testBean.xml" , which is pre-defined and cannot be changed.
- Use the below xml tag for testBean file
    ```
    <beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans-3.1.xsd">
    ```
- Make sure the name mentioned in testBean file matches the application and class name created
- The Class(both main and supplementary) needs to in project application directory, testBean in resource directory


`These points maybe be incorrect`









