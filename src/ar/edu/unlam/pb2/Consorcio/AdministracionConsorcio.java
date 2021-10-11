package ar.edu.unlam.pb2.Consorcio;

public class AdministracionConsorcio {

	// definir el comportamiento del consorcio
	// resumen de expensas: detalle de los importes de cada depto
//	que esta pago y que no, que deuda tiene c/u

	private Habitante[] habitantes;
	private Departamento[] departamentos;
	private Habitante[] habitantesConExpensasAlDia;
	private Factura[] archivo;

	public AdministracionConsorcio() {
		this.departamentos = new Departamento[10];
		this.habitantes = new Habitante[10];
		this.habitantesConExpensasAlDia = new Habitante[10];
	}

	public Habitante[] filtrarHabitantesConExpensasAlDia() {
		for (int i = 0; i < this.habitantes.length; i++) {
			if (this.habitantes[i] != null) {
				if (this.habitantes[i].getDepartamento() != null) {
					if (this.habitantes[i].getDepartamento().isAlDia()) {
						for (int j = 0; j < this.habitantesConExpensasAlDia.length; j++) {
							if (this.habitantesConExpensasAlDia[j] == null) {
								this.habitantesConExpensasAlDia[j] = this.habitantes[i];
							}

						}
					}
				}
			}
		}
		return this.habitantesConExpensasAlDia;
	}

	// crear recibo de pago a un depto

	public boolean emitirNuevaFactura(Departamento dpto) {
		boolean agregado = false;
		boolean yaExiste = false;

		Factura facturaNueva = new Factura(dpto);
		for (int i = 0; i < archivo.length; i++) {
			if (this.archivo[i].getCodFactura().equals(facturaNueva.getCodFactura())) {
				yaExiste = true;
				break;
			}
		}
		if (!yaExiste) {
			for (int i = 0; i < archivo.length; i++) {
				if (this.archivo[i] == null) {
					this.archivo[i] = facturaNueva;
					agregado = true;
				}
			}
		}
		return agregado;
	}
	
//	private boolean comprobarSiUnaFacturaYaFueEmitida() {
//		return false;
//	}
	
	public Integer cuantosDptsDebenExpensas() {
        Integer deudores = 0;
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] != null) {
                if (!departamentos[i].getAlDia()) {
                    deudores++;
                }
            }
        }
        return deudores;

    }
	

	// AGREGAR DEPARTAMENTO SIN REPETIDOS
	public boolean ingresarDepartamento(Departamento nuevo) {
		boolean agregado = false;
		if (!this.comprobarSiExisteUnDepartamento(nuevo)) {
			for (int i = 0; i < departamentos.length; i++) {
				if (departamentos[i] == null) {
					departamentos[i] = nuevo;
					for (int j = 0; j < nuevo.getPropietario().getDeptosQuePosee().length; j++) {
						if (nuevo.getPropietario().getDeptosQuePosee()[j] == null) {
							nuevo.getPropietario().getDeptosQuePosee()[j] = nuevo;
						}
					}
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

	// AGREGAR HABITANTES SIN REPETIDOS
	public boolean ingresarHabitante(Habitante nuevo, Departamento dtoQueHabita) {
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
				dtoQueHabita.setHabitante(nuevo);
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

	public Habitante[] getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(Habitante[] habitantes) {
		this.habitantes = habitantes;
	}

	public Habitante[] getHabitantesConExpensasAlDia() {
		return habitantesConExpensasAlDia;
	}

	public void setHabitantesConExpensasAlDia(Habitante[] habitantesConExpensasAlDia) {
		this.habitantesConExpensasAlDia = habitantesConExpensasAlDia;
	}

	public Factura[] getArchivo() {
		return archivo;
	}

	public void setArchivo(Factura[] archivo) {
		this.archivo = archivo;
	}

}
