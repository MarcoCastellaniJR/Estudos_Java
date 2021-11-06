package application;

import java.util.Scanner;
import entities.Products;

public class TesteObj05_02 {
	public static void main(String[] args) {
		// 1 produto com preço e qtd estoque
		// valor total em estoque
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		System.out.println("Enter product data:");
		System.out.println("Name; \n");
		product.name = sc.nextLine();
		System.out.println("Price");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data:" + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		
		
		
		
		sc.close();

	}
}
