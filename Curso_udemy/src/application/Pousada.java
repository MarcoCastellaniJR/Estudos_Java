package application;

import entities._Quartos;

import java.util.Scanner;

public class Pousada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_Quartos[] vect = new _Quartos[10];
		System.out.print("Digite quantos quartos você deseja ocupar: ");
		int reservar = sc.nextInt();
		for (int i = 0; i < reservar; i++) {
			sc.nextLine();
			System.out.print("Digite o nome para o Registro: \n");
			String nome1 = sc.nextLine();
			System.out.print("Digite o E-mail para contato: \n");
			String email1 = sc.nextLine();
			System.out.print("Qual o número do quarto que vocÊ deseja alugar?");
			int nmr_reserva = sc.nextInt();
			//System.out.print(nome1);
			//System.out.print(email1);
			vect[nmr_reserva] = new _Quartos(nome1, email1);
			
		}
		
		for (int t=0;t<10;t++) {
			if (vect[t] != null) {
				System.out.print(vect[t]);
			} else {
				System.out.print("..");
			}
		}
		/*
		 * for (int p = 0; p<10;p++) { //_Quatos[p] = vect[p]; p.setEmail(vect[p]);
		 * //vect[p].setNome(null);
		 * 
		 * }
		 */
		/*for (int o = 0; o < 10; o++) {
			System.out.println(vect[o].getEmail());
			System.out.println(vect[o].getNome());
			// System.out.printf();
		}*/

		// _Quartos[] quartos_v[] = new _Quartos[10];

		/*
		 * for (int i = 0;i<quartos_v.length; i++) { int quartos_v[i] = new _Quartos();
		 * }
		 */

		// System.out.printf("ocup: %d",ocup);
		sc.close();
	}

}
