package com.example.kafka.ksqldb.demo.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.ksqldb.demo.domain.Payment;
import com.example.kafka.ksqldb.demo.service.PaymentsService;

@RestController
@RequestMapping("payments-rest")
public class PaymentsController {
	
	private PaymentsService paymentsService;
	
	public PaymentsController(PaymentsService paymentsService) {
		this.paymentsService = paymentsService;
	}

	@PostMapping("/payment")
    public void sendPayment(@RequestBody Payment payment) {
		paymentsService.sendPayment(payment);
    }

}
