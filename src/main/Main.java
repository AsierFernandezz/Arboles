package main;

import java.sql.SQLException;
import java.text.ParseException;

public class Main {
	
	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
		
		GestorArboles ga = new GestorArboles();
		ga.run();
	}
}
