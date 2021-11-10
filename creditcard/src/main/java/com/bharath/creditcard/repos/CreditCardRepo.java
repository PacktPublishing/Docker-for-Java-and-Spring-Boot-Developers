package com.bharath.creditcard.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.creditcard.model.CreditCard;

public interface CreditCardRepo extends JpaRepository<CreditCard, String> {

}
