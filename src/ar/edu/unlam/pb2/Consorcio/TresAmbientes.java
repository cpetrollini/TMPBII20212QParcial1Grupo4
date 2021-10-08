package ar.edu.unlam.pb2.Consorcio;

public class TresAmbientes extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer valorAPagarExpensas;

	public TresAmbientes(Integer piso, Integer numero, Boolean cochera, Integer pagoExtraordinario) {
		super(piso, numero, cochera);

		this.montoTotalAPagarServicios = 0;
		this.pagoExtraordinario = pagoExtraordinario;
		this.valorAPagarExpensas = 0;

		super.setTipoDepartamento(TipoDeDepartamento.TRES_AMBIENTES);

	}

	@Override
	public void serviciosComunesAPagar(Integer monto) {

		super.serviciosComunesAPagar(monto);

		this.montoTotalAPagarServicios = super.getServicioComunes() + this.pagoExtraordinario;
	}

	@Override
	public Integer PagoDeExpensas() {

		if (super.getCochera()) {
			this.valorAPagarExpensas += Departamento.getEXTRA_COCHERA();
		}

		this.valorAPagarExpensas += super.getVALOR_BASICO_EXPENSAS() + Departamento.getEXTRA_TRESAMBIENTES()
				+ this.montoTotalAPagarServicios;

		return this.valorAPagarExpensas;
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

	public Integer getValorAPagarExpensas() {
		return valorAPagarExpensas;
	}

	public void setValorAPagarExpensas(Integer valorAPagarExpensas) {
		this.valorAPagarExpensas = valorAPagarExpensas;
	}

}
