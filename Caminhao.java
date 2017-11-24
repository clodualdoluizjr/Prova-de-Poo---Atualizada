
public class Caminhao extends Veiculo {
	int Toneladas;
	int Comprimento;
	int AlturaMax;

	Caminhao() {
		Toneladas = 0;
		Comprimento = 0;
		AlturaMax = 0;
	}

	public int getToneladas() {
		return Toneladas;
	}

	public void setToneladas(int toneladas) {
		Toneladas = toneladas;
	}

	public int getComprimento() {
		return Comprimento;
	}

	public void setComprimento(int comprimento) {
		Comprimento = comprimento;
	}

	public int getAlturaMax() {
		return AlturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		AlturaMax = alturaMax;
	}

}
