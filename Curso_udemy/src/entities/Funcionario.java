package entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double tax;
	
	public double Salario_Taxado(double salario, double tax) {
		double x;
		x = salario -  tax;
		return x;
	}
	
	
	
	
}
