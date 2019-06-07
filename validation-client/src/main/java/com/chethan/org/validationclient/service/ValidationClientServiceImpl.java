package com.chethan.org.validationclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chethan.org.validationclient.domain.TerminalData;
import com.chethan.org.validationclient.feign.ValidationClientServiceProxy;

@Service
public class ValidationClientServiceImpl implements ValidationClientService {
	@Autowired
	private ValidationClientServiceProxy validationClientServiceProxy;

	@Override
	public TerminalData getTerminalInformation() {
		// TODO Auto-generated method stub
		return validationClientServiceProxy.getTerminalData();
	}

}
