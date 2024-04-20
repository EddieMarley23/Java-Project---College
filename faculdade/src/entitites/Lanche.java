package entitites;

public class Lanche {
	
	private String pao;
	private String recheio;
	private String molho;
	
	public Lanche(String pao, String recheio, String molho) {
		
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}

	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public double calcularValor() {
		double vp = 0;
		double vr = 0;
		double vm = 0;
		double Total = 0;

		if (pao == "Francês") {
			vp = 15.00;
		}
		if (recheio == "Mussarela") {
			vr = 20.00;
		}
		if (molho == "Especial") {
			vm = 10.00;
		}

		Total = vm + vr + vp;

		return Total;
	}

	public double getValor() {
		return calcularValor();
	}

	public String toString() {
		return String.format("%.2f", calcularValor());
	}
	

}
