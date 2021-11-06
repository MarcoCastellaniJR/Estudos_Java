package application;

import java.util.Scanner;

import entities.TesteMaior;
import entities.TesteObj_o2;

public class TesteObj02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		TesteMaior x,y; // declarar 
		
		x = new TesteMaior(); // declarar new + function
		y = new TesteMaior();
		
		System.out.println("Digite os Valores de X");
		System.out.println("Para o teste de Maior:");
		x.a = sc.nextDouble(); // declarar as variaveis, e a interna
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		x.d = sc.nextDouble();
		double maioresx = x.Testando(); // declarar o resultado function
		
		System.out.println("Digite os valores de Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		y.d = sc.nextDouble();
		double maioresy = y.Testando();
		
		System.out.printf("Teste 01X : %.2f \n",maioresx);
		System.out.printf("Teste 02Y : %.2f",maioresy);
		
		
		
		
		sc.close();
	}
}
