docker stop publisher
docker rm publisher
docker image rm publisher:0.0.1
docker build . -t publisher:0.0.1
docker run -p 8112:8112 --name publisher --network crm-network --network-alias alias-publisher --link crm-test-mysql -d publisher:0.0.1
