package ar.edu.unlam.pb2.Consorcio;

public class Inquilino extends Habitante {

	//
	private int contadorDelMes = 0;
	private static final Integer CANTIDAD_DE_VENCIMIENTOS = 3;
	
	public Inquilino(Integer dni, String nombre, String apellido, Departamento deptoQueHabita, int duracionDelContratoEnMeses) {
		super(dni, nombre, apellido, deptoQueHabita);
		// TODO Auto-generated constructor stub
		
	}



	@Override
	public void pagarFactura(Integer mes) {
		Factura[] arrayDeFacturasAPagar = this.getFacturasAPagar();
		
	}

	@Override
	public void buscarUnaFacturaPorMes(Integer mes) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Factura[] getFacturasAPagar() {
		Factura[] arrayDeFacturas = new Factura[12];
		for (int i = 0; i < super.getDepartamento().getHistorialDeExpensas().length; i++) {
			if(super.getDepartamento().getHistorialDeExpensas()[i] != null) {
				if(super.getDepartamento().getHistorialDeExpensas()[i].getHabitante().getDni().equals(this.getDni())) {
					for (int j = 0; j < arrayDeFacturas.length; j++) {
						if(arrayDeFacturas[j] == null) {
						 arrayDeFacturas[j] = super.getDepartamento().getHistorialDeExpensas()[i];	
						}
					}
				}
			}
		}
		return arrayDeFacturas;
	}



	
	
	
	
	}


