package com.bharath.creditcard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bharath.creditcard.model.CreditCard;
import com.bharath.creditcard.model.CreditScore;
import com.bharath.creditcard.repos.CreditCardRepo;

@RestController
public class CreditCardController {

	@Autowired
	private CreditCardRepo repo;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/issueCard")
	public boolean issueCard(@RequestBody CreditCard card) {

		if (getScore(card.getSsn()) >= 700) {
			repo.save(card);
			return true;
		}
		return false;

	}

	private int getScore(String ssn) {
		CreditScore creditScore = restTemplate
				.getForObject("http://localhost:8080/creditscore/creditscores/" + ssn,
				CreditScore.class);
		return creditScore.getScore();
	}
}
