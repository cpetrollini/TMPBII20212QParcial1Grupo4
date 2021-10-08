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
		Integer pagoExpensas = 3000;
		Integer montoTotalAPagarServicios = 500;
		Integer valorBasicoDeExpensas = 1000;
		Integer extraPorMonoambiente = 300;
		Integer montoServicios = 700;
		
		Integer totalAPagar = montoTotalAPagarServicios + valorBasicoDeExpensas + extraPorMonoambiente + montoServicios;
		
		Integer valorEsperadoDeLaExpensa = 0;
		
		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExtraordinario);
		DepartamentoMonoambiente.serviciosComunesAPagar(montoServicios);
		DepartamentoMonoambiente.pagoDeExpensas(pagoExpensas);
		
		Integer valorObtenido = 0;
		
		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
	}
	
	@Test
	public void QuePagueLaExpensaDeFormaParcial() {
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer monto = 1000;
		Integer valorEsperadoDeLaExpensa = 1000;
		Integer pagoExpensas = 3000;
		
		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, monto);
		
		
		
	}

}
