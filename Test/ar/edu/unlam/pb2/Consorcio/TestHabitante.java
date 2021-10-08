package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestHabitante {

	@Test
	public void QueSePuedaCrearUnHabitante() {

		Integer dni = 21235789;
		String nombre = "Jose";
		String apellido = "Albornoz";
		TipoDeDepartamento tipo = TipoDeDepartamento.MONOAMBIENTE;
		Boolean estadoDeExpensas = true;

		Habitante joseAlbornoz = new Habitante(dni, nombre, apellido, tipo, estadoDeExpensas);

		assertNotNull(joseAlbornoz);
		assertEquals(dni, joseAlbornoz.getDni());
		assertEquals(nombre, joseAlbornoz.getNombre());
		assertEquals(apellido, joseAlbornoz.getApellido());
		assertEquals(tipo, joseAlbornoz.getDepartamento());
		assertEquals(estadoDeExpensas, joseAlbornoz.getEstadoDeExpensas());
	}
}
