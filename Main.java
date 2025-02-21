
public class Main {

	public static void main(String[] args) {

		//Criando dois objetos do Tipo carro
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		// Atribuindo informações ao objetos criados
		
		carro1.setMarca("GM");
		carro1.setModelo("Classic");
		carro1.setAno(2008);
		//----------------------------------
		carro2.setMarca("Fiat");
		carro2.setModelo("Pulse");
		carro2.setAno(2024);
		
		// CHAMANDO METODO PUBLICO DA CLASSE CARRO
		
		carro1.exibirInfo();
		System.out.println("-------------------");
		carro2.exibirInfo();
		
		
	
	}

}
