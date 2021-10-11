package ar.edu.unlam.pb2.Consorcio;

import java.util.Objects;

public class Factura {

	private Double valor;
	private static Integer COD_FACTURA;
	private Integer codFactura;
	private Departamento departamento;
	private Habitante titular;
	private Boolean pagada;

	public Factura(Departamento departamento) {
		this.setCodFactura(COD_FACTURA);
		COD_FACTURA++;
		this.titular = departamento.getTitular();
		this.valor = departamento.valorActualDeLaExpensa();
		this.pagada = false;
		this.departamento = departamento;
		
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

	public Habitante getTitular() {
		return titular;
	}

	public void setTitular(Habitante titular) {
		this.titular = titular;
	}

	public Double getValor() {
		return valor;
	}

	public static Integer getCOD_FACTURA() {
		return COD_FACTURA;
	}
 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFactura == null) ? 0 : codFactura.hashCode());
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
		Factura other = (Factura) obj;
		if (codFactura == null) {
			if (other.codFactura != null)
				return false;
		} else if (!codFactura.equals(other.codFactura))
			return false;
		return true;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getCodFactura() {
		return codFactura;
	}

	public void setCodFactura(Integer codFactura) {
		this.codFactura = codFactura;
	}

	
}
