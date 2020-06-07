package com.bharath.ws.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentProcessorRequest {

	@XmlElement(name = "creditCardInfo", required = true)
	private CreditCardInfo creditCardInfo;
	@XmlElement(name = "amount")
	private Double amount;

	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
