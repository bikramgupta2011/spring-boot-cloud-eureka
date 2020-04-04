package com.bikram.spring.euraka.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shopping")
public class FlipkartShoppingController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{amount}")
	public String getOrderDetail(@PathVariable("amount") int amount) {
		return this.restTemplate.getForObject("http://PAYMENT-SERVICE/payment/"+amount, String.class);
	}
}
