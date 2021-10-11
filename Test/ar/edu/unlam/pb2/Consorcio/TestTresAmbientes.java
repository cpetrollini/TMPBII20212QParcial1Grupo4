package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestTresAmbientes {

	@Test
	public void QueSePuedaCrearUnMonoambiente() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer montoExtraordinario = 1000;
		Habitante nuevoHabitane = new Habitante(42838552, "Paco", "Lopez");

		TresAmbientes dto = new TresAmbientes(piso, numero, cochera, montoExtraordinario, nuevoHabitane);

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
		Habitante nuevoHabitane = new Habitante(42838552, "Paco", "Lopez");

		Integer valorEsperadoDeLaExpensa = 0;

		TresAmbientes DepartamentoTresAmbientes = new TresAmbientes(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		DepartamentoTresAmbientes.serviciosComunesAPagar(montoServiciosComunes);

		Integer servicios = DepartamentoTresAmbientes.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoTresAmbientes.getVALOR_BASICO_EXPENSAS();
		Integer monoambienteExtra = DepartamentoTresAmbientes.getEXTRA_TRESAMBIENTES();

		Integer serviciosTotales = servicios + ExpensasBasicas + monoambienteExtra;

		DepartamentoTresAmbientes.calcularGastosExpensas();
		DepartamentoTresAmbientes.pagarExpensas(serviciosTotales);

		Integer valorObtenido = DepartamentoTresAmbientes.getValorAPagarExpensas();

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

		TresAmbientes DepartamentoTresAmbientes = new TresAmbientes(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		DepartamentoTresAmbientes.serviciosComunesAPagar(montoServiciosComunes);

		Integer servicios = DepartamentoTresAmbientes.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoTresAmbientes.getVALOR_BASICO_EXPENSAS();
		Integer monoambienteExtra = DepartamentoTresAmbientes.getEXTRA_TRESAMBIENTES();
		Integer conCochera = DepartamentoTresAmbientes.getEXTRA_COCHERA();

		Integer serviciosTotales = servicios + ExpensasBasicas + monoambienteExtra + conCochera;

		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;

		DepartamentoTresAmbientes.calcularGastosExpensas();
		DepartamentoTresAmbientes.pagarExpensas(expensasPago);

		Integer valorObtenido = DepartamentoTresAmbientes.getValorAPagarExpensas();

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

		TresAmbientes DepartamentoTresAmbientes = new TresAmbientes(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		DepartamentoTresAmbientes.serviciosComunesAPagar(montoServiciosComunes);
		DepartamentoTresAmbientes.calcularGastosExpensas();
		DepartamentoTresAmbientes.pagarExpensas(expensasPago);

		assertNotNull(DepartamentoTresAmbientes.toString());
	}

}
