package entitites;

public class Prato {
	private Integer item;
	private String dfIten;
	private Double valor;

	public Prato(Integer item, Double valor) {
		this.item = item;
		this.valor = valor;
		defineItem();
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Double getValor() {
		return valor;
	}

	public void defineItem() {
		if (item == 1) {
			dfIten = "Pizza";
		}
		if (item == 2) {
			dfIten = "Salgadinho";
		}
		if (item == 3) {
			dfIten = "Lanche";
		}
	}

	public String toString() {
		return dfIten + " R$ " + String.format("%.2f", valor);
	}
}
