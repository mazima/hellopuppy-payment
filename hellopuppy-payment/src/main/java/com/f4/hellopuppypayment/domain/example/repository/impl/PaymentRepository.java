package com.f4.hellopuppypayment.domain.example.repository.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f4.hellopuppypayment.domain.example.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
	
	//List<Payment> findAllMemberByTeamId(Long id);

}
