package com.chethan.org.validationclient.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.chethan.org.validationclient.domain.TerminalData;

@Component
@FeignClient(name = "${terminal.server.name}")
public interface ValidationClientServiceProxy {
	@GetMapping(value="/userTerminal/management/terminal", produces= "application/json")
	TerminalData getTerminalData();	
	
	

}
