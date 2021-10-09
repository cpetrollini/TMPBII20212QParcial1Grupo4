package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestDosAmbientes {

	@Test
	public void QueSePuedaCrearUnDosAmbiente() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer monto = 1000;

		DosAmbientes dto = new DosAmbientes(piso, numero, cochera, monto);

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

		Monoambiente DepartamentoDosambientes = new Monoambiente(piso, numero, cochera, montoExtraordinario);
		
		DepartamentoDosambientes.serviciosComunesAPagar(montoServiciosComunes);
		Integer servicios = DepartamentoDosambientes.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoDosambientes.getVALOR_BASICO_EXPENSAS();
		Integer dosambienteExtra = DepartamentoDosambientes.getEXTRA_DOSAMBIENTES();

		Integer serviciosTotales = servicios + ExpensasBasicas + dosambienteExtra;

		Integer valorObtenido = DepartamentoDosambientes.pagoDeExpensas(serviciosTotales);

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


		Monoambiente DepartamentoDosambientes = new Monoambiente(piso, numero, cochera, montoExtraordinario);
		DepartamentoDosambientes.serviciosComunesAPagar(montoServiciosComunes);
		Integer servicios = DepartamentoDosambientes.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoDosambientes.getVALOR_BASICO_EXPENSAS();
		Integer dosambientesExtra = DepartamentoDosambientes.getEXTRA_DOSAMBIENTES();
		Integer conCochera= DepartamentoDosambientes.getEXTRA_COCHERA();
		
		

		Integer serviciosTotales = servicios + ExpensasBasicas + dosambientesExtra + conCochera;
		
		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;


		Integer valorObtenido = DepartamentoDosambientes.pagoDeExpensas(expensasPago);

		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
		
		
	}
	@Test
	public void PrubaDeRecibo() {
	
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer montoExtraordinario = 1000;
		Integer montoServiciosComunes = 500;
		Integer expensasPago=2000;


		Monoambiente DepartamentoDosambientes = new Monoambiente(piso, numero, cochera, montoExtraordinario);
		DepartamentoDosambientes.serviciosComunesAPagar(montoServiciosComunes);
		Integer servicios = DepartamentoDosambientes.getMontoTotalAPagarServicios();
		Integer ExpensasBasicas = DepartamentoDosambientes.getVALOR_BASICO_EXPENSAS();
		Integer dosambientesExtra = DepartamentoDosambientes.getEXTRA_DOSAMBIENTES();
		Integer conCochera= DepartamentoDosambientes.getEXTRA_COCHERA();
		

		Integer serviciosTotales = servicios + ExpensasBasicas + dosambientesExtra + conCochera;
		
		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;


		Integer valorObtenido = DepartamentoDosambientes.pagoDeExpensas(expensasPago);

		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
		
		
	}
}

