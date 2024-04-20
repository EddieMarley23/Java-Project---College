package entitites;

public class Pizza {

	private String molho;
	private String recheio;
	private String borda;

	public Pizza(String molho, String recheio, String borda) {

		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public double calcularValor() {
		double vm = 0;
		double vr = 0;
		double vb = 0;
		double Total = 0;

		if (molho == "Especial") {
			vm = 10.00;
		}
		if (recheio == "Mussarela") {
			vr = 20.00;
		}
		if (borda == "recheada") {
			vb = 10.00;
		}

		Total = vm + vr + vb;

		return Total;
	}

	public double getValor() {
		return calcularValor();
	}

	public String toString() {
		return String.format("%.2f", calcularValor());
	}

}
