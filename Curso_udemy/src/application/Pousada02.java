package application;

import entities.Pousada_02;
import java.util.Scanner;

public class Pousada02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Pousada_02[] room = new Pousada_02[10];	
	
	for (int i=0;i<room.length;i++) {
		System.out.print("nome");
		String nome = sc.next();
		System.out.print("email");
		String emil = sc.next();
		
	}
	
	System.out.print(room);
	System.out.print(room[0]);
	System.out.print(room.nome[3]);
	


	
	
	sc.close();
	}
}
