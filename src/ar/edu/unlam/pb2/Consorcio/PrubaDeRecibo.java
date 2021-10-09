package ar.edu.unlam.pb2.Consorcio;

public class PrubaDeRecibo {

	public static void main(String[] args) {
		Integer piso = 1;
		Integer numero = 4;
		Boolean cochera = true;
		Integer montoExtraordinario = 1000;
		Integer montoServiciosComunes=1000;
	


		Monoambiente DepartamentoMonoambiente = new Monoambiente(piso, numero, cochera, montoExtraordinario);
		DepartamentoMonoambiente.serviciosComunesAPagar(montoServiciosComunes);
		
		
		System.out.println(DepartamentoMonoambiente.toString());
		
//		Integer piso1= 1;
//		Integer numero1 = 4;
//		Boolean cochera1 = true;
//		Integer montoExtraordinario1 = 1000;
//		Integer montoServiciosComunes1=1000;
//	
//
//
//		Monoambiente monoambientedpt = new Monoambiente(piso1, numero1, cochera1, montoExtraordinario1);
//		monoambientedpt.serviciosComunesAPagar(montoServiciosComunes);
//		
//		
//		System.out.println(monoambientedpt.toString());
//		
//		

	}

}
