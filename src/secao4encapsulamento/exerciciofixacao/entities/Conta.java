package secao4encapsulamento.exerciciofixacao.entities;

public class Conta {
	private String numero;
	private String nomeTitular;
	private double valorDepositoInicial;
	private double saldo = 0;
	
	public Conta(String numero, String nomeTitular) {
		super();
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.valorDepositoInicial = 0;
	}
	
	public Conta(String numero, String nomeTitular, double valorDepositoInicial) {
		super();
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo += valorDepositoInicial;
		//this.valorDepositoInicial = valorDepositoInicial;
		depositar(valorDepositoInicial);
	}
	
	public void depositar(double valor) {
		saldo +=valor;
		System.out.println("Updated Account Data:\n" + getSoDadosConta());
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor - 5;
		System.out.println("Updated Account Data:\n" + getSoDadosConta());
	}
	
	public String getDadosDaConta() {
		return "Account Data:\n"
				+ getSoDadosConta();
	}
	
	private String getSoDadosConta() {
		return "Account " + numero + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f", getSaldo());
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumero() {
		return numero;
	}

	public double getValorDepositoInicial() {
		return valorDepositoInicial;
	}

	public double getSaldo() {
		return saldo;
	}
	

}
