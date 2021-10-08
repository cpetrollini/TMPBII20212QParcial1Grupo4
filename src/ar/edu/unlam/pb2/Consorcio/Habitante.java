package ar.edu.unlam.pb2.Consorcio;

public abstract class Habitante {

	private Integer dni;
	private String nombre;
	private String apellido;
	private Boolean EstadoDeExpensas;
	private Departamento departamento;

	public Habitante(Integer dni, String nombre, String apellido, Departamento deptoQueHabita) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = deptoQueHabita;
	}

	public abstract void pagarFactura();
	//cambia el estado de una factura a pagada, si es un inquilino o un inquilino se
	
	public abstract Factura[] getFacturasAPagar();
	//obtiene las facturas a pagar. en la clase inquilino se va a sobreescribir el metodo filtrando solo las 
	//facturas que corresponden a los meses de su contrato, por lo tanto, un inquilino solo puede pagar las
	//facturas que le corresponden
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

}
