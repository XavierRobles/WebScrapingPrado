package entidad;

import java.util.List;

public class Artista {
	private String nombre;
	private List<Cuadro> obras;
	public Artista() {
		super();
	}
	public Artista(String nombre, List<Cuadro> obras) {
		super();
		this.nombre = nombre;
		this.obras = obras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Cuadro> getObras() {
		return obras;
	}
	public void setObras(List<Cuadro> obras) {
		this.obras = obras;
	}
	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", obras=" + obras + "]";
	}
	
	
	

}
