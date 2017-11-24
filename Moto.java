
public class Moto {
	private int UsarMarcha;
	public int Marcha;
	public String marca ,modelo , cor ;
	public boolean ligada ,desligada ;
	
	
	Moto() {
		
	}
	void sobeMarcha() {
		if ( Marcha < 5) {
			Marcha ++;
		}
		
		
	}
	void desceMarcha() {
		if (Marcha > 0) {
			Marcha --;
		}
		
	}
	void ValidaMarcha() throws Exception {
		if (Marcha > 0) {
			throw new Exception ("A Marcha não pode ser menor que 0");
		}else if ( Marcha < 5) {
			throw new Exception ("A Marcha não pode ser maior que 5");
		}
		
	}
	void Motoligada() {
		
	}


	public int getUsarMarcha() {
		return UsarMarcha;
	}


	public void setUsarMarcha(int usarMarcha) {
		UsarMarcha = usarMarcha;
	}


	public int getMarcha() {
		return Marcha;
	}


	public void setMarcha(int marcha) {
		Marcha = marcha;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public boolean isLigada() {
		return ligada;
	}


	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}


	public boolean isDesligada() {
		return desligada;
	}


	public void setDesligada(boolean desligada) {
		this.desligada = desligada;
	}
	

}
