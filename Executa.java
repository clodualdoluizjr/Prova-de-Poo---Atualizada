
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
		System.out.println("No carro ,a Pot�ncia � de : " + Motor.getPotencia());
		System.out.println("Na moto ,as Cilindradas s�o de : " + Motor.getCilindradas());

		System.out.println("-----------------------------------");

		// Veiculo
		System.out.println("Veiculo de ano 2018");
		Veiculo.setPeso(1500);
		Veiculo.setPotencia(200);
		Veiculo.setPreco(89000);
		Veiculo.setVeloMax(248);
		System.out.println("O peso deste Veiculo de : " + Veiculo.getPeso() + "kg");
		System.out.println("A P�tencia deste Veiculo � de : " + Veiculo.getPotencia() + "cv");
		System.out.println("O Pre�o deste Veiculo � de : " + Veiculo.getPreco() + "R$");
		System.out.println("A velocidade Maxima deste Veiculo � de : " + Veiculo.getVeloMax() + "KM/H");

		System.out.println("-----------------------------------");

		// Carro de Passeio
		System.out.println("Carro de ano 2018/Modelo mais atualizado");
		Carropasseio.setCor("Azul Imperial");
		Carropasseio.setModelo("Golf Gti 2.0 Tsi");
		Carropasseio.setPotencia(700);
		Carropasseio.setPeso(1100);
		Carropasseio.setVeloMax(236);
		Carropasseio.setPreco(100000);
		System.out.println("A cor deste carro � : " + Carropasseio.getCor());
		System.out.println("O modelo deste carro � : " + Carropasseio.getModelo());
		System.out.println("A p�tencia deste carro � de : " + Carropasseio.getPotencia() + "cv");
		System.out.println("O peso deste carro � de : " + Carropasseio.getPeso() + "Kg");
		System.out.println("A velocidade Maxima deste carro � de : " + Carropasseio.getVeloMax() + "KM/H");
		System.out.println("O pre�o deste carro � de : " + Carropasseio.getPreco() + "R$");

		System.out.println("-----------------------------------");

		// Caminh�o
		System.out.println("Caminh�o Usado");
		caminhao.setComprimento(25);
		caminhao.setPeso(2500);
		caminhao.setPotencia(1000);
		caminhao.setToneladas(10000);
		caminhao.setAlturaMax(7);
		caminhao.setPreco(55000);
		System.out.println("O comprimento deste Caminh�o � de : " + caminhao.getComprimento() + "m");
		System.out.println("O peso deste Camminh�o � de : " + caminhao.getPeso() + "Kg");
		System.out.println("A pot�ncia deste Caminh�o � de : " + caminhao.getPotencia() + "cv");
		System.out.println("Esse Caminh�o suporta : " + caminhao.getToneladas() + "Kg");
		System.out.println("A altura maxima deste Caminh�o � de : " + caminhao.getAlturaMax() + "M");
		System.out.println("O pre�o deste Caminh�o � de : " + caminhao.getPreco() + "R$");

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
		System.out.println("A marca da Moto � : " + moto.getMarca());
		System.out.println("O modelo da Moto � : " + moto.getModelo());
		System.out.println("A cor da Moto � : " + moto.getCor());
		System.out.println("A moto est� na Marcha " + moto.getUsarMarcha());

	}

}
