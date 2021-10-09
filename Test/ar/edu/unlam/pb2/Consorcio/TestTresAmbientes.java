package ar.edu.unlam.pb2.Consorcio;

public class TestTresAmbientes {

//	@Test
//	public void QueSePuedaCrearUnTresAmbientes() {
//
//		Integer piso = 1;
//		Integer numero = 4;
//		Boolean cochera = false;
//		Integer monto = 1000;
//
//		TresAmbientes dto = new TresAmbientes(piso, numero, cochera, monto);
//
//		assertNotNull(dto);
//		assertEquals(piso, dto.getPiso());
//		assertEquals(numero, dto.getNumero());
//		assertEquals(cochera, dto.getCochera());
//		assertEquals(monto, dto.getPagoExtraordinario());
//
//	}
//	@Test
//	public void QuePagueLaExpensaTotal() {
//		Integer piso = 1;
//		Integer numero = 4;
//		Boolean cochera = false;
//		Integer montoExtraordinario = 1000;
//		Integer montoServiciosComunes = 500;
//
//		Integer valorEsperadoDeLaExpensa = 0;
//
//		Monoambiente DepartamentoTresambientes = new Monoambiente(piso, numero, cochera, montoExtraordinario);
//		
//		DepartamentoTresambientes.serviciosComunesAPagar(montoServiciosComunes);
//		Integer servicios = DepartamentoTresambientes.getMontoTotalAPagarServicios();
//		Integer ExpensasBasicas = DepartamentoTresambientes.getVALOR_BASICO_EXPENSAS();
//		Integer tresAmbientesExtra = DepartamentoTresambientes.getEXTRA_TRESAMBIENTES();
//
//		Integer serviciosTotales = servicios + ExpensasBasicas + tresAmbientesExtra;
//
//		Integer valorObtenido = DepartamentoTresambientes.pagoDeExpensas(serviciosTotales);
//
//		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
//	}
//
//	@Test
//	public void QuePagueLaExpensaDeFormaParcialYconCochera() {
//	
//		Integer piso = 1;
//		Integer numero = 4;
//		Boolean cochera = true;
//		Integer montoExtraordinario = 1000;
//		Integer montoServiciosComunes = 500;
//		Integer expensasPago=2000;
//
//
//		Monoambiente DepartamentoTresAmbientes = new Monoambiente(piso, numero, cochera, montoExtraordinario);
//		DepartamentoTresAmbientes.serviciosComunesAPagar(montoServiciosComunes);
//		Integer servicios = DepartamentoTresAmbientes.getMontoTotalAPagarServicios();
//		Integer ExpensasBasicas = DepartamentoTresAmbientes.getVALOR_BASICO_EXPENSAS();
//		Integer tresAmbientesExtra = DepartamentoTresAmbientes.getEXTRA_TRESAMBIENTES();
//		Integer conCochera= DepartamentoTresAmbientes.getEXTRA_COCHERA();
//		
//		
//
//		Integer serviciosTotales = servicios + ExpensasBasicas + tresAmbientesExtra + conCochera;
//		
//		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;
//
//
//		Integer valorObtenido = DepartamentoTresAmbientes.pagoDeExpensas(expensasPago);
//
//		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
//		
//		
//	}
//	@Test
//	public void PrubaDeRecibo() {
//	
//		Integer piso = 1;
//		Integer numero = 4;
//		Boolean cochera = true;
//		Integer montoExtraordinario = 1000;
//		Integer montoServiciosComunes = 500;
//		Integer expensasPago=2000;
//
//
//		Monoambiente DepartamentoTresAmbientes = new Monoambiente(piso, numero, cochera, montoExtraordinario);
//		DepartamentoTresAmbientes.serviciosComunesAPagar(montoServiciosComunes);
//		Integer servicios = DepartamentoTresAmbientes.getMontoTotalAPagarServicios();
//		Integer ExpensasBasicas = DepartamentoTresAmbientes.getVALOR_BASICO_EXPENSAS();
//		Integer tresAmbientesExtra = DepartamentoTresAmbientes.getEXTRA_TRESAMBIENTES();
//		Integer conCochera= DepartamentoTresAmbientes.getEXTRA_COCHERA();
//		
//
//		Integer serviciosTotales = servicios + ExpensasBasicas + tresAmbientesExtra + conCochera;
//		
//		Integer valorEsperadoDeLaExpensa = serviciosTotales - expensasPago;
//
//
//		Integer valorObtenido = DepartamentoTresAmbientes.pagoDeExpensas(expensasPago);
//
//		assertEquals(valorEsperadoDeLaExpensa, valorObtenido);
//		
//		
//	}

}
