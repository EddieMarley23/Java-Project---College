package entitites;

public class Salgadinho {
	private String recheio;
	private String massa;
	
	
	public Salgadinho(String recheio, String massa) {
		
		this.recheio = recheio;
		this.massa = massa;
	}


	public String getRecheio() {
		return recheio;
	}


	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}


	public String getMassa() {
		return massa;
	}


	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	public  double calcularValor() {
		double vr = 0;
		double vm = 0;
		double Total = 0;
		
		
	
		if(recheio == "Presunto") {
			vr = 20.00;
		}
		if(massa == "Frita") {
			vm = 10.00;
		}
		
		Total = vr +  vm;

		return Total;
		}
	
	public double getValor() {
		return calcularValor();
	}

	
	
}
