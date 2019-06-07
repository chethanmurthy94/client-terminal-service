package com.chethan.org.validationclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chethan.org.validationclient.domain.TerminalData;
import com.chethan.org.validationclient.service.ValidationClientService;

@RestController
public class ValidationClientController {
	
	@Autowired
	private ValidationClientService validationClientService;
	@GetMapping(value="/terminal")
	public TerminalData getTerminalInformation() {
		return validationClientService.getTerminalInformation();
	}
	
	
	
}
