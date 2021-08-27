package com.example.kafka.ksqldb.demo.service;

import com.example.kafka.ksqldb.demo.domain.Payment;

public interface PaymentsService {

	public void sendPayment(Payment payment);
}
