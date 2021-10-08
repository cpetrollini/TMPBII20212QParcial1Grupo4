package ar.edu.unlam.pb2.Consorcio;

public class DosAmbientes extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer PagoDeExpensas;
	private Integer valorAPagarExpensas;

	public DosAmbientes(Integer piso, Integer numero, Boolean cochera, Integer pagoExtraordinario) {
		super(piso, numero, cochera);

		this.montoTotalAPagarServicios = 0;
		this.pagoExtraordinario = pagoExtraordinario;
		this.valorAPagarExpensas = 0;

		super.setTipoDepartamento(TipoDeDepartamento.DOS_AMBIENTES);
	}

	public void serviciosComunesAPagar(Integer monto) {

		super.serviciosComunesAPagar(monto);

		this.montoTotalAPagarServicios = super.getServicioComunes() + this.pagoExtraordinario;
	}

	public Integer pagoDeExpensas(Integer pagoExpensas) {
		
	
		if (super.getCochera()) {
			this.valorAPagarExpensas += Departamento.getEXTRA_COCHERA();
		}
		this.valorAPagarExpensas= this.montoTotalAPagarServicios + super.getVALOR_BASICO_EXPENSAS()+ Departamento.getEXTRA_DOSAMBIENTES();
		this.valorAPagarExpensas-= pagoExpensas;

		return this.valorAPagarExpensas;

	}

	@Override
	public Integer getValorAPagarExpensas() {
		
       return pagoDeExpensas(0);

	}
	
	
	public Integer getValorCocheraAPagar() {
		Integer cochera = 0;

		if (super.getCochera()) {
			return Departamento.getEXTRA_COCHERA();
		}

		return cochera;

	}

	public Integer getPagoExtraordinario() {
		return pagoExtraordinario;
	}

	public void setPagoExtraordinario(Integer pagoExtraordinario) {
		this.pagoExtraordinario = pagoExtraordinario;
	}

	public Integer getMontoTotalAPagarServicios() {
		return montoTotalAPagarServicios;
	}

	public void setMontoTotalAPagarServicios(Integer montoTotalAPagarServicios) {
		this.montoTotalAPagarServicios = montoTotalAPagarServicios;
	}

	public Integer getValorPagoDeExpensas() {
		return PagoDeExpensas;
	}

	public void setValorPagoDeExpensas(Integer valorPagoDeExpensas) {
		this.PagoDeExpensas = valorPagoDeExpensas;
	}
}
