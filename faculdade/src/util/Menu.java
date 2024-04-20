package util;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Lanche;
import entitites.Pedido;
import entitites.Pizza;
import entitites.Prato;
import entitites.Salgadinho;

public class Menu {

	public static Pedido exibirMenu(Pedido pedido, List<Prato> list) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println();
		System.out.printf("Escolha o número do Iten do pedido: %n1.Pizza%n2.Salgadinho%n3.Lanche%nR:");
		int item = sc.nextInt();

		String molho = null;
		String recheio = null;
		String borda = null;
		String pao = null;
		String massa = null;

		double taxa = 0;
		int opcRecheio = 0;
		int opcMolho = 0;

		Prato prato;
		Salgadinho salg;
		Pizza pizza;
		Lanche lanch;
		if (item == 1) {

			System.out.printf("%nQual molho?%n1.Especial%n");
			System.out.print("Escolha: ");
			opcMolho = sc.nextInt();
			if (opcMolho == 1) {
				molho = "Especial";
			}
			System.out.printf("%nQual recheio?%n1.Mussarela%n");
			System.out.print("Escolha: ");
			opcRecheio = sc.nextInt();
			if (opcRecheio == 1) {
				recheio = "Mussarela";
			}
			System.out.printf("%nQual Borda?%n1.Recheada%n");
			System.out.print("Escolha: ");
			int opcBorda = sc.nextInt();
			if (opcBorda == 1) {
				borda = "recheada";
			}

			pizza = new Pizza(molho, recheio, borda);

			taxa = pizza.getValor();

			prato = new Prato(item, taxa);

			list.add(prato);

			pedido.setTaxaServico(taxa);
			pedido.setItensConsumidos(list);
		}
		if (item == 2) {

			

			System.out.printf("%nQual recheio?%n1.Mussarela%n");
			System.out.print("Escolha: ");
			opcRecheio = sc.nextInt();

			if (opcRecheio == 1) {
				recheio = "Presunto";
			}
			System.out.printf("%nQual Borda?%n1.Recheada%n");
			System.out.print("Escolha: ");
			int opcMassa = sc.nextInt();
			if (opcMassa == 1) {
				massa = "Frita";
			}

			salg = new Salgadinho(recheio, massa);

			taxa = salg.getValor();

			prato = new Prato(item, taxa);

			list.add(prato);

			pedido.setTaxaServico(taxa);
			pedido.setItensConsumidos(list);

		}

		if (item == 3) {

			System.out.printf("%nQual recheio?%n1.Francês%n");
			System.out.print("Escolha: ");
			int opcPao = sc.nextInt();

			if (opcPao == 1) {
				pao = "Francês";
			}

			System.out.printf("%nQual Recheio?%n1.Mussarela%n");
			System.out.print("Escolha: ");
			int opcrecheio = sc.nextInt();
			if (opcrecheio == 1) {
				recheio = "Mussarela";
			}

			System.out.printf("%nQual Molho?%n1.Especial%n");
			System.out.print("Escolha: ");
			int opcmolho = sc.nextInt();
			if (opcmolho == 1) {
				molho = "Especial";
			}

			lanch = new Lanche(pao, recheio, molho);

			taxa = lanch.getValor();

			prato = new Prato(item, taxa);

			list.add(prato);

			pedido.setTaxaServico(taxa);
			pedido.setItensConsumidos(list);

		}
		
		return pedido;

	}

}
