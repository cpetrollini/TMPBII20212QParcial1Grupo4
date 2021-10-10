package ar.edu.unlam.pb2.Consorcio;

public class AdministracionConsorcio {

	private Habitante[] habitantes;
	private Departamento[] departamentos;

//	private Habitante[] habitantesConExpensasAlDia; // y esto, como se hace?

	private Departamento[] recibos;
	
//	ESTE ARRAY TODAVIA NO TIENE METODO QUE LO UTILICE, PERO cuantosDebenExpensas() YA GUARDO QUE DPT DEBEN EN ESTE ATRIBUTO
	private Departamento[] debeExpensas; 

	public AdministracionConsorcio() {
		this.departamentos = new Departamento[10];
		this.habitantes = new Habitante[10];
		this.recibos = new Departamento[10];
		this.debeExpensas = new Departamento[10];

	}

	// INGRESAR UN RECIBO DE PAGO DE EXPENSAS SIN REPETIDOS----> da una
	// excepcion!!!!
	// ESTE ES UN PROBLEMA DE LOGICA, PORQUE SOLO RECIBE UN PAGO POR HABITANTE
	// NO ES NECESARIO EL REPETIDO PORQUE NO ESTAMOS TOMANDO PAGO POR FECHAS
	// EL REPETIDO EN ESTE CASO (REIBO) PUEDE OCURRIR

	public boolean ingresarRecibo(Integer numero, Integer piso) {
		boolean agregado = false;
		for (int i = 0; i < departamentos.length; i++) {

			if (departamentos[i] != null) {
				if (departamentos[i].getPiso().equals(piso) && departamentos[i].getNumero().equals(numero)) {
					recibos[i] = departamentos[i];
					agregado = true;

					break;
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

	// LISTADO DE EXPENSAS (se recorre en el main con un FOR)
//	public Recibo[] getlistadodDeExpensas() {
//		return resumenDeExpensas;
//	}
//	for (int i = 0; i < departamentos.length; i++) {
//	if (departamentos != null) {
//		if (departamentos[i].getPiso().equals(nuevo.getPiso())
//				&& departamentos[i].getNumero().equals(nuevo.getNumero())) {
//			repetido = true;
//			break;
//		}
//	}
//}
	
//	NUMERO DE DEUDORES
	public Integer cuantosDptsDebenExpensas() {

		Integer deudores=0;
		for (int i = 0; i < departamentos.length; i++) {

			if (departamentos[i] != null) {
				if (departamentos[i].getEstadoDeExpensa()) {
					debeExpensas[i] = departamentos[i];
					deudores++; 
				}
			}
		}
		return deudores;

	}

	// AGREGAR DEPARTAMENTO SIN REPETIDOS
	public boolean ingresarDepartamento(Departamento nuevo) {
		boolean agregado = false;
		boolean repetido = false;

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

}