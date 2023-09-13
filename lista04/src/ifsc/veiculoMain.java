package ifsc;
import java.util.ArrayList;

public class veiculoMain {

	public static void main(String[] args) {
		ArrayList<Veiculo>veiculos = new ArrayList<>();
		
		Veiculo carro = new Veiculo();
		carro.setNome("Ford Ka");
		carro.setNumerodas(4);
		carro.setCor("Rosa");
		carro.setFabricante("Ford");
		carro.setAno(2001);
		
		Veiculo moto = new Veiculo();
		moto.setNome("Yamaha");
		moto.setNumerodas(2);
		moto.setCor("Preto");
		moto.setFabricante("Yamaha");
		moto.setAno(2017);
		
		Veiculo trem = new Veiculo();
		trem.setNome("TremsLTDA Brasil");
		trem.setNumerodas(200);
		trem.setCor("cinza");
		trem.setFabricante("TAV Brasil");
		trem.setAno(2010);
		
		veiculos.add(trem);
		veiculos.add(moto);
		veiculos.add(carro);
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getNumerodas());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getAno());
		}
	}

}
