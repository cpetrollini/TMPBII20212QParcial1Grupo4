package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestTresAmbientes {

	@Test
	public void QueSePuedaCrearUnTresAmbientes() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		Integer monto = 1000;

		TresAmbientes dto = new TresAmbientes(piso, numero, cochera, monto);

		assertNotNull(dto);
		assertEquals(piso, dto.getPiso());
		assertEquals(numero, dto.getNumero());
		assertEquals(cochera, dto.getCochera());
		assertEquals(monto, dto.getPagoExtraordinario());

	}
}
