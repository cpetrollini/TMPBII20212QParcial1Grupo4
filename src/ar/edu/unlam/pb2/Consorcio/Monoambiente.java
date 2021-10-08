package ar.edu.unlam.pb2.Consorcio;

public class Monoambiente extends Departamento {

	private Integer pagoExtraordinario;// extras por mantenimiento
	private Integer montoTotalAPagarServicios;// luz y agua
	private Integer PagoDeExpensas;
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

	public Integer pagoDeExpensas(Integer pagoExpensas) {
		
	
		if (super.getCochera()) {
			this.valorAPagarExpensas += Departamento.getEXTRA_COCHERA();
		}
		this.valorAPagarExpensas+= this.montoTotalAPagarServicios + super.getVALOR_BASICO_EXPENSAS()+ Departamento.getEXTRA_MONOAMBIENTE();
		this.valorAPagarExpensas-= pagoExpensas;

		return this.valorAPagarExpensas;

	}

	public Integer getValorAPagarExpensas() {
		
       return pagoDeExpensas(0);

	}
	
	public String recibo() {
		return  "Dpt: " + super.getNumero() + "piso" + super.getPiso() + "/n" + "Expensas: " + "/n" + "Servicios Basicos; Luz, Agua; " +  super.getServicioComunes() + "/n" + "Valor Basico de Expensas: "
	+ super.getVALOR_BASICO_EXPENSAS() + "/n" + "Dpt Monoambiente: " + super.getEXTRA_MONOAMBIENTE() + "/n" + "TOTAL: " + getValorAPagarExpensas(); 
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

