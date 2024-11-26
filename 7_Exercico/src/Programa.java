
public class Programa {
	public static void main(String[] args) {

		ContaOrdem contaOrdem = new ContaOrdem(0, "Santos Ndzeko", 0, "Individual");
		ContaPrazo contaPrazo = new ContaPrazo(0, "WhiteLanga", 0);

		contaOrdem.depositar(1000);
		contaPrazo.depositar(1000);

		System.out.println(contaOrdem);
		System.out.println(contaPrazo);

		Conta conta1 = contaOrdem;
		Conta conta2 = contaPrazo;

		conta1.depositar(1000);
		conta2.depositar(1000);

		System.out.println(conta1);
		System.out.println(conta2);

	}
}
