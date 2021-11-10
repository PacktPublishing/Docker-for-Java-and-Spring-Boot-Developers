package com.bharath.creditscore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.creditscore.model.CreditScore;

public interface CreditScoreRepo extends JpaRepository<CreditScore, String>{

}
