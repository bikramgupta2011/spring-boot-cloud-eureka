package com.bikram.spring.euraka.payment.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/{amount}")
	public String getPaymentDetail(@PathVariable("amount") int amount) {
		return "Payment "+amount+" successful on port :"+ this.port;
	}

}
