package application;
import entities.TesteObj_03;

import java.util.Locale;
import java.util.Scanner;

public class TesteObj03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		TesteObj_03 x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor das suas compras");
		System.out.println("Vamos saber quanto de desconto você tem direito");
		x = new TesteObj_03();
		y = new TesteObj_03();
		x.a = sc.nextFloat();
		x.b = sc.nextFloat();
		y.a = sc.nextFloat();
		y.b = sc.nextFloat();
		
		float desconto_x = x._Desconto();
		float desconto_y = y._Desconto();
		
	
		
		System.out.printf("Valor digitado: %.2f\n", x.a);
		System.out.printf("Valor digitado: %.2f\n", x.b);
		System.out.printf("Valor digitado: %.2f\n", y.a);
		System.out.printf("Valor digitado: %.2f\n", y.b);
		System.out.printf("Valor com Desconto x: %.2f\n", desconto_x);
		System.out.printf("Valor com Desconto y: %.2f\n", desconto_y);

		
		
		
		// loja com descontos progressivos
		// acima de 200 reais são 5%
		// acima de 500 reais são 10%
		// acima de 1000 reais são 15%
		// acima de 2000 reais 20%
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
