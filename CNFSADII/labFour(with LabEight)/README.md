## LAB 4+8 
- This is Fourth Program of Labset, but this readme only includes the method to run this in docker container by building image
- First create the project and make sure there is no error and runs locally without any issue
- Then in your preferred IDE, perform `maven clean` & `maven install`, and confirm if the jar file is generated in the `target` directory
- Make sure the Dockerfile is as mentioned in this root project directory
- Then Create image using this command:
    ```
        docker build -t <image-name-of-ur-choice> . 
    ```
- Run the created image as a container:
    ```
        docker run -p <your-preffered-port>:8080 -d <image-name-that-u-built>
    ```
    - `Given that your preffered port in host machince is free and available`
- Use postman or browser to access you rest api deployed in docker 