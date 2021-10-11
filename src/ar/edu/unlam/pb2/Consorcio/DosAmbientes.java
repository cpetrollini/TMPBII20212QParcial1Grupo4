package ar.edu.unlam.pb2.Consorcio;

public class DosAmbientes extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer valorAPagarExpensas;
	private Habitante habitante;
	private Boolean estadoDeExpensa = true;
	private Boolean pagoDelHabitante = false;
	private Integer pagoExpensa;

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

	
	public void calcularGastosExpensas() {
		if (super.getCochera()) {
			this.valorAPagarExpensas= super.getEXTRA_COCHERA();
			this.valorAPagarExpensas += this.montoTotalAPagarServicios + super.getVALOR_BASICO_EXPENSAS()
			+ super.getEXTRA_DOSAMBIENTES();
		}
		else {
		this.valorAPagarExpensas = this.montoTotalAPagarServicios + super.getVALOR_BASICO_EXPENSAS()
				+ super.getEXTRA_MONOAMBIENTE();
		}
		
	}

	public void pagarExpensas(Integer pagoExpensa) {
		this.pagoExpensa = pagoExpensa;
	
		if (pagoExpensa != 0) {
			this.pagoDelHabitante = true;
		}
		if (this.valorAPagarExpensas.equals(pagoExpensa)) {
			this.estadoDeExpensa = false;
		}
		this.valorAPagarExpensas -= pagoExpensa;

	}

	// RECIBO
	public String toString() {
		if (this.pagoDelHabitante) {
			if(getValorAPagarExpensas().equals(0)) {
		        return "Departamento: " + super.getNumero() + " piso: " + super.getPiso() + " habitante: " + this.habitante.getApellido() + "\n" + "EXPENSAS  " + "\n"

		                + "Servicios Basicos (Luz, Agua): " + this.getMontoTotalAPagarServicios() + "\n" + "Cochera: "

		                + super.getEXTRA_COCHERA() + "\n" + "Valor Basico de Expensas: " + super.getVALOR_BASICO_EXPENSAS()

		                + "\n" + "Dpt Monoambiente: " + super.getEXTRA_DOSAMBIENTES() + " \n" + "TOTAL: " + this.pagoExpensa;
			}
			else {
			      return "Departamento: " + super.getNumero() + " piso: " + super.getPiso() + " habitante: " + this.habitante.getApellido() + "\n" + "EXPENSAS  " + "\n"

		                + "Servicios Basicos (Luz, Agua): " + this.getMontoTotalAPagarServicios() + "\n" + "Cochera: "

		                + super.getEXTRA_COCHERA() + "\n" + "Valor Basico de Expensas: " + super.getVALOR_BASICO_EXPENSAS()

		                + "\n" + "Dpt Monoambiente: " + super.getEXTRA_DOSAMBIENTES() + " \n" + "TOTAL PAGADO: " + this.pagoExpensa + "\n" + "EXPENSA ADEUDADA: " +getValorAPagarExpensas() ;
			}
		}
		return null;
	}

	public Boolean getEstadoDeExpensa() {
		if (this.valorAPagarExpensas.equals(0) && this.pagoDelHabitante) {
			habitante.setEstadoDeExpensas(false);
		}

		return estadoDeExpensa;
	}
	
	public Integer getValorAPagarExpensas() {
		return valorAPagarExpensas;
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