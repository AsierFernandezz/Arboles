package objetos;

import java.util.Date;

public class Arbol {
	private int id;
	private String nombreComun;
	private String nombreCientifico;
	private int Id_habitat;
	private int altura;
	private String origen;
	private String fecha_encontrado;
	private Boolean nombre_singular;
	
	
	public Arbol() {
		
	}
	
	public Arbol(int id, String nombreComun, String nombreCientifico, int habitat, int altura, String origen) {
		this.id = id;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
		this.Id_habitat = habitat;
		this.altura = altura;
		this.origen = origen;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreComun() {
		return nombreComun;
	}
	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public int getId_Habitat() {
		return Id_habitat;
	}
	public void setId_Habitat(int habitat) {
		this.Id_habitat = habitat;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getFecha_encontrado() {
		return fecha_encontrado;
	}

	public void setFecha_encontrado(String fecha_encontrado) {
		this.fecha_encontrado = fecha_encontrado;
	}

	public Boolean getNombre_singular() {
		return nombre_singular;
	}

	public void setNombre_singular(Boolean nombre_singular) {
		this.nombre_singular = nombre_singular;
	}

	@Override
	public String toString() {
		return "Arbol [id=" + id + ", nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico
				+ ", Id_habitat=" + Id_habitat + ", altura=" + altura + ", origen=" + origen + "]";
	}


	}
	
	

