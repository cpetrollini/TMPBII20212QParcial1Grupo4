package ar.edu.unlam.pb2.Consorcio;

public class Recibo {
	
	// desde aca armar el precio de la cochera y las expensas del dpto que posee el habitante
	private Double valor;
	private Integer mes; //cual mes del contrato es
	private Departamento departamento;
	private Habitante habitante;
	
	public Recibo(Double valor, Integer mes, Departamento departamento, Habitante habitante) {
		super();
		this.valor = valor;
		this.mes = mes;
		this.habitante = habitante;
	}
	
	

	public Double getPrecio() {
		return valor;
	}

	public void setPrecio(Double precio) {
		this.valor = precio;
	}

	public Integer getMes() {
		return mes;
	}

	public Habitante getHabitante() {
		return habitante;
	}

	public void setHabitante(Habitante habitante) {
		this.habitante = habitante;
	}
	
	
	
	
}
