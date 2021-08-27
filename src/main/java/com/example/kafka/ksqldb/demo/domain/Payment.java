package com.example.kafka.ksqldb.demo.domain;

public class Payment {

	private String personId;
	private String idPayment;
	private String valuePayment;
	
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(String idPayment) {
		this.idPayment = idPayment;
	}
	public String getValuePayment() {
		return valuePayment;
	}
	public void setValuePayment(String valuePayment) {
		this.valuePayment = valuePayment;
	}
	
	
}
