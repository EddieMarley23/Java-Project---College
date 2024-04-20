package entitites;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private String nameCliente;
	private Double taxaServico;
	private List<Prato> itensConsumidos = new ArrayList<Prato>();

	public Pedido(String nameCliente, Double taxaServico, List<Prato> itensConsumidos) {

		this.nameCliente = nameCliente;
		this.taxaServico += taxaServico;
		this.itensConsumidos = itensConsumidos;
	}

	public Pedido(Double taxaServico, List<Prato> itensConsumidos) {

		this.taxaServico += taxaServico;
		this.itensConsumidos = itensConsumidos;
	}

	public String getNameCliente() {
		return nameCliente;
	}

	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}

	public Double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(Double taxaServico) {
		this.taxaServico = taxaServico;
	}

	public List<Prato> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(List<Prato> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public Pedido(String nameCliente) {
		this.nameCliente = nameCliente;
	}

	public void PrintItens() {

		for (Prato x : itensConsumidos) {
			System.out.println(x);
		}
	}

	public double calcular_ValorTotal() {
		
		double x = 0;
		for (int i = 0; i < itensConsumidos.size(); i++) {
		 x += itensConsumidos.get(i).getValor();
		}
		
	
		return x;
	}

	public void mostrarFatura() {
		System.out.printf("%n%n*****************************");
		System.out.printf("%n%nFatura:%nCliente:" + nameCliente + "%n%n");
		PrintItens();
		System.out.printf("%n%n");
		System.out.print("Total do pedido: R$"+ String.format("%.2f",calcular_ValorTotal()));
	}

}
