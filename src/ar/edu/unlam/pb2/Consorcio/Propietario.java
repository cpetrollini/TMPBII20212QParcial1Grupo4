package ar.edu.unlam.pb2.Consorcio;

public class Propietario extends Habitante {

	private Departamento[] deptosQuePosee;

	public Propietario(Integer dni, String nombre, String apellido) {
		super(dni, nombre, apellido);
		this.deptosQuePosee = new Departamento[10];
	}

	@Override
	public Factura[] getFacturasAPagar() {
		Factura[] arrayDeFacturasAPagar = new Factura[100];
		for (int i = 0; i < deptosQuePosee.length; i++) {
			if (deptosQuePosee[i] != null) {
				for (int j = 0; j < deptosQuePosee[i].getHistorialDeExpensas().length; j++) {
					if (deptosQuePosee[i].getHistorialDeExpensas()[j] != null) {
						if (deptosQuePosee[i].getHistorialDeExpensas()[j].getPagada() == false) {
							for (int k = 0; k < arrayDeFacturasAPagar.length; k++) {
								if (arrayDeFacturasAPagar[k] != null) {
									arrayDeFacturasAPagar[k] = deptosQuePosee[i].getHistorialDeExpensas()[j];
								}
							}
						}
					}
				}
			}
		}
		return arrayDeFacturasAPagar;
	}

	public Departamento[] getDeptosQuePosee() {
		return deptosQuePosee;
	}
	
	
}
