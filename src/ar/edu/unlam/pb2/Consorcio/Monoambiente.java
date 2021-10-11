package ar.edu.unlam.pb2.Consorcio;

public class Monoambiente extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer valorAPagarExpensas;
	
	

	public Monoambiente(Integer piso, Integer numero, Boolean cochera, Integer pagoExtraordinario) {
		super(piso, numero, cochera);

		this.montoTotalAPagarServicios = 0;
		this.pagoExtraordinario = pagoExtraordinario;
		this.valorAPagarExpensas = 0;
		super.setTipoDepartamento(TipoDeDepartamento.MONOAMBIENTE);
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

		this.valorAPagarExpensas += super.getVALOR_BASICO_EXPENSAS() + Departamento.getEXTRA_MONOAMBIENTE()
				+ this.montoTotalAPagarServicios;

		return this.valorAPagarExpensas;
	}
//
}
