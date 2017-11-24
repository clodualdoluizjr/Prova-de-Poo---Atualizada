
public class Executa {

	public static void main(String[] args) {
		Motor Motor = new Motor();
		Veiculo Veiculo = new Veiculo();
		CarroPasseio Carropasseio = new CarroPasseio();
		Caminhao caminhao = new Caminhao();
		Moto moto = new Moto();

		// Motor
		System.out.println("Motor 3.0");
		Motor.setPotencia(1500);
		Motor.setCilindradas(1100);
		System.out.println("No carro ,a Potência é de : " + Motor.getPotencia());
		System.out.println("Na moto ,as Cilindradas são de : " + Motor.getCilindradas());

		System.out.println("-----------------------------------");

		// Veiculo
		System.out.println("Veiculo de ano 2018");
		Veiculo.setPeso(1500);
		Veiculo.setPotencia(200);
		Veiculo.setPreco(89000);
		Veiculo.setVeloMax(248);
		System.out.println("O peso deste Veiculo de : " + Veiculo.getPeso() + "kg");
		System.out.println("A Pôtencia deste Veiculo é de : " + Veiculo.getPotencia() + "cv");
		System.out.println("O Preço deste Veiculo é de : " + Veiculo.getPreco() + "R$");
		System.out.println("A velocidade Maxima deste Veiculo é de : " + Veiculo.getVeloMax() + "KM/H");

		System.out.println("-----------------------------------");

		// Carro de Passeio
		System.out.println("Carro de ano 2018/Modelo mais atualizado");
		Carropasseio.setCor("Azul Imperial");
		Carropasseio.setModelo("Golf Gti 2.0 Tsi");
		Carropasseio.setPotencia(700);
		Carropasseio.setPeso(1100);
		Carropasseio.setVeloMax(236);
		Carropasseio.setPreco(100000);
		System.out.println("A cor deste carro é : " + Carropasseio.getCor());
		System.out.println("O modelo deste carro é : " + Carropasseio.getModelo());
		System.out.println("A pôtencia deste carro é de : " + Carropasseio.getPotencia() + "cv");
		System.out.println("O peso deste carro é de : " + Carropasseio.getPeso() + "Kg");
		System.out.println("A velocidade Maxima deste carro é de : " + Carropasseio.getVeloMax() + "KM/H");
		System.out.println("O preço deste carro é de : " + Carropasseio.getPreco() + "R$");

		System.out.println("-----------------------------------");

		// Caminhão
		System.out.println("Caminhão Usado");
		caminhao.setComprimento(25);
		caminhao.setPeso(2500);
		caminhao.setPotencia(1000);
		caminhao.setToneladas(10000);
		caminhao.setAlturaMax(7);
		caminhao.setPreco(55000);
		System.out.println("O comprimento deste Caminhão é de : " + caminhao.getComprimento() + "m");
		System.out.println("O peso deste Camminhão é de : " + caminhao.getPeso() + "Kg");
		System.out.println("A potência deste Caminhão é de : " + caminhao.getPotencia() + "cv");
		System.out.println("Esse Caminhão suporta : " + caminhao.getToneladas() + "Kg");
		System.out.println("A altura maxima deste Caminhão é de : " + caminhao.getAlturaMax() + "M");
		System.out.println("O preço deste Caminhão é de : " + caminhao.getPreco() + "R$");

		System.out.println("-----------------------------------");

		// Moto
		System.out.println("Moto modelo 2017");
		moto.setMarca("Yamaha");
		moto.setCor("Preta");
		moto.setModelo("R1");
		moto.setLigada(true);
		moto.sobeMarcha();
		moto.sobeMarcha();
		moto.sobeMarcha();
		moto.sobeMarcha();
		moto.sobeMarcha();
		moto.desceMarcha();
		moto.desceMarcha();
		moto.desceMarcha();
		moto.desceMarcha();
		moto.setDesligada(true);
		System.out.println("A marca da Moto é : " + moto.getMarca());
		System.out.println("O modelo da Moto é : " + moto.getModelo());
		System.out.println("A cor da Moto é : " + moto.getCor());
		System.out.println("A moto está na Marcha " + moto.getUsarMarcha());

	}

}
