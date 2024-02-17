
This file includes some of the debug/error solution found to resolve certain situations
## General Tips
- The name of test bean xml should be "testBean.xml" , which is pre-defined and cannot be changed.
- Use the below xml tag for testBean file
    ```
    <beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans-3.1.xsd">
    ```
- Make sure the name mentioned in testBean file matches the application and class name created
- The Class(both main and supplementary) needs to in project application directory, testBean in resource directory
- Just read the class files and testbean for logic and needs

## In Docker Lab8:
- Make sure you create a network with custom ip subnet 
    ```
    sudo docker network create --gateway 192.168.1.1 --subnet 192.168.1.0/24 <network-name>
    ```
- Disable the host port 3306 
- Build the yaml file `sudo docker-compose build`
- Run the specific app `sudo docker-compose run <service-name>`
- Note: Confirm the service ip by using this command 
    ```
    sudo docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' <service-name>
    ```

`Note:These points maybe be incorrect`









