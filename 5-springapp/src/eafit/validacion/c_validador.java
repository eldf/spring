package eafit.validacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class c_validador {
	
	String nombre;
	String tipo;
	
	public List obtenerTipos(String dato) {
		
		List list = new ArrayList();
		list.add("buffer");
		/*list.add("interseccion");
		list.add("area colindante");
		list.add("sobreposicion");
		list.add("traslacion");
		list.add("linea");
		list.add("punto");
		list.add("poligono");
		list.add("area");
		list.add("demarcacion");
		list.add(dato);
		*/
		
		return list;
	}
	

	@Autowired
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Autowired
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "c_validador [nombre=" + nombre + "]";
	}
	
	
	

}
