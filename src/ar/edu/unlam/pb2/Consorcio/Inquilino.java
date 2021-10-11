package ar.edu.unlam.pb2.Consorcio;

import java.util.Iterator;

public class Inquilino extends Habitante {

	private Departamento departamento;

	public Inquilino(Integer dni, String nombre, String apellido) {
		super(dni, nombre, apellido);
	}

	@Override
	public Factura[] getFacturasAPagar() {
		Factura[] arrayDeFacturas = new Factura[12];
		if (this.departamento != null) {
			for (int i = 0; i < this.departamento.getHistorialDeExpensas().length; i++) {
				if (this.departamento.getHistorialDeExpensas()[i] != null) {
					if (this.departamento.getHistorialDeExpensas()[i].getTitular().getDni().equals(this.getDni())) {
						for (int j = 0; j < arrayDeFacturas.length; j++) {
							if (arrayDeFacturas[j] == null) {
								arrayDeFacturas[j] = this.departamento.getHistorialDeExpensas()[i];
							}
						}
					}
				}
			}
		}
		return arrayDeFacturas;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
