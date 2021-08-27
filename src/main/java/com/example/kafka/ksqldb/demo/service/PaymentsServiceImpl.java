package com.example.kafka.ksqldb.demo.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.kafka.ksqldb.demo.domain.Payment;
import com.example.kafka.ksqldb.demo.producer.KafkaMessageProducer;


@Service
public class PaymentsServiceImpl implements PaymentsService {

	private KafkaMessageProducer kafkaMessageProducer;
	
	public PaymentsServiceImpl(KafkaMessageProducer kafkaMessageProducer) {
		super();
		this.kafkaMessageProducer = kafkaMessageProducer;
	}

	@Override
	public void sendPayment(Payment payment) {
		JSONObject jo = new JSONObject(payment);
		kafkaMessageProducer.sendMessage("payments_topic",jo.toString());
	}

}
