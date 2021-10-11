package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAdministracionConsorcio {

	@Test
	public void QueSepuedaIngresarUnDepartamento() {

		Integer piso2 = 1;
		Integer numero2 = 6;
		Boolean cochera2 = false;
		Integer montoExt2 = 1000;
		Integer montoServiciosComunes = 800;

		Habitante elHabitante2 = new Habitante(15456789, "manuel", "Lopez");

		Monoambiente departamentoMonoambiente2 = new Monoambiente(piso2, numero2, cochera2, montoExt2, elHabitante2);
		departamentoMonoambiente2.serviciosComunesAPagar(montoServiciosComunes);
		departamentoMonoambiente2.calcularGastosExpensas();
		departamentoMonoambiente2.pagarExpensas(1500);

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();
		Boolean valorEsperado = laPerlaAdministracionConsorcio.ingresarDepartamento(departamentoMonoambiente2);

		assertTrue(valorEsperado);

	}

	@Test
	public void QueSepuedaIngresarUnRecibo() {

		Integer piso2 = 1;
		Integer numero2 = 6;
		Boolean cochera2 = false;
		Integer montoExt2 = 1000;
		Integer montoServiciosComunes = 800;

		Habitante elHabitante2 = new Habitante(15456789, "manuel", "Lopez");

		Monoambiente departamentoMonoambiente2 = new Monoambiente(piso2, numero2, cochera2, montoExt2, elHabitante2);
		departamentoMonoambiente2.serviciosComunesAPagar(montoServiciosComunes);
		departamentoMonoambiente2.calcularGastosExpensas();
		departamentoMonoambiente2.pagarExpensas(1500);

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();
		laPerlaAdministracionConsorcio.ingresarDepartamento(departamentoMonoambiente2);
		Boolean valorEsperado = laPerlaAdministracionConsorcio.ingresarRecibo(numero2, piso2);

		assertTrue(valorEsperado);
	}

	@Test
	public void QueSepuedaIngresarUnHabitante() {

		Habitante elHabitante = new Habitante(15456789, "manuel", "Lopez");

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();

		Boolean valorEsperado = laPerlaAdministracionConsorcio.ingresarHabitante(elHabitante);

		assertTrue(valorEsperado);
	}

	@Test
	public void QueSepuedaBuscarUnHabitantePorDNI() {

		Integer dni = 15456789;
		String nombre = "manuel";
		String apellido = "Lopez";
		Habitante elHabitante = new Habitante(dni, nombre, apellido);

		Habitante valorEsperado = elHabitante;

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();
		laPerlaAdministracionConsorcio.ingresarHabitante(elHabitante);

		Habitante valorObtenido = laPerlaAdministracionConsorcio.buscarHabitante(dni);

		assertEquals(valorObtenido, valorEsperado);
	}

	@Test
	public void QueSepuedaBuscarUnDepartamentoPorPisoYNumero() {

		Integer piso2 = 1;
		Integer numero2 = 6;
		Boolean cochera2 = false;
		Integer montoExt2 = 1000;
		Integer montoServiciosComunes = 800;

		Integer dni = 15456789;
		String nombre = "manuel";
		String apellido = "Lopez";
		Habitante elHabitante = new Habitante(dni, nombre, apellido);

		Monoambiente departamentoMonoambiente2 = new Monoambiente(piso2, numero2, cochera2, montoExt2, elHabitante);
		departamentoMonoambiente2.serviciosComunesAPagar(montoServiciosComunes);
		departamentoMonoambiente2.calcularGastosExpensas();
		departamentoMonoambiente2.pagarExpensas(1500);

		Departamento valosEsperado = departamentoMonoambiente2;

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();
		laPerlaAdministracionConsorcio.ingresarDepartamento(departamentoMonoambiente2);

		Departamento valorObtenido = laPerlaAdministracionConsorcio.buscarDpt(piso2, numero2);

		assertEquals(valorObtenido, valosEsperado);
	}

	@Test
	public void QueSepuedaOntenerUnListadoConLaCantidadDeDeudores() {

		Integer piso2 = 1;
		Integer numero2 = 6;
		Boolean cochera2 = false;
		Integer montoExt2 = 1000;
		Integer montoServiciosComunes = 800;

		Integer dni = 15456789;
		String nombre = "manuel";
		String apellido = "Lopez";
		Habitante elHabitante = new Habitante(dni, nombre, apellido);

		Monoambiente departamentoMonoambiente2 = new Monoambiente(piso2, numero2, cochera2, montoExt2, elHabitante);
		departamentoMonoambiente2.serviciosComunesAPagar(montoServiciosComunes);
		departamentoMonoambiente2.calcularGastosExpensas();

//		departamentoMonoambiente2.pagarExpensas(0);

		Integer valosEsperado = 1;

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();
		laPerlaAdministracionConsorcio.ingresarDepartamento(departamentoMonoambiente2);

		Integer valorObtenido = laPerlaAdministracionConsorcio.cuantosDptsDebenExpensas();

		assertEquals(valorObtenido, valosEsperado);
	}

	@Test
	public void QueSePuedaGenearUnReciboDePadoDeExpensasDeCualquierDepartamento() {

		Integer piso = 1;
		Integer numero = 5;
		Boolean cochera = true;
		Integer montoExtraordinario = 1230;
		Integer montoServiciosComunes = 800;
		Integer expensasPago = 2000;
		Habitante nuevoHabitane = new Habitante(42838552, "Luis", "Loop");

		Monoambiente Departamento = new Monoambiente(piso, numero, cochera, montoExtraordinario, nuevoHabitane);

		Departamento.serviciosComunesAPagar(montoServiciosComunes);
		Departamento.calcularGastosExpensas();
		Departamento.pagarExpensas(expensasPago);

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();

		laPerlaAdministracionConsorcio.toString();

		assertNotNull(laPerlaAdministracionConsorcio.toString());
	}
}
