
public class ContaPrazo extends Conta{

	public ContaPrazo(int numero, String titular, double saldo) {
		super(numero,titular,saldo);
	}
	
	public void depositar(double valor) {
		super.saldo += valor + (valor * 0.03);
	}
	
	
	public String toString() {
		return "Saldo: "+super.saldo;
	}
}
