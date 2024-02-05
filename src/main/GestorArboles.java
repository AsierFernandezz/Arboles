package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	
	public void run()throws ParseException, ClassNotFoundException, SQLException {
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
				Arbol arbol = new Arbol();
				System.out.println("Dame el nombre común del árbol");
				arbol.setNombreComun(scan.nextLine());
				
				System.out.println("Dime el nombre cientifico del arbol");
				arbol.setNombreCientifico(scan.nextLine());
				
				System.out.println("Dime el habitat");
				arbol.setHabitat(scan.nextLine());
				
				System.out.println("Dime la altura");
				arbol.setAltura(Integer.parseInt(scan.nextLine()));
				
				System.out.println("Dime el origen");
				arbol.setOrigen(scan.nextLine());
				
				
				
				insertarArbol(arbol);
				break;
				
			case UPDATE:
				update();
				break;
				
			case ELIMINAR:
				delete();
				break;
			
			case VISUALIZAR:
				ArrayList<Arbol> arbole = arboles();
				visualizarArboles(arbole);
				break;
				
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
		ResultSet resultado= st.executeQuery("select * from arboles");
	
		while(resultado.next()) {
			Arbol arbol = new Arbol();
			arbol.setId(resultado.getInt("id"));
			arbol.setNombreComun("nombre_comun");
			
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
	
	public void insertarArbol(Arbol arbol) throws ClassNotFoundException, SQLException {
			Scanner scan = new Scanner(System.in);	
			
			
				//cargar la libreria mysql conector
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//crear la conexion
				Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + BBDD, usuario, contrasenia);
			
	
				String sql = "INSERT INTO arboles(nombre_comun, nombre_cientifico, habitat, altura, origen) VALUES (?,?,?,?,?)";
				
				PreparedStatement pst =  conexion.prepareStatement(sql);
				pst.setString(1, arbol.getNombreComun());
				pst.setString(2, arbol.getNombreCientifico());
				pst.setString(3, arbol.getHabitat());
				pst.setInt(4, arbol.getAltura());
				pst.setString(5, arbol.getOrigen());
				
				pst.executeUpdate(sql);
				
				
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
}
