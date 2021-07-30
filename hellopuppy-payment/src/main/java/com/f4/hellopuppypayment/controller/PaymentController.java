package com.f4.hellopuppypayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.f4.hellopuppypayment.service.PaymentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/payment")
@AllArgsConstructor
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	/*
	 * @GetMapping("/members/teams/{teamId}") public ResponseEntity<List<Alram>>
	 * getTeamMember(@PathVariable Long teamId) { return null; //return
	 * ResponseEntity.ok().body(alramService.findAllMemberByTeamId(teamId)); }
	 */

}
