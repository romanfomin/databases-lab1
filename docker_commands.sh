# Print running containers
	docker ps -a

# Delete container by id
	docker rm CONTAINER_ID

##### Postgres ######################################

# Run container with postgres
	docker run -p 15432:5432 -d -e POSTGRES_PASSWORD=password postgres
# -p LOCAL_PORT:CONTAINER_PORT
# -d = detach
# -e specify env vars
# postgres - image

# Enter psql in container
# a)
	docker exec -it CONTAINER_ID bash
	psql -U postgres
# b)
	docker exec -it CONTAINER_ID psql -U postgres

# Create database
	create database lab1;

##### Mongo ######################################

# Run container with mongo
	docker run -p 27017:27017 -d mongo

# Enter mongo in container
# a)
	docker exec -it CONTAINER_ID bash
	psql -U mongo
# b)
	docker exec -it CONTAINER_ID mongo


##### MySQL #######################################

# Run container with mysql
docker run -p 13306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=password -d mysql:latest

# Enter mysql in container
docker exec -it CONTAINER_ID mysql -u root -p

# Create database
	create database lab1;


##### Oracle #######################################

# Run container with oracle
# download 18.3 zip from https://www.oracle.com/database/technologies/oracle-database-software-downloads.html
git clone https://github.com/oracle/docker-images
cd docker-images/OracleDatabase/SingleInstance/dockerfiles/18.3.0
mv ~/Downloads/LINUX.X64_180000_db_home.zip .
# Fix a small bug in Dockerfile, see https://github.com/oracle/docker-images/issues/1468
sed -i 's/V981623-01/LINUX.X64_180000_db_home/g' Dockerfile
docker build -t oracle/database:18.3.0 --build-arg DB_EDITION=EE .
docker run -d -it --rm --name oracle18 oracle/database:18.3.0

docker run -p 11521:1521 --name oracle -e ORACLE_PWD=password oracle/database:18.3.0
docker exec -it CONTAINER_ID bash
export ORACLE_SID=ORCLCDB
sqlplus sys as sysdba
# password

# JDBC driver for Oracle
#Download jar from https://www.oracle.com/database/technologies/appdev/jdbc-ucp-183-downloads.html
#From project directory run
mvn install:install-file -Dfile=/home/fomin/Downloads/ojdbc8.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=12.1.0 -Dpackaging=jar



docker run \
	-d \
	-p 15432:5432 \
	-e POSTGRES_PASSWORD=password \
	-v /home/fomin/Documents/itmo/master/DataBase/volumes/postgres-volume:/var/lib/postgresql/data \
	--name postgres-container \
	postgres