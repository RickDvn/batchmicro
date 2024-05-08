package com.viewnext.batchmicro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.batchmicro.model.Terminal;
import com.viewnext.batchmicro.service.TerminalService;

/**
 * Controller de los terminales, se accede con: " localhost:8080/terminales "
 */
@RestController
@RequestMapping("/terminales")
public class TerminalController {
	
	@Autowired
	private TerminalService terminalService;
	
	@GetMapping(value = {"", "/"})
	public List<Terminal> getTerminales(){
		return terminalService.getterminales();
	}
}
