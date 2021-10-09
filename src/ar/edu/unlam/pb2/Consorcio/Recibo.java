package ar.edu.unlam.pb2.Consorcio;

public class Recibo {

	private Integer valorExpensa;
	private Integer mes;
	private Departamento departamento;
	private Habitante habitante;

	public Recibo(Departamento departamento, Habitante habitante) {
		this.valorExpensa = valorExpensa;
		this.mes = mes;
		this.habitante = habitante;
		setValor(departamento.pagoDeExpensas());

	}

	public Integer getValor() {
		return valorExpensa;
	}

	public void setValor(Integer valor) {
		this.valorExpensa = valor;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Habitante getHabitante() {
		return habitante;
	}

	public void setHabitante(Habitante habitante) {
		this.habitante = habitante;
	}

}
