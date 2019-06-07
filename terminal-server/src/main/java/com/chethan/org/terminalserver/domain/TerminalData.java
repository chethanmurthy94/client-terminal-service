package com.chethan.org.terminalserver.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TerminalData implements Serializable{

	private static final long serialVersionUID = 1408031136080520624L;
	@Id
	@GeneratedValue
	private String terminalId;
	private Integer sequenceNo;
	private Date timestamp;

}
