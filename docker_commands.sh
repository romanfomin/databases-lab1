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
docker login container-registry.oracle.com
docker run --name oracle -e ORACLE_PWD=password container-registry.oracle.com/database/standard:latest



docker run \
	-d \
	-p 15432:5432 \
	-e POSTGRES_PASSWORD=password \
	-v /home/fomin/Documents/itmo/master/DataBase/volumes/postgres-volume:/var/lib/postgresql/data \
	--name postgres-container \
	postgres
