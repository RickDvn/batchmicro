package com.viewnext.batchmicro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viewnext.batchmicro.model.Terminal;
import com.viewnext.batchmicro.reader.TerminalReader;

@Service
public class TerminalServiceImpl implements TerminalService {

	@Override
	public List<Terminal> getterminales() {
		List<Terminal> terminales;
		terminales = TerminalReader.readCSVsTerminal();
		return terminales;
	}

}
