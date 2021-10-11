package ar.edu.unlam.pb2.Consorcio;

public class DosAmbientes extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer valorAPagarExpensas;
	

	public DosAmbientes(Integer piso, Integer numero, Boolean cochera) {
		super(piso, numero, cochera);

		this.montoTotalAPagarServicios = 0;
		this.pagoExtraordinario = pagoExtraordinario;
		this.valorAPagarExpensas = 0;

		super.setTipoDepartamento(TipoDeDepartamento.DOSAMBIENTES);
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

		this.valorAPagarExpensas += super.getVALOR_BASICO_EXPENSAS() + Departamento.getEXTRA_DOSAMBIENTES()
				+ this.montoTotalAPagarServicios;

		return this.valorAPagarExpensas;
	}
//
}
