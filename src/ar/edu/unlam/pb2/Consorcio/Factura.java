package ar.edu.unlam.pb2.Consorcio;

public class Factura {

	private Double valor;
	private static int mes; 
	private static int anio = 2021;
	private Departamento departamento;
	private Habitante habitante;
	private Boolean pagada;

	public Factura(Habitante habitante) {
		setMes(mes++);
		this.habitante = habitante;
		this.valor = this.departamento.valorActualDeLaExpensa();
		this.pagada = false;
		this.departamento = habitante.getDepartamento();
	}

	
	public Boolean getPagada() {
		return pagada;
	}


	public void setPagada(Boolean pagada) {
		this.pagada = pagada;
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


	public Double getValor() {
		return valor;
	}

	public static void setMes(int mes) {
		if(mes>=12) {
			Factura.mes = 1;
			Factura.anio++;
		}
	}
	
	
	
	

}
