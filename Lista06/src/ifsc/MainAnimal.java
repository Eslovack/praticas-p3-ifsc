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
		
		System.out.println(Husky.getNome());
		System.out.println(Husky.getComprimento());
		System.out.println(Husky.getCor());
		System.out.println(Husky.getEcosystem());
		System.out.println(Husky.getNumepata());
		System.out.println(Husky.getRaça());
		
		System.out.println(T90.getNome());
		System.out.println(T90.getComprimento());
		System.out.println(T90.getCor());
		System.out.println(T90.getEcosystem());
		System.out.println(T90.getNumepata());
		System.out.println(T90.getRaça());
		
		

	}

}
