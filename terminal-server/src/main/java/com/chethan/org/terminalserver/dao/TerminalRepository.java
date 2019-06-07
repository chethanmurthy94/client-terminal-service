package com.chethan.org.terminalserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chethan.org.terminalserver.domain.TerminalData;

public interface TerminalRepository  extends JpaRepository<TerminalData, String>{

}
