package com.f4.hellopuppypayment.domain.example.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.f4.hellopuppypayment.domain.example.enums.PayType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="payment")
public class Payment {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "reserv_id")
	private Long reservId;
	
	@Column(name = "pay_type")
	@Enumerated(EnumType.STRING)
	private PayType payType;
	
	@Column(name = "pay_dt")
	private Date payDt;
	
	@Column(name = "pay_amt")
	private Long payAmt;
	
	@Column(name = "create_dt")
	private Date createDt;
	
	@Column(name = "update_dt")
	private Date updateDt;
	
}
