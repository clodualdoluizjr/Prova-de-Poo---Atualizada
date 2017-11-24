
public class Veiculo extends Motor{
	public int peso;
	public int veloMax;
	public float Preco;

	Veiculo() {
		peso = 0;
		veloMax = 0;
		Preco = 0;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVeloMax() {
		return veloMax;
	}

	public void setVeloMax(int veloMax) {
		this.veloMax = veloMax;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}
	

}
