package com.viewnext.batchmicro.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.batchmicro.model.Terminal;
import com.viewnext.batchmicro.service.TerminalService;
import com.viewnext.batchmicro.service.TerminalServiceImpl;

/**
 * Controller de los terminales, se accede con: " localhost:8080/terminales "
 */
@RestController
@RequestMapping("/terminales")
public class TerminalController {
	
	private static final Logger log = LoggerFactory.getLogger(TerminalController.class);
	
	private TerminalService terminalService = new TerminalServiceImpl();
	
	/**
	 * Peticion get del controller para obtener todo el catalogo de terminales, se accede con: " localhost:8080/terminales/getCatalogo "
	 * 
	 * @return los valores
	 */
	@GetMapping(value = "/getCatalogo")
	public List<Terminal> getTerminales(){
		log.info("Acceso a Catalogo");
		
		return terminalService.getterminales();
	}
}
