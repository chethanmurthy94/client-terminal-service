package com.chethan.org.terminalserver.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chethan.org.terminalserver.dao.TerminalRepository;
import com.chethan.org.terminalserver.domain.TerminalData;

@RestController
@RequestMapping(value = {"/userTerminal/management/"})
public class TerminalServerController {
	
	@Autowired
	private TerminalRepository terminalRepository;
	
	@GetMapping(value = "/terminal", produces = { "application/json", "application/xml" })
	public TerminalData getTerminalData() {
		TerminalData terminalData=new TerminalData();
		terminalData.setTerminalId("1001");
		terminalData.setSequenceNo(1);
		terminalData.setTimestamp(new Date());
		
		terminalRepository.save(terminalData);
		return terminalRepository.findOne("1001");
		}
	
	
}
