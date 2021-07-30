package com.f4.hellopuppypayment.service.impl;

import org.springframework.stereotype.Service;

import com.f4.hellopuppypayment.domain.example.repository.impl.PaymentRepository;
import com.f4.hellopuppypayment.service.PaymentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

	private final PaymentRepository paymentRepository;
	
	/*
	 * @Override public List<Member> findAllMemberByTeamId(Long id) { // TODO
	 * Auto-generated method stub return alramRepository.findAllMemberByTeamId(id);
	 * }
	 */
	

}
