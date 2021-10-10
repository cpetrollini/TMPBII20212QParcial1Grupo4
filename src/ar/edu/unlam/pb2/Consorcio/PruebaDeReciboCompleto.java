package ar.edu.unlam.pb2.Consorcio;

public class PruebaDeReciboCompleto {

	public static void main(String[] args) {
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer montoExt = 1000;
		Integer montoServiciosComunes = 1000;

		Habitante elHabitante = new Habitante(15456789, "jose", "rodriguez");

		Monoambiente departamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExt, elHabitante);

		departamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);
		
		System.out.println(departamentoMonoambiente.valorExpensasAPagar());
		
		departamentoMonoambiente.pagarExpensas(1500);
		System.out.println(departamentoMonoambiente.valorExpensasAPagar());


		// DICE SI EL HABITANTE TIENE PENDIENTE DE PAGO (TRUE) O YA PAGO TOD (FALSE)
		elHabitante.getEstadoDeExpensas();

//		System.out.println(departamentoMonoambiente.toString());

//		Recibo octubre = new Recibo(departamentoMonoambiente, elHabitante);
//		EL RECIBO SOLO TIENE QUE SEGUIR SOLO AL DEPARTAMENTO

		AdministracionConsorcio laPerlaAdministracionConsorcio = new AdministracionConsorcio();

		System.out.println(laPerlaAdministracionConsorcio.ingresarDepartamento(departamentoMonoambiente));
		System.out.println(laPerlaAdministracionConsorcio.ingresarRecibo(numero, piso));
//		System.out.println(departamentoMonoambiente.valorExpensasAPagar());
		
		Integer piso2 = 1;
		Integer numero2 = 6;
		Boolean cochera2 = false;
		Integer montoExt2 = 1000;
		Integer montoServiciosComunes2 = 800;

		Habitante elHabitante2 = new Habitante(15456789, "manuel", "Lopez");

		Monoambiente departamentoMonoambiente2 = new Monoambiente(piso2, numero2, cochera2, montoExt2, elHabitante2);

		departamentoMonoambiente2.serviciosComunesAPagar(montoServiciosComunes2);
		
		System.out.println(departamentoMonoambiente2.valorExpensasAPagar());
		
		departamentoMonoambiente2.pagarExpensas(1500);
		System.out.println(departamentoMonoambiente2.valorExpensasAPagar());
		
		
		System.out.println(laPerlaAdministracionConsorcio.ingresarDepartamento(departamentoMonoambiente2));
		System.out.println(laPerlaAdministracionConsorcio.ingresarRecibo(numero2, piso2));
		System.out.println(laPerlaAdministracionConsorcio.toString());
//		NO SON LOS PARAMETROS QUE BUSCAMOS

//		laPerlaAdministracionConsorcio.ingresarRecibo(octubre);

//to string
//		System.out.println(laPerlaAdministracionConsorcio);

	}

}