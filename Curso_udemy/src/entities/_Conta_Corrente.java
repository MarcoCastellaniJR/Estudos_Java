package entities;

public class _Conta_Corrente {
	public int conta;
	public String nome;
	public double corrente;
	
	
	public _Conta_Corrente() {
	}
	public _Conta_Corrente(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	public _Conta_Corrente(int conta, String nome, double corrente) {
		this.conta = conta;
		this.nome = nome;
		this.corrente = corrente;
	}
	public double Deposito_ADD(double n) {
		corrente += n;
		return corrente;
	}
	public double Deposito_OUT(double n) {
		corrente -= n;
		corrente = corrente - 5.0;
		return corrente;
	}
	
	
	
	
	
	
}
