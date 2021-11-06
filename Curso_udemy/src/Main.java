import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5200;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.5;
		double measure = 53.234567;
		
		System.out.print("Products:%n");
		System.out.printf("%s price: %.2f %n",product,price1);
		System.out.printf("%s price: %.2f %n" ,product2,price2);
		System.out.printf("Record: %d yers old, cod: %d and Gender: %c %n",age,code,gender);
		System.out.printf("Measure: %f %n",measure);
		System.out.printf("Measure 3 after dot: %.2f %n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("MEasure dot %.3f",measure);
		
		
	}

}
