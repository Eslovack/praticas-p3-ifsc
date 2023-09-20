package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro Husky = new Cachorro();
		
		Husky.setNome("Jorge Mordedor");
		Husky.setComprimento (51f);
		Husky.setCor("Preto com manchas Brancas");
		Husky.setEcosystem("Urbano");
		Husky.setNumepata(4);
		Husky.setRaça("Husky");
		Husky.Caminha();
		Husky.late();
		
		
		
		Gato T90 = new Gato();
		
		T90.setNome("Z");
		T90.setComprimento(1.5F);
		T90.setCor("Verde Camuflado");
		T90.setEcosystem("Urbano/Rural");
		T90.setNumepata(12);
		T90.setRaça("Russa");
		T90.Caminha();
		T90.mia();		

	}

}
