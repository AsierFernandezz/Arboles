package main;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import objetos.Arbol;

public class GestorArboles {
	final int SALIR = 0;
	final int INSERTAR = 1;
	final int ELIMINAR = 2;
	final int UPDATE = 3;
	final int VISUALIZAR = 4;
	
	String host = "localhost:3307"; 
	String BBDD = "programacion";
	String usuario = "root";
	String contrasenia = "";
	
	
	public void run(ArrayList<Arbol> arboles)throws ParseException, ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		
		int opcion;
		
		do {
			menu();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case SALIR: 
				System.out.println("Saliendo del programa");
				break;
				
			case INSERTAR:
				insertarArbol();
				break;
				
			case UPDATE:
				update();
				break;
				
			case ELIMINAR:
				delete();
				break;
			
			case VISUALIZAR:
				ArrayList<Arbol> arbole = arboles();
				visualizarArboles(arboles);
				
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(opcion != SALIR);
	
		
	}
		
	private ArrayList<Arbol> arboles() throws SQLException, ClassNotFoundException{
		
		ArrayList<Arbol> arboles = new ArrayList();
		
		//cargar la libreria mysql conector
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//crear la conexion
		Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + BBDD, usuario, contrasenia);
		
		//Crear el statement
		Statement st =  conexion.createStatement();
		
		//Ejecutar la consulta y recibir el resultado
		ResultSet resultado= st.executeQuery("select * from tareas");
	
		while(resultado.next()) {
			Arbol arbol = new Arbol();
			arbol.setId(resultado.getInt("id"));
			arbol.setNombreComun("nombre");
			
			arboles.add(arbol);
		}
		
		return arboles;
		
	}
	
	public void visualizarArboles(ArrayList<Arbol> arboles) {
		for (Arbol arbol : arboles) {
			System.out.println(arbol);	
	}
}
	
	public void menu() {
			
		System.out.println("--Menu--");
		System.out.println(SALIR + "- Salir");
		System.out.println(INSERTAR + "- Insertar arbol");
		System.out.println(ELIMINAR + "- Eliminar arbol");
		System.out.println(UPDATE + "- Actualizar informacion del arbol");
		System.out.println(VISUALIZAR + "- Visualizar arboles");
	}
	
	public void insertarArbol() throws ClassNotFoundException, SQLException {
		//cargar la libreria mysql conector
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//crear la conexion
				Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + BBDD, usuario, contrasenia);
				
				//Crear el statement
				Statement st =  conexion.createStatement();
				
				String sql = ("INSERT INTO tareas(titulo, descripcion) VALUES ('titulo','descripcion')");
				
				
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
}
