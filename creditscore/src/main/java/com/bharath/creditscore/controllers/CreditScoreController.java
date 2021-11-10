package com.bharath.creditscore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.creditscore.model.CreditScore;
import com.bharath.creditscore.repos.CreditScoreRepo;

@RestController
public class CreditScoreController {

	@Autowired
	CreditScoreRepo repo;

	@GetMapping("/creditscores/{ssn}")
	public CreditScore getCreditScore(@PathVariable("ssn") String ssn) {
		return repo.findById(ssn).get();
	}
}
