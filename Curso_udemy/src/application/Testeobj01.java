package application;

import java.util.Scanner;
import entities.Soma;

public class Testeobj01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Soma x,y;
		x = new Soma();
		y = new Soma();
		
		System.out.println("Digite os Quatro valores para X: ");
		x.a = sc.nextInt();
		x.b = sc.nextInt();
		x.c = sc.nextInt();
		x.d = sc.nextInt();
		//int somax = x.a + x.b + x.c + x.d;
		int somax = x.soma();
		
		
		System.out.println("Digite os Quatro valores para Y: ");
		y.a = sc.nextInt();
		y.b = sc.nextInt();
		y.c = sc.nextInt();
		y.d = sc.nextInt();
		//int somay = y.a + y.b + y.c + y.d;
		int somay = y.soma();
		System.out.printf("Para x (%d + %d + %d + %d) = %d \n",x.a,x.b,x.c,x.d,somax);
		System.out.printf("Para y (%d + %d + %d + %d) = %d",y.a,y.b,y.c,y.d,somay);
		
		
		sc.close();		
	}
}
