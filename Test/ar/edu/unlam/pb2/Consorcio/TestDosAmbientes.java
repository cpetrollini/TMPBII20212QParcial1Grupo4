package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestDosAmbientes {

	public void QueSePuedaCrearUnDosAmbiente() {

		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer monto = 1000;

		DosAmbientes dto = new DosAmbientes(piso, numero, cochera, monto);

		assertNotNull(dto);
		assertEquals(piso, dto.getPiso());
		assertEquals(numero, dto.getNumero());
		assertEquals(cochera, dto.getCochera());
		assertEquals(monto, dto.getPagoExtraordinario());
	}

}
