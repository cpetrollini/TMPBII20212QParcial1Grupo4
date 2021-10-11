package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDepartamento {

	@Test
	public void queSePuedaCrearUnDepartamento() {
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = false;
		int cantidadDeAmbientes = 1;

		Departamento prueba = new Departamento(piso, numero, cochera, cantidadDeAmbientes);
		
		assertNotNull(prueba); 
	}

}
