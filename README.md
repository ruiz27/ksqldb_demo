# ksqldb demo for payments

KSQL demo for payments events with microservice spring

![arch](arquitectura.png)

## Software pre requisites

- Kafka Server
- KSQLDB Server
- KSQLDB CLI
- JAVA 11  

The kafka components are included in docker-compose file

## Pre requisites

1. Open docker-compose.yml and check default values
2. In a console execute 

``` 
docker-compose up 
```

3. Start ksqldb cli 

``` 
docker exec -it ksqldb-cli ksql http://ksqldb-server:8088
```

4. Create stream

```
CREATE STREAM payments_stream (personId VARCHAR, idPayment VARCHAR, valuePayment DOUBLE)
  WITH (kafka_topic='payments_topic', value_format='json', partitions=1);
```

5. Start microservice 

## Test local

POST http://localhost:8080/payments-rest/payment

### Body

{
    "personId": "001",
    "idPayment": "123456",
    "valuePayment": "100"
}

### Query to validate 

2. In a console ksqldb cli execute  

``` 
ksql> select * from payments_stream where valuepayment = 100 emit changes;
```

## References

https://ksqldb.io/quickstart.html


