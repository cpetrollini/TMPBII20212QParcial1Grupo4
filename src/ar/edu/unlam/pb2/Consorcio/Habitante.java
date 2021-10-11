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

	public abstract void pagarFactura(Integer mes);
	//cambia el estado de una factura a pagada dependiendo del mes
	
	public abstract void buscarUnaFacturaPorMes(Integer mes);
	
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

	public Object getDni() {
		
		return dni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Habitante other = (Habitante) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	

}
