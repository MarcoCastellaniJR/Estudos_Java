package application;
import entities._Conta_Corrente;
import java.util.Scanner;

public class _Banco_Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		_Conta_Corrente account = new _Conta_Corrente();
		System.out.println("Enter account number:");
		account.conta = sc.nextInt();
		System.out.println("Enter account Name:");
		sc.nextLine();
		account.nome = sc.next();
		char ask;
		System.out.println("Is there an initial deposit? [y/n]:  ");
		ask = sc.next().charAt(0);
		if (ask == 'y') {
			System.out.println("Enter initial deposit value; ");
			account.corrente = sc.nextDouble();
		}
		System.out.printf(" CODE = %d \n"
				+ "NAME = %s \n"
				+ "ContaCorrente = %.2f \n",account.conta,account.nome,account.corrente);
		System.out.println("Enter a deposite value: ");
		double deposito_mais = sc.nextDouble();
		account.Deposito_ADD(deposito_mais);
		 
		System.out.printf(" CODE = %d \n"
				+ "NAME = %s \n"
				+ "ContaCorrente = %.2f \n",account.conta,account.nome,account.corrente);
		System.out.println("Enter a withdraw value: ");
		double deposito_menos = sc.nextDouble();
		account.Deposito_OUT(deposito_menos);
		
		
		
		System.out.printf("Conta = %d \n", account.conta);
		System.out.printf("Nome = %s \n", account.nome);
		System.out.printf("Saldo =%.2f \n ", account.corrente);
		sc.close();
		
	}
}
