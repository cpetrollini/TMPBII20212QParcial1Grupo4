package ar.edu.unlam.pb2.Consorcio;

public class AdministracionConsorcio {
	
	private Habitante[] habitantes;
	private Departamento[] departamentos;
	private Habitante[] habitantesConExpensasAlDia;
	private Recibo[] resumenDeExpensas;
	
	public AdministracionConsorcio() {
		this.departamentos = new Departamento [4];
		this.habitantes = new Habitante[4];
		this.habitantesConExpensasAlDia = new Habitante[4];
	}

	public boolean agregarDepartamento(Departamento nuevo) {
		boolean agregado = false;
		for (int i = 0; i < departamentos.length; i++) {
			if(this.departamentos[i]!=null) {
				this.departamentos[i] = nuevo;
				agregado = true;
				break;
			}
		}
	return agregado;
	}
	
	
	
	
}
