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

	@Test
    public void mostrarFacturasAPagar() {
        Departamento unoB = new Departamento(1, 2, false, 1);
        Departamento dosC = new Departamento(2, 3, true, 2);
        Departamento tresA = new Departamento(3, 1, false, 3);
        Departamento[] departamentos = {unoB, dosC, tresA};

        Propietario carlitos = new Propietario(39213672, "Ain", "Ponce");


    }
}
