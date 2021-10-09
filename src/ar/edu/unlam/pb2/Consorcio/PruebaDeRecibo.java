package ar.edu.unlam.pb2.Consorcio;

public class PruebaDeRecibo {

	public static void main(String[] args) {
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer montoExt = 1000;
		Integer montoServiciosComunes = 1000;

		Habitante elHabitante = new Habitante(15456789, "jose", "jose", true);

		Monoambiente departamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExt, elHabitante);

		departamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);

		Recibo octubre = new Recibo(departamentoMonoambiente, elHabitante);

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio(departamentoMonoambiente,
				elHabitante, octubre);

		laPerlaAdministracionConsorcio.ingresarRecibo(octubre);

//to string
//		System.out.println(laPerlaAdministracionConsorcio);

	}

}
