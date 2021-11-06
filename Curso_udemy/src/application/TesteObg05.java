package application;

import java.util.Scanner;

public class TesteObg05 {
	public static void main(String[] args) {
		// 1 produto com preço e qtd estoque
		// valor total em estoque
		Scanner sc = new Scanner(System.in);
		int estoque;
		float price;
		String nome;
		System.out.print("Enter product data:\n");
		System.out.print("Name of the product: ");
		nome = sc.next();
		System.out.print("Price of the produtct");
		price = sc.nextFloat();
		System.out.print("Quantity in stock: ");
		estoque = sc.nextInt();

		System.out.printf("Product [%s]\n" + "Price [%.2f]\n" + "Quantity in stock [%d]\n", nome, price, estoque);

		int acao;
		;
		System.out.print("[1] Adicionar produtos \n [2] Retirar produtos");
		acao = sc.nextInt();
		while (acao != 1 && acao != 2) {
			System.out.print("Dado Inválido;");
			System.out.print("[1] Adicionar produtos \n [2] Retirar produtos");
			acao = sc.nextInt();
		}
		while (acao != 3) {

			if (acao == 1) {
				int add;
				System.out.print("Quantos produtos você deseja adicionar? \n ::");
				add = sc.nextInt();
				estoque += add;
				System.out.printf("Product [%s]\n" + "Price [%.2f]\n" + "Quantity in stock [%d]\n", nome, price, estoque);
				System.out.print("[1] Adicionar produtos \n [2] Retirar produtos \n [3] Parar");
				acao = sc.nextInt();
			} else if (acao == 2) {
				int men;
				System.out.print("Quantos produtos você deseja retirar? \n ::");
				men = sc.nextInt();
				estoque -= men;
				System.out.printf("Product [%s]\n" + "Price [%.2f]\n" + "Quantity in stock [%d]\n", nome, price, estoque);
				System.out.print("[1] Adicionar produtos \n [2] Retirar produtos \n [3] Parar");
				acao = sc.nextInt();
			} else {
				System.out.printf("Product [%s]\n" + "Price [%.2f]\n" + "Quantity in stock [%d]\n", nome, price, estoque);
				System.out.print("Dado Inválido;");
				System.out.print("[1] Adicionar produtos \n [2] Retirar produtos \n [3] para Parar;");
				acao = sc.nextInt();
			}
			
		}

		sc.close();

	}
}
