package ar.edu.unlam.pb2.Consorcio;

public class AdministracionConsorcio {

	//definir el comportamiento del consorcio
	//resumen de expensas: detalle de los importes de cada depto
//	que esta pago y que no, que deuda tiene c/u
	
	
	private Habitante[] habitantes;
	private Departamento[] departamentos;
	private Habitante[] habitantesConExpensasAlDia;
	private Factura[] archivo;

	public AdministracionConsorcio() {
		this.departamentos = new Departamento[4];
		this.habitantes = new Habitante[4];
		this.habitantesConExpensasAlDia = new Habitante[4];
	}
	
	public boolean agregarDepartamento(Departamento nuevo) {
		boolean agregado = false;
		for (int i = 0; i < departamentos.length; i++) {
			if (this.departamentos[i] != null) {
				this.departamentos[i] = nuevo;
				agregado = true;
				break;
			}
		}
		return agregado;
	}

	// crear recibo de pago a un depto

	public boolean agregarReciboAlArchivo(Factura reciboNuevo) {
		boolean agregado = false;
		for (int i = 0; i < archivo.length; i++) {
			if (this.archivo[i] == null) {
				this.archivo[i] = reciboNuevo;
				agregado = true;
			}
		}
		return agregado;
	}

	// AGREGAR DEPARTAMENTO SIN REPETIDOS
	public boolean ingresarDepartamento(Departamento nuevo) {
		boolean agregado = false;
		boolean repetido = false;

		for (int i = 0; i < departamentos.length; i++) {
			if (departamentos != null) {
				if (departamentos[i].getPiso().equals(nuevo.getPiso())
						&& departamentos[i].getNumero().equals(nuevo.getNumero())) {
					repetido = true;
					break;
				}
			}
		}

		for (int i = 0; i < departamentos.length; i++) {
			if (departamentos[i] == null && repetido == false) {
				departamentos[i] = nuevo;
				agregado = true;
				break;
			}
		}
		return agregado;
	}

	// AGREGAR HABITANTES SIN REPETIDOS
	public boolean ingresarHabitante(Habitante nuevo) {
		boolean agregado = false;
		boolean repetido = false;

		for (int i = 0; i < habitantes.length; i++) {
			if (habitantes != null) {
				if (habitantes[i].getDni().equals(nuevo.getDni())) {
					repetido = true;
					break;
				}
			}
		}

		for (int i = 0; i < habitantes.length; i++) {
			if (habitantes[i] == null && repetido == false) {
				habitantes[i] = nuevo;
				agregado = true;
				break;
			}
		}
		return agregado;
	}

	// BUSCAR DEPARTAMENTO POR PISO Y NUMERO
	public Departamento buscarDpt(Integer piso, Integer numero) {
		Departamento encontrado = null;

		for (int i = 0; i < departamentos.length; i++) {

			if (departamentos[i] != null) {
				if (departamentos[i].getPiso().equals(piso) && departamentos[i].getNumero().equals(numero)) {
					encontrado = departamentos[i];
					break;
				}
			}
		}
		return encontrado;
	}

	// BUSCAR HABITANTES POR DNI
	public Habitante buscarHabitante(Integer dni) {
		Habitante encontrado = null;
		for (int i = 0; i < habitantes.length; i++) {
			if (habitantes[i] != null) {
				if (habitantes[i].getDni().equals(dni)) {
					encontrado = habitantes[i];
					break;
				}
			}
		}
		return encontrado;
	}
	
	public Departamento[] getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}

}
