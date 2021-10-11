package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestMonoambiente {

	@Test
	public void QueSePuedaCrearUnMonoambiente() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer montoExtraordinario = 1000;
		Habitante nuevoHabitane = new Habitante(42838552, "Paco", "Lopez");

		Monoambiente dto = new Monoambiente(piso, numero, cochera, montoExtraordinario, nuevoHabitane);

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

		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		DepartamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);

		Integer servicios = DepartamentoMonoambiente.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoMonoambiente.getVALOR_BASICO_EXPENSAS();
		Integer monoambienteExtra = DepartamentoMonoambiente.getEXTRA_MONOAMBIENTE();

		Integer serviciosTotales = servicios + ExpensasBasicas + monoambienteExtra;

		DepartamentoMonoambiente.calcularGastosExpensas();
		DepartamentoMonoambiente.pagarExpensas(serviciosTotales);

		Integer valorObtenido = DepartamentoMonoambiente.getValorAPagarExpensas();

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

		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		DepartamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);

		Integer servicios = DepartamentoMonoambiente.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoMonoambiente.getVALOR_BASICO_EXPENSAS();
		Integer monoambienteExtra = DepartamentoMonoambiente.getEXTRA_MONOAMBIENTE();
		Integer conCochera = DepartamentoMonoambiente.getEXTRA_COCHERA();

		Integer serviciosTotales = servicios + ExpensasBasicas + monoambienteExtra + conCochera;

		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;

		DepartamentoMonoambiente.calcularGastosExpensas();
		DepartamentoMonoambiente.pagarExpensas(expensasPago);

		Integer valorObtenido = DepartamentoMonoambiente.getValorAPagarExpensas();

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

		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExtraordinario,
				nuevoHabitane);

		DepartamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);
		DepartamentoMonoambiente.calcularGastosExpensas();
		DepartamentoMonoambiente.pagarExpensas(expensasPago);

		assertNotNull(DepartamentoMonoambiente.toString());

	}

}
