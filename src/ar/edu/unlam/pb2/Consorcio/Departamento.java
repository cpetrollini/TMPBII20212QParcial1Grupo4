package ar.edu.unlam.pb2.Consorcio;

public abstract class Departamento {

	private Integer piso;
	private Integer numero;
//	private Boolean habitado;
	private Habitante habitante;
	private Integer cantidadDeAmbientes;
	private Boolean cochera; // 5%
	private Double expensaBase;
	private Double extraordinario;
	 
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public Boolean isHabitado() {
		Boolean habitado = false;
		if(this.habitante != null) {
			habitado = true;
		}
		return habitado;
	}

	public abstract Double valorDeExpensas();
	

	
}
