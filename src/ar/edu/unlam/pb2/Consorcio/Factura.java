package ar.edu.unlam.pb2.Consorcio;

import java.util.Objects;

public class Factura {

	private Double valor;
	private static int MES; 
	private Integer mesDeLaFactura;
	private static int ANIO = 2021;
	private Departamento departamento;
	private Habitante habitante;
	private Boolean pagada;

	public Factura(Habitante habitante) {
		setMES(MES++);
		this.habitante = habitante;
		this.valor = this.departamento.valorActualDeLaExpensa();
		this.pagada = false;
		this.departamento = habitante.getDepartamento();
		this.mesDeLaFactura = MES;
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
		return MES;
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

	public static void setMES(int MES) {
		if(MES>=12) {
			Factura.MES = 1;
			Factura.ANIO++;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(mesDeLaFactura);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(mesDeLaFactura, other.mesDeLaFactura);
	}


	public Integer getMesDeLaFactura() {
		return mesDeLaFactura;
	}


	public void setMesDeLaFactura(Integer mesDeLaFactura) {
		this.mesDeLaFactura = mesDeLaFactura;
	}
	
	
	

}
