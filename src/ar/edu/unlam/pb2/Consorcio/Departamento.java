package ar.edu.unlam.pb2.Consorcio;

public abstract class Departamento {

	private Integer piso;
	private Integer numero;
	private Boolean cochera;
	private final Integer VALOR_BASICO_EXPENSAS = 2000;
	private Integer servicioComunes;// luz y agua

	private TipoDeDepartamento departamento;

	public Departamento(Integer piso, Integer numero, Boolean cochera) {

		this.piso = piso;
		this.numero = numero;
		this.cochera = cochera;
		this.servicioComunes = 0;

	}

	public abstract Integer PagoDeExpensas();

	public void serviciosComunesAPagar(Integer monto) {
		this.servicioComunes = monto;
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

	public Integer getServicioComunes() {
		return servicioComunes;
	}

	public void setServicioComunes(Integer servicioComunes) {
		this.servicioComunes = servicioComunes;
	}

	public TipoDeDepartamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(TipoDeDepartamento departamento) {
		this.departamento = departamento;
	}
//
}
