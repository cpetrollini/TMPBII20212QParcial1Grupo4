package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestDosAmbientes {

	@Test
	public void QueSePuedaCrearUnDosambientes() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer montoExtraordinario = 1000;
		Habitante nuevoHabitane = new Habitante(42838552, "Luis", "pool");

		DosAmbientes dto = new DosAmbientes(piso, numero, cochera, montoExtraordinario, nuevoHabitane);

		assertNotNull(dto);
		assertEquals(piso, dto.getPiso());
		assertEquals(numero, dto.getNumero());
		assertEquals(cochera, dto.getCochera());
		assertEquals(montoExtraordinario, dto.getPagoExtraordinario());
		assertEquals(nuevoHabitane.getDni(), dto.getHabitante().getDni());

	}

	@Test
	public void QuePagueLaExpensaTotal() {
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer montoExtraordinario = 1000;
		Integer montoServiciosComunes = 500;
		Habitante nuevoHabitane = new Habitante(42838552, "Luis", "pool");

		Integer valorEsperadoDeLaExpensa = 0;

		DosAmbientes departamentoDosAmbientes = new DosAmbientes(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		departamentoDosAmbientes.serviciosComunesAPagar(montoServiciosComunes);

		Integer servicios = departamentoDosAmbientes.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = departamentoDosAmbientes.getVALOR_BASICO_EXPENSAS();
		Integer ambienteExtra = departamentoDosAmbientes.getEXTRA_DOSAMBIENTES();

		Integer serviciosTotales = servicios + ExpensasBasicas + ambienteExtra;

		departamentoDosAmbientes.calcularGastosExpensas();
		departamentoDosAmbientes.pagarExpensas(serviciosTotales);

		Integer valorObtenido = departamentoDosAmbientes.getValorAPagarExpensas();

		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
	}

	@Test
	public void QuePagueLaExpensaDeFormaParcialYconCochera() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer montoExtraordinario = 1000;
		Integer montoServiciosComunes = 500;
		Integer expensasPago = 2000;
		Habitante nuevoHabitane = new Habitante(42838552, "Paco", "Lopez");

		DosAmbientes departamentoDosAmbientes = new DosAmbientes(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		departamentoDosAmbientes.serviciosComunesAPagar(montoServiciosComunes);

		Integer servicios = departamentoDosAmbientes.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = departamentoDosAmbientes.getVALOR_BASICO_EXPENSAS();
		Integer ambienteExtra = departamentoDosAmbientes.getEXTRA_DOSAMBIENTES();
		Integer conCochera = departamentoDosAmbientes.getEXTRA_COCHERA();

		Integer serviciosTotales = servicios + ExpensasBasicas + ambienteExtra + conCochera;

		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;

		departamentoDosAmbientes.calcularGastosExpensas();
		departamentoDosAmbientes.pagarExpensas(expensasPago);

		Integer valorObtenido = departamentoDosAmbientes.getValorAPagarExpensas();

		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);

	}

	@Test
	public void QueSePuedaGenearUnRecibo() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer montoExtraordinario = 1000;
		Integer montoServiciosComunes = 500;
		Integer expensasPago = 2000;
		Habitante nuevoHabitane = new Habitante(42838552, "Paco", "Lopez");

		DosAmbientes departamentoDosAmbientes = new DosAmbientes(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		departamentoDosAmbientes.serviciosComunesAPagar(montoServiciosComunes);
		departamentoDosAmbientes.calcularGastosExpensas();
		departamentoDosAmbientes.pagarExpensas(expensasPago);

		assertNotNull(departamentoDosAmbientes.toString());

	}
}
