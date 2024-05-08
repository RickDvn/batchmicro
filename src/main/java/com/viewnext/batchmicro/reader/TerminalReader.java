package com.viewnext.batchmicro.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.viewnext.batchmicro.model.Terminal;

/**
 * Clase que maneja la lectura de los CSV
 */
public class TerminalReader {
	
	public static ArrayList<Terminal> readCSVsTerminal() {
		ArrayList<Terminal> terminales = new ArrayList<Terminal>();
		
		HashMap<String,String[]> datStocks = readStock();
		ArrayList<String[]> datTerminales = readTerminal();
		
		String[] stockTerminal;
		
		for (String[] dato : datTerminales) {
			stockTerminal = datStocks.get(dato[3]);
			
			if (stockTerminal != null) {
				terminales.add(new Terminal(Integer.parseInt(stockTerminal[1]), stockTerminal[0], Integer.parseInt(stockTerminal[2]),
						Integer.parseInt(stockTerminal[3]), Integer.parseInt(stockTerminal[4]), Integer.parseInt(dato[3]), dato[1]));
			}
		}
		
		return terminales;
	}
	
	
	private static HashMap<String,String[]> readStock() {
		HashMap<String,String[]> datos = new HashMap<>();
		String[] item;
		
		try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/data/local/stockTerminales.csv"));){
			while ((item = reader.readNext()) != null) {
				datos.put(item[1], item); // El item[1] corresponde con el id del stock
			}
		} catch (FileNotFoundException | CsvValidationException e) {
			e.printStackTrace();
		}  catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return datos;
	}
	
	private static ArrayList<String[]> readTerminal() {
		ArrayList<String[]> datos = new ArrayList<>();
		String[] item;
		
		try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/data/local/terminales.csv"));){
			while ((item = reader.readNext()) != null) {
				datos.add(item);
			}
		} catch (FileNotFoundException | CsvValidationException e) {
			e.printStackTrace();
		}  catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return datos;
	}
}
