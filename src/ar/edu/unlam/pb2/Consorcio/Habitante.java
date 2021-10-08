package ar.edu.unlam.pb2.Consorcio;

public class Habitante {

	// si es de tipo inquilino tiene un contrato por x cantidad de meses

	private Integer dni;
	private String nombre;
	private String apellido;

	private TipoDeDepartamento departamento;

	private Boolean EstadoDeExpensas;
	// private TipoDeHabitante tipo;

	public Habitante(Integer dni, String nombre, String apellido, TipoDeDepartamento departamento,
			Boolean estadoDeExpensas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		EstadoDeExpensas = estadoDeExpensas;
	}

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

	public TipoDeDepartamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(TipoDeDepartamento departamento) {
		this.departamento = departamento;
	}

	public Boolean getEstadoDeExpensas() {
		return EstadoDeExpensas;
	}

	public void setEstadoDeExpensas(Boolean estadoDeExpensas) {
		EstadoDeExpensas = estadoDeExpensas;
	}

}
