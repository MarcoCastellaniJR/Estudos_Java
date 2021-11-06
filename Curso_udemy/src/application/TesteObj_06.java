package application;
import entities.Funcionario;

import java.util.Scanner;


public class TesteObj_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcio = new Funcionario();
		System.out.println("Vamos ler os dados do funcionário:");
		System.out.println("Digite o Nome do funcionário: ");
		funcio.nome = sc.nextLine();
		System.out.print("Digite o Salário: ");
		funcio.salario = sc.nextDouble();
		System.out.print("Digite a Taxa : ");
		funcio.tax = sc.nextDouble();
		
		System.out.printf("Salário Taxado : %.2f",funcio.Salario_Taxado(funcio.salario,funcio.tax));
		
		
		
		
		
		System.out.printf(" Nome [%s]",funcio.nome);
		System.out.printf("Salario: %.2f",funcio.salario);
		System.out.printf("Taxa: %.2f",funcio.tax);
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
