package ifsc;

public class Animal {
	
	private String Nome;	
	private Float Comprimento;
	private Integer Numepata;
	private String Cor;
	private String Ecosystem;
	
	
	
	public Float getComprimento() {
		return Comprimento;
	}

	public void setComprimento(Float comprimento) {
		Comprimento = comprimento;
	}

	public Integer getNumepata() {
		return Numepata;
	}

	public void setNumepata(Integer numepata) {
		Numepata = numepata;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getEcosystem() {
		return Ecosystem;
	}

	public void setEcosystem(String ecosystem) {
		Ecosystem = ecosystem;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	private String Raça;

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}
	public void Caminha() {
		System.out.println("A égua da tua mãe e o cavalo do teu pai");
		
	}


}
