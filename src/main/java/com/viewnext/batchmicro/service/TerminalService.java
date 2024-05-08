package com.viewnext.batchmicro.service;

import java.util.List;

import com.viewnext.batchmicro.model.Terminal;

/**
 * Interfac para los Terminales
 */
public interface TerminalService {
	
	/**
	 * Este metodo obtiene todos los terminales de los ficheros CSV y los devuelve
	 * 
	 * @return List<Terminal> los terminales de los ficheros
	 */
	public List<Terminal> getterminales();
	
}
