package ar.edu.unlam.pb2.Consorcio;

import java.util.Iterator;

public class Inquilino extends Habitante {

	//
	private int contadorDelMes = 0;
	private static final Integer CANTIDAD_DE_VENCIMIENTOS = 3;
	private Departamento departamento;

	public Inquilino(Integer dni, String nombre, String apellido, Departamento deptoQueHabita,
			int duracionDelContratoEnMeses) {
		super(dni, nombre, apellido);
		this.departamento = deptoQueHabita;
	}

	@Override
	public Factura[] getFacturasAPagar() {
		Factura[] arrayDeFacturas = new Factura[12];
		for (int i = 0; i < this.departamento.getHistorialDeExpensas().length; i++) {
			if (this.departamento.getHistorialDeExpensas()[i] != null) {
				if (this.departamento.getHistorialDeExpensas()[i].getHabitante().getDni().equals(this.getDni())) {
					for (int j = 0; j < arrayDeFacturas.length; j++) {
						if (arrayDeFacturas[j] == null) {
							arrayDeFacturas[j] = this.departamento.getHistorialDeExpensas()[i];
						}
					}
				}
			}
		}
		super.setFacturasAPagar();
		return arrayDeFacturas;
	}

}
