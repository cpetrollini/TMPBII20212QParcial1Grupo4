package ar.edu.unlam.pb2.Consorcio;

public class DosAmbientes extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer valorAPagarExpensas;
	Habitante habitante;

	public DosAmbientes(Integer piso, Integer numero, Boolean cochera, Integer pagoExtraordinario,
			Habitante habitante) {
		super(piso, numero, cochera);

		this.montoTotalAPagarServicios = 0;
		this.pagoExtraordinario = pagoExtraordinario;
		this.valorAPagarExpensas = 0;
		this.habitante = habitante;
		super.setTipoDepartamento(TipoDeDepartamento.DOS_AMBIENTES);
	}

	@Override
	public void serviciosComunesAPagar(Integer monto) {

		super.serviciosComunesAPagar(monto);

		this.montoTotalAPagarServicios = super.getServicioComunes() + this.pagoExtraordinario;
	}

	@Override
	public Integer pagoDeExpensas() {

		if (super.getCochera()) {
			this.valorAPagarExpensas += super.getEXTRA_COCHERA();
		}
		this.valorAPagarExpensas += this.montoTotalAPagarServicios + super.getVALOR_BASICO_EXPENSAS()
				+ super.getEXTRA_DOSAMBIENTES();

		return this.valorAPagarExpensas;

	}

//  RESUMEN DE EXPENSAS DE UN DEPARTAMENTO ESPECIFICO
	public String toString() {
		return "Departamento: " + super.getNumero() + " piso " + super.getPiso() + "\n" + "EXPENSAS  " + "\n"
				+ "Servicios Basicos (Luz, Agua): " + this.getMontoTotalAPagarServicios() + "\n" + "Cochera: "
				+ super.getEXTRA_COCHERA() + "\n" + "Valor Basico de Expensas: " + super.getVALOR_BASICO_EXPENSAS()
				+ "\n" + "Dpt Monoambiente: " + super.getEXTRA_MONOAMBIENTE() + " \n" + "TOTAL: " + pagoDeExpensas();
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

	// GET HABITANTE
	public Habitante getHabitante() {
		return habitante;
	}

	// SET HABITANTE
	public void setHabitante(Habitante habitante) {
		this.habitante = habitante;
	}

}
