package ar.edu.unlam.pb2.Consorcio;

public class AdministracionConsorcio {

	private Habitante[] habitantes;
	private Departamento[] departamentos;

	private Habitante[] habitantesConExpensasAlDia; // y esto, como se hace?

	private Recibo[] resumenDeExpensas;

	Recibo recibo;
	Departamento departamento;
	Habitante habitante;

	public AdministracionConsorcio(Departamento departamento, Habitante habitante, Recibo recibo) {
		this.departamentos = new Departamento[4];
		this.habitantes = new Habitante[4];
		this.habitantesConExpensasAlDia = new Habitante[4];
		this.recibo = recibo;
		this.habitante = habitante;
		this.departamento = departamento;
	}

	// INGRESAR UN RECIBO DE PAGO DE EXPENSAS SIN REPETIDOS----> da una
	// excepcion!!!!
	public boolean ingresarRecibo(Recibo reciboPagado) {
		boolean agregado = false;
		boolean repetido = false;

		for (int i = 0; i < resumenDeExpensas.length; i++) {
			if (resumenDeExpensas[i] != null) {
				if (resumenDeExpensas[i].getHabitante().getDni().equals(reciboPagado.getHabitante().getDni())) {
					repetido = true;
					break;
				}
			}
		}

		for (int i = 0; i < resumenDeExpensas.length; i++) {
			if (resumenDeExpensas[i] == null && repetido == false) {
				resumenDeExpensas[i] = reciboPagado;
				agregado = true;
				break;
			}
		}
		return agregado;
	}

	// LISTADO DE EXPENSAS ----> da una excepcion!!!!
	public String toString() {
		String resumenDeExpensasPagadas = "";
		for (int i = 0; i < resumenDeExpensas.length; i++) {
			if (resumenDeExpensas[i] != null) {
				resumenDeExpensasPagadas += i + "-" + resumenDeExpensas[i].getValor() + "\n";
			}
		}
		return resumenDeExpensasPagadas;
	}

	// LISTADO DE EXPENSAS (se recorre en el main con un FOR)
	public Recibo[] getlistadodDeExpensas() {
		return resumenDeExpensas;
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

}
