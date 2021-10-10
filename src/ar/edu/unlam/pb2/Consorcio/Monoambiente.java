package ar.edu.unlam.pb2.Consorcio;

public class Monoambiente extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer valorAPagarExpensas;
	private Habitante habitante;
	private Boolean estadoDeExpensa = true;
	private Boolean pagoDelHabitante = false;
	private Integer expensasTotal;

	public Monoambiente(Integer piso, Integer numero, Boolean cochera, Integer pagoExtraordinario,
			Habitante habitante) {
		super(piso, numero, cochera);
		this.montoTotalAPagarServicios = 0;
		this.pagoExtraordinario = pagoExtraordinario;
		this.valorAPagarExpensas = 0;
		this.habitante = habitante;
		super.setTipoDepartamento(TipoDeDepartamento.MONOAMBIENTE);
	}

	@Override
	public void serviciosComunesAPagar(Integer monto) {

		super.serviciosComunesAPagar(monto);

		this.montoTotalAPagarServicios = super.getServicioComunes() + this.pagoExtraordinario;
	}

	public Integer valorExpensasAPagar() {
		
		return this.valorAPagarExpensas;
	}

	public void pagarExpensas(Integer pagoExpensa) {

		if (super.getCochera()) {
			this.valorAPagarExpensas += super.getEXTRA_COCHERA();
		}
		this.valorAPagarExpensas += this.montoTotalAPagarServicios + super.getVALOR_BASICO_EXPENSAS()
				+ super.getEXTRA_MONOAMBIENTE();

		expensasTotal = this.valorAPagarExpensas;
		
		if (pagoExpensa != 0) {
			this.pagoDelHabitante = true;
		}
		if (this.valorAPagarExpensas.equals(pagoExpensa)) {
			this.estadoDeExpensa = false;
		}
		this.valorAPagarExpensas -= pagoExpensa;

	}

	// RESUMEN DE EXPENSAS DE UN DEPARTAMENTO ESPECIFICO (RECIBO)
	public String toString() {
		if (this.pagoDelHabitante) {
			return "Departamento: " + super.getNumero() + " piso: " + super.getPiso() + " habitante: "
					+ this.habitante.getApellido() + "\n" + "EXPENSAS  " + "\n" + "Servicios Basicos (Luz, Agua): "
					+ this.getMontoTotalAPagarServicios() + "\n" + "Cochera: " + super.getEXTRA_COCHERA() + "\n"
					+ "Valor Basico de Expensas: " + super.getVALOR_BASICO_EXPENSAS() + "\n" + "Dpt Monoambiente: "
					+ super.getEXTRA_MONOAMBIENTE() + " \n" + "TOTAL: " + this.expensasTotal;
		}
		return "No hay recibo disponible";
	}

	public Boolean getEstadoDeExpensa() {
		if (this.valorAPagarExpensas.equals(0) && this.pagoDelHabitante) {
			habitante.setEstadoDeExpensas(false);
		}

		return estadoDeExpensa;
	}

	public Integer getPagoExtraordinario() {
		return pagoExtraordinario;
	}

	public void setPagoExtraordinario(Integer pagoExtraordinario) {
		this.pagoExtraordinario = pagoExtraordinario;
	}

	public Integer getMontoTotalAPagarServicios() {
		return this.montoTotalAPagarServicios;
	}

	public void setMontoTotalAPagarServicios(Integer montoTotalAPagarServicios) {
		this.montoTotalAPagarServicios = montoTotalAPagarServicios;
	}

	public Boolean getPagoDelHabitante() {
		return pagoDelHabitante;
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
