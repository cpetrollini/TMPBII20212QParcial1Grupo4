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

}
