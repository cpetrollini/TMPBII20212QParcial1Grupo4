package ar.edu.unlam.pb2.Consorcio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Factura {

	Calendar fecha = new GregorianCalendar();
	private int anio;
	private int mes;
	private int dia ;
	Calendar fechaFactura;
	
	public Factura() {
		this.anio = fecha.get(Calendar.YEAR);
		this.mes  = fecha.get(Calendar.MONTH);
		this.dia = fecha.get(Calendar.DATE);
		this.fechaFactura = new GregorianCalendar(anio, mes, dia);
	}
	
	public Factura(int anio, int mes, int dia) {
		this.anio = anio;
		this.dia = dia;
		this.mes = mes;
	}

	public Calendar getFechaFactura() {
		return this.fechaFactura;
	}
	
	
}
