package com.viewnext.batchmicro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terminal {
	
	private int id;
	private String lugar;
	private int stock;
	private int stockReal;
	private int stockVirtual;
	private int codigo;
	private String nombre;
	
}
