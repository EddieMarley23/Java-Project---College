package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Pedido;

import entitites.Prato;

import util.Menu;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		
		

		System.out.print("Olá Informe seu nome:");
		String nome = sc.nextLine();
		Pedido pedido = new Pedido(nome);
		List<Prato> list = new ArrayList<Prato>();

		System.out.println();

		System.out.printf("Quantos pedidos deseja fazer? %nR: ");
		
		int n = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i< n; i++) {
		pedido = Menu.exibirMenu(pedido,list);
		}
		
		pedido.mostrarFatura();
		
		sc.close();
	}

}
