# ksqldb demo for payments

KSQL demo for payments events with microservice spring

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

## URL local

localhost:8080/payments-rest/payment

### Body

{
    "personId": "001",
    "idPayment": "123456",
    "valuePayment": "100"
}



