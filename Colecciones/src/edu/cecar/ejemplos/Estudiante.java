package edu.cecar.ejemplos;

public class Estudiante implements Comparable<Estudiante>{
	
	private String identificacion;
	private String nombres;
	private String apellidos;
	private String programa;
	
	
	public Estudiante(String identificacion, String nombres, String apellidos, String programa) {
		
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.programa = programa;
	}

    
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		return true;
	}



	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getPrograma() {
		return programa;
	}


	public void setPrograma(String programa) {
		this.programa = programa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return identificacion + " " + nombres + " " + apellidos;
	}



	@Override
	public int compareTo(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudiante.getNombres().compareTo(this.nombres);
	}

}
