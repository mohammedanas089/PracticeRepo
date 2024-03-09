Steps to execute Lab Nine(This is just a guidance,  tweak it as required)
- Create a docker network
    ```
        docker network create --gateway 192.168.1.1 --subnet 192.168.1.0/24 <any-network-name>
    ```
    `Note the network name and IP class should match the one's in Docker-compose file`
- Create dockerfile and docker-compose
- Run only sql service of docker-compose and launch spring app in local mode(from eclipse or other IDE)
    ```
        docker-compose up <mysql-service-name>
    ```
    - `Note the spring app configuration is to connect to docker's mysql such as`:
        - url, dbname, user and password. As specified in docker-compose file to be present in application.properties
    - Once the working is guaranteed, create a jar file out of it
        - `Right Click -> Run as -> Maven Install`
- Now build the Docker-compose
    ```
        docker-compose build
    ```
- Run the spring app in docker 
    ```
        docker-compose run <spring-app-service-name>
    ```