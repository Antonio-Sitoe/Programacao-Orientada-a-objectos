
public class ContaOrdem extends Conta{
	
	private String tipoConta;

	public ContaOrdem(int numero, String titular, double saldo, String tipoConta) {
		super(numero, titular, saldo);
		this.tipoConta = tipoConta;
	}
	
	public void depositar(double valor) {
		super.saldo += valor - (valor*0.01);
	}
	
	public String toString() {
		return "Saldo: "+super.saldo;
	}

	public double calculaSaldoReal(){
		double saldoReal = super.saldo + (super.saldo * 1) / 100;
		return saldoReal;
	}
}
