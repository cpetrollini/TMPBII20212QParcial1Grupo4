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
		Integer monto = 1000;

		Monoambiente dto = new Monoambiente(piso, numero, cochera, monto);

		assertNotNull(dto);
		assertEquals(piso, dto.getPiso());
		assertEquals(numero, dto.getNumero());
		assertEquals(cochera, dto.getCochera());
		assertEquals(monto, dto.getPagoExtraordinario());

	}

	@Test
	public void QuePagueLaExpensaTotal() {
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer montoExtraordinario = 1000;
		Integer montoServiciosComunes = 500;

		Integer valorEsperadoDeLaExpensa = 0;

		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExtraordinario);
		DepartamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);
		Integer servicios = DepartamentoMonoambiente.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoMonoambiente.getVALOR_BASICO_EXPENSAS();
		Integer monoambienteExtra = DepartamentoMonoambiente.getEXTRA_MONOAMBIENTE();

		Integer serviciosTotales = servicios + ExpensasBasicas + monoambienteExtra;

		Integer valorObtenido = DepartamentoMonoambiente.pagoDeExpensas(serviciosTotales);

		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
	}

	@Test
	public void QuePagueLaExpensaDeFormaParcialYconCochera() {
	
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer montoExtraordinario = 1000;
		Integer montoServiciosComunes = 500;
		Integer expensasPago=2000;


		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExtraordinario);
		DepartamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);
		Integer servicios = DepartamentoMonoambiente.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoMonoambiente.getVALOR_BASICO_EXPENSAS();
		Integer monoambienteExtra = DepartamentoMonoambiente.getEXTRA_MONOAMBIENTE();
		Integer conCochera= DepartamentoMonoambiente.getEXTRA_COCHERA();

		Integer serviciosTotales = servicios + ExpensasBasicas + monoambienteExtra + conCochera;
		
		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;


		Integer valorObtenido = DepartamentoMonoambiente.pagoDeExpensas(expensasPago);

		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
		
		
	}

}
