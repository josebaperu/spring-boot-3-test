# spring-boot-3-test

local dev:
 - mvn clean install && docker compose up


remote :
 - docker pull hozyzufe/augmented-v3-userroles:latest
 - docker run -p 8000:8080 60272b6dd731

image_id taken from : docker images command -> 60272b6dd731


Go to:
http://localhost:8000/hello



