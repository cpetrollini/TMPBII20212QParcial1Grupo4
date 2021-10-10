package ar.edu.unlam.pb2.Consorcio;

public abstract class Departamento {

	private Integer piso;
	private Integer numero;
	private Boolean cochera;
	private Integer VALOR_BASICO_EXPENSAS = 2000;
	private Integer EXTRA_COCHERA = 2000;
	private Integer EXTRA_MONOAMBIENTE = 1000;
	private Integer EXTRA_DOSAMBIENTES = 2000;
	private Integer EXTRA_TRESAMBIENTES = 3000;
	private Integer servicioComunes;// luz y agua
	private TipoDeDepartamento tipoDepartamento;

	public Departamento(Integer piso, Integer numero, Boolean cochera) {
		this.piso = piso;
		this.numero = numero;
		this.cochera = cochera;
		this.servicioComunes = 0;

	}

//----------------------------------------------------------------------------
	public abstract Integer valorExpensasAPagar();
	
	public abstract Boolean getPagoDelHabitante();
	
	public abstract Boolean getEstadoDeExpensa();

	public void serviciosComunesAPagar(Integer monto) {
		this.servicioComunes = monto;
	}

//-----------------------------------------------------------------------------
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

//-----------------------------------------------------------------

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
		return this.VALOR_BASICO_EXPENSAS;
	}

	public void setVALOR_BASICO_EXPENSAS(Integer vALOR_BASICO_EXPENSAS) {
		this.VALOR_BASICO_EXPENSAS = vALOR_BASICO_EXPENSAS;
	}

	public Integer getEXTRA_COCHERA() {
		return this.EXTRA_COCHERA;
	}

	public void setEXTRA_COCHERA(Integer eXTRA_COCHERA) {
		this.EXTRA_COCHERA = eXTRA_COCHERA;
	}

	public Integer getEXTRA_MONOAMBIENTE() {
		return this.EXTRA_MONOAMBIENTE;
	}

	public void setEXTRA_MONOAMBIENTE(Integer eXTRA_MONOAMBIENTE) {
		EXTRA_MONOAMBIENTE = eXTRA_MONOAMBIENTE;
	}

	public Integer getEXTRA_DOSAMBIENTES() {
		return EXTRA_DOSAMBIENTES;
	}

	public void setEXTRA_DOSAMBIENTES(Integer eXTRA_DOSAMBIENTES) {
		EXTRA_DOSAMBIENTES = eXTRA_DOSAMBIENTES;
	}

	public Integer getEXTRA_TRESAMBIENTES() {
		return EXTRA_TRESAMBIENTES;
	}

	public void setEXTRA_TRESAMBIENTES(Integer eXTRA_TRESAMBIENTES) {
		EXTRA_TRESAMBIENTES = eXTRA_TRESAMBIENTES;
	}

	public Integer getServicioComunes() {
		return servicioComunes;
	}

	public void setServicioComunes(Integer servicioComunes) {
		this.servicioComunes = servicioComunes;
	}

	public TipoDeDepartamento getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(TipoDeDepartamento tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}

//
}
