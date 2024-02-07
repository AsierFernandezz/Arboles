package objetos;

import java.sql.Date;

public class Arbol {
	private int id;
	private String nombreComun;
	private String nombreCientifico;
	private int Id_habitat;
	private int altura;
	private String origen;
	private String fecha_encontrada;
	private String singular;
	private Habitat habitat;
	
	
	public Arbol() {
		
	}
	
	public Arbol(int id, String nombreComun, String nombreCientifico, int Id_habitat, int altura, String origen, String fecha_encontrada, String singular) {
		this.id = id;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
		this.Id_habitat = Id_habitat;
		this.altura = altura;
		this.origen = origen;
		this.fecha_encontrada = fecha_encontrada;
		this.singular = singular;
	}
	
	public String getFecha_encontrada() {
		return fecha_encontrada;
	}

	public void setFecha_encontrada(String fecha_encontrada) {
		this.fecha_encontrada = fecha_encontrada;
	}

	public String getSingular() {
		return singular;
	}

	public void setSingular(String singular) {
		this.singular = singular;
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
	public void setId_Habitat(int Id_habitat) {
		this.Id_habitat = Id_habitat;
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
	

	public int getId_habitat() {
		return Id_habitat;
	}

	public void setId_habitat(int id_habitat) {
		Id_habitat = id_habitat;
	}

	public Habitat getHabitat() {
		return habitat;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Arbol [id=" + id + ", nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico
				+ ", habitat=" + Id_habitat + ", altura=" + altura + ", origen=" + origen + "]";
	}
	
	
}
