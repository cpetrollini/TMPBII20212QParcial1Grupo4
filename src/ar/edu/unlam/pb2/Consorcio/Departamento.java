package ar.edu.unlam.pb2.Consorcio;

public class Departamento {

	private Integer piso;
	private Integer numero;
	private Boolean cochera;
	private static Integer VALOR_BASICO_EXPENSAS = 2000;
	private static Integer EXTRA_COCHERA = 2000;
	private static Integer EXTRA_MONOAMBIENTE = 10;
	private static Integer EXTRA_DOSAMBIENTES = 20;
	private static Integer EXTRA_TRESAMBIENTES = 30;
	private Double valorAPagarExpensas;
	private Integer porcentajeExtraPorDepartamento;
	private Boolean alDia;
	private TipoDeDepartamento tipoDepartamento; 
	private Propietario propietario;
	private Habitante habitante;
	private Double valorActual;
	private Factura[] historialDeExpensas = new Factura[12];

	public Departamento(Integer piso, Integer numero, Boolean cochera, int cantidadDeAmbientes, Propietario propietario) {
		this.piso = piso;
		this.numero = numero;
		this.cochera = cochera;
		this.tipoDepartamento = this.definirTipo(cantidadDeAmbientes);
		this.propietario = propietario;
	}

	private TipoDeDepartamento definirTipo(int cantidadDeAmbientes) {
		TipoDeDepartamento tipo = null;
		switch (cantidadDeAmbientes) {
		case 1:
			tipo = TipoDeDepartamento.MONOAMBIENTE;
			this.porcentajeExtraPorDepartamento = Departamento.EXTRA_MONOAMBIENTE;
			break;
		case 2:
			tipo = TipoDeDepartamento.DOSAMBIENTES;
			this.porcentajeExtraPorDepartamento = Departamento.EXTRA_DOSAMBIENTES;
			break;
		case 3:
			tipo = TipoDeDepartamento.TRESAMBIENTES;
			this.porcentajeExtraPorDepartamento = Departamento.EXTRA_TRESAMBIENTES;
			break;
		}
		return tipo;
	}

	public Double valorActualDeLaExpensa() {
		this.valorActual = (double) (Departamento.VALOR_BASICO_EXPENSAS
				+ Departamento.VALOR_BASICO_EXPENSAS * this.porcentajeExtraPorDepartamento / 100.0);
		if (this.cochera) {
			this.valorActual += Departamento.EXTRA_COCHERA;
		}
		return this.valorActual;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean getCochera() {
		return cochera;
	}

	public void setCochera(Boolean cochera) {
		this.cochera = cochera;
	}

	public Integer getVALOR_BASICO_EXPENSAS() {
		return VALOR_BASICO_EXPENSAS;
	}

	public void setVALOR_BASICO_EXPENSAS(Integer vALOR_BASICO_EXPENSAS) {
		VALOR_BASICO_EXPENSAS = vALOR_BASICO_EXPENSAS;
	}

	public TipoDeDepartamento getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(TipoDeDepartamento departamento) {
		this.tipoDepartamento = departamento;
	}

	public static Integer getEXTRA_COCHERA() {
		return EXTRA_COCHERA;
	}

	public static void setEXTRA_COCHERA(Integer eXTRA_COCHERA) {
		EXTRA_COCHERA = eXTRA_COCHERA;
	}

	public static Integer getEXTRA_MONOAMBIENTE() {
		return EXTRA_MONOAMBIENTE;
	}

	public static void setEXTRA_MONOAMBIENTE(Integer eXTRA_MONOAMBIENTE) {
		EXTRA_MONOAMBIENTE = eXTRA_MONOAMBIENTE;
	}

	public static Integer getEXTRA_DOSAMBIENTES() {
		return EXTRA_DOSAMBIENTES;
	}

	public static void setEXTRA_DOSAMBIENTES(Integer eXTRA_DOSAMBIENTES) {
		EXTRA_DOSAMBIENTES = eXTRA_DOSAMBIENTES;
	}

	public static Integer getEXTRA_TRESAMBIENTES() {
		return EXTRA_TRESAMBIENTES;
	}

	public static void setEXTRA_TRESAMBIENTES(Integer eXTRA_TRESAMBIENTES) {
		EXTRA_TRESAMBIENTES = eXTRA_TRESAMBIENTES;
	}

	
	public void verificarSiEstaAlDia() {
		Boolean estaAlDia = true;
		for (int i = 0; i < historialDeExpensas.length; i++) {
			if (historialDeExpensas[i] != null) {
				if (this.historialDeExpensas[i].getPagada()) {
					estaAlDia = false;
					break;
				}
			}
		}
		this.alDia = estaAlDia;
	}

	public Boolean isAlDia() {
		return this.alDia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((piso == null) ? 0 : piso.hashCode());
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
		Departamento other = (Departamento) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (piso == null) {
			if (other.piso != null)
				return false;
		} else if (!piso.equals(other.piso))
			return false;
		return true;
	}

	public Factura[] getHistorialDeExpensas() {
		return historialDeExpensas;
	}

	public void setHistorialDeExpensas(Factura[] historialDeExpensas) {
		this.historialDeExpensas = historialDeExpensas;
	}

	public Habitante getTitular() {
		Habitante titular = this.propietario;
		if(this.habitante == null) {
		}else {
			titular = this.habitante;
		}
		return titular;
	}

	public void setHabitante(Habitante habitante) {
		this.habitante = habitante;
	}

	public Double getValorAPagarExpensas() {
		return valorAPagarExpensas;
	}

	public void setValorAPagarExpensas(Double valorAPagarExpensas) {
		this.valorAPagarExpensas = valorAPagarExpensas;
	}

	public Boolean getAlDia() {
		return alDia;
	}

	public void setAlDia(Boolean alDia) {
		this.alDia = alDia;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	public String toString() {
        String resumenDeExpensasPagadas = "";
        for (int i = 0; i < historialDeExpensas.length; i++) {
            if (historialDeExpensas[i] != null) {
            	if(historialDeExpensas[i].getPagada()) {
            		resumenDeExpensasPagadas += historialDeExpensas[i].toString() + "\n";
            	}
            }
        }
        return resumenDeExpensasPagadas;
    }
	
	
//
}
