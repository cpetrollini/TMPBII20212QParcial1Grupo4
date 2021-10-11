package ar.edu.unlam.pb2.Consorcio;

public class AdministracionConsorcio {

	private Habitante[] habitantes;
	private Departamento[] departamentos;
	private Departamento[] recibos;

	public AdministracionConsorcio() {
		this.departamentos = new Departamento[10];
		this.habitantes = new Habitante[10];
		this.recibos = new Departamento[10];
	}

	// INGRESAR UN RECIBO DE PAGO DE EXPENSAS
	public boolean ingresarRecibo(Integer numero, Integer piso) {
		boolean agregado = false;
		for (int i = 0; i < departamentos.length; i++) {

			if (departamentos[i] != null) {
				if (departamentos[i].getPiso().equals(piso) && departamentos[i].getNumero().equals(numero)) {
					if (departamentos[i].toString() != null) {
						recibos[i] = departamentos[i];
						agregado = true;

						break;
					}
				}
			}
		}

		return agregado;
	}

	// LISTADO DE RECIBOS
	public String toString() {
		String resumenDeExpensasPagadas = "";
		for (int i = 0; i < recibos.length; i++) {
			if (recibos[i] != null) {
				resumenDeExpensasPagadas += recibos[i].toString() + "\n";
			}
		}
		return resumenDeExpensasPagadas;
	}

	// NUMERO DE DEUDORES
	public Integer cuantosDptsDebenExpensas() {

		Integer deudores = 0;
		for (int i = 0; i < departamentos.length; i++) {

			if (departamentos[i] != null) {
				if (departamentos[i].getEstadoDeExpensa()) {
					deudores++;
				}
			}
		}
		return deudores;

	}

	// AGREGAR DEPARTAMENTO
	public boolean ingresarDepartamento(Departamento nuevo) {
		boolean agregado = false;
		if (!this.comprobarSiExisteUnDepartamento(nuevo)) {
			for (int i = 0; i < departamentos.length; i++) {
				if (departamentos[i] == null) {
					departamentos[i] = nuevo;
					agregado = true;
					break;
				}
			}
		}
		return agregado;
	}

	private boolean comprobarSiExisteUnDepartamento(Departamento buscado) {
		boolean encontrado = false;
		for (int i = 0; i < this.departamentos.length; i++) {
			if (departamentos[i] != null) {
				if (departamentos[i].getPiso().equals(buscado.getPiso())
						&& departamentos[i].getNumero().equals(buscado.getNumero())) {
					encontrado = true;
					break;
				}
			}
		}
		return encontrado;
	}

	

	// AGREGAR HABITANTES
	public boolean ingresarHabitante(Habitante nuevo) {
		boolean agregado = false;
		boolean repetido = false;

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

}