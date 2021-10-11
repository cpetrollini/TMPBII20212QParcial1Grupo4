package ar.edu.unlam.pb2.Consorcio;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestAdministracionDeConsorcio {

	
	
	@Test
	public void queNoSeAgregueUnDepartamentoRepetido() {
		AdministracionConsorcio admin = new AdministracionConsorcio();
		Propietario carlitos = new Propietario(39213672, "Ain", "Ponce");

		Departamento dpto = new Departamento(1, 1, true, 1, carlitos);	
		Departamento dpto1 = new Departamento(1, 1, false, 1, carlitos);
		
		assertTrue(admin.ingresarDepartamento(dpto));
		assertFalse(admin.ingresarDepartamento(dpto1));
		
	}

	@Test 
	public void buscarUnDepartamentoPorPisoYNumero() {
		AdministracionConsorcio admin = new AdministracionConsorcio();
		Propietario carlitos = new Propietario(39213672, "Ain", "Ponce");
		Departamento dpto = new Departamento(1, 1, true, 1, carlitos);	
		admin.ingresarDepartamento(dpto);
		
		Departamento valorObtenido = admin.buscarDpt(1, 1);
		assertEquals(dpto, valorObtenido);
	}
	
	@Test
	public void queSeEncuetreElHabitanteBuscado() {
		AdministracionConsorcio admin = new AdministracionConsorcio();
		Propietario carlitos = new Propietario(39213672, "Ain", "Ponce");
		Departamento dpto = new Departamento(1, 1, true, 1, carlitos);
		admin.ingresarHabitante(carlitos, dpto);
		Habitante esperado = carlitos;
		Integer dni = 39213672;
		Habitante valorObtenido = admin.buscarHabitante(dni);
		assertEquals(esperado, valorObtenido);
	}
	
	
}
