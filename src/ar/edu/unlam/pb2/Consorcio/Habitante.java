package ar.edu.unlam.pb2.Consorcio;

public class Habitante {

	private Integer dni;
	private String nombre;
	private String apellido;
// FALSE : EXPENSA PAGADA, TRUE: DEBE 
	private Boolean estadoDeExpensas;

	public Habitante(Integer dni, String nombre, String apellido, Boolean estadoDeExpensas) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoDeExpensas = estadoDeExpensas;

	}

	// DONDE PONER EL RECIBO

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Boolean getEstadoDeExpensas() {
		return estadoDeExpensas;
	}

	public void setEstadoDeExpensas(Boolean estadoDeExpensas) {
		this.estadoDeExpensas = estadoDeExpensas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Habitante other = (Habitante) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

}
