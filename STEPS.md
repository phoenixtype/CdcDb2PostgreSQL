# STEPS


- Create a new spring boot project using the spring initializer: https://start.spring.io/
- Run the IBM/DB2 in a docker container: https://hub.docker.com/r/ibmcom/db2
  - While running on a mac (M2 chip - linux/arm64/v8) the following command worked for me:
    - `docker run --platform linux/amd64 ibmcom/db2`
    - `docker-compose up -d`
  - You can use the following command to check the status of the container:
    - `docker ps`
  - Access the shell, if required with: `docker exec -it mydb2 bash`
  - To enter into the Database from the shell: `su - db2inst1`
  - Start the database manager: `db2start`
  - Create a database: `db2 create database <database name>`
  - Connect to the database: `db2 connect to <database name>`
  - To view the database table: `db2 "SELECT * FROM <table name>`

- Run the PostgreSQL in a docker container: https://hub.docker.com/_/postgres
    - `docker-compose up -d` (from the root of the project) when using a docker-compose file
  - You can use the following command to check the status of the container:
    - `docker ps`
  - Access the postgreSQL shell, if required with: `docker exec -it postgres psql -U postgres`
  - To enter into the postgreSQL Database from the shell: `psql -U postgres`
  - Start the postgreSQL database: `CREATE DATABASE <database name>;`
  - Create a postgreSQL database: 
  - Connect to the database: 
  - To view the database table: 

  
