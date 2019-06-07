package com.chethan.org.validationclient.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class TerminalData implements Serializable {
	

	private static final long serialVersionUID = 2170721854644739481L;
	private String terminalId;
	private Integer sequenceNo;
	private Date timestamp;

}
