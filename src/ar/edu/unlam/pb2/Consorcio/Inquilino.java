package ar.edu.unlam.pb2.Consorcio;

public class Inquilino extends Habitante {

	//
	private int contadorDelMes = 0;
	private static final Integer CANTIDAD_DE_VENCIMIENTOS = 3;
	
	public Inquilino(Integer dni, String nombre, String apellido, Departamento deptoQueHabita, int duracionDelContratoEnMeses) {
		super(dni, nombre, apellido, deptoQueHabita);
		// TODO Auto-generated constructor stub
		
	}

	
	public static Integer getDeposito() {
		return deposito;
	}

	public static void setDeposito(Integer deposito) {
		Inquilino.deposito = deposito;
	}


	@Override
	public void pagarFactura() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Factura[] getFacturasAPagar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	}


