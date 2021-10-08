package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestMonoambiente {

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

}
