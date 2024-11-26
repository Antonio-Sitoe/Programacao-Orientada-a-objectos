import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorDeContas {
    public static void escreveNoFicheiro(Conta conta, String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo, true)) {
            writer.write(conta.toString() + "\n");
            System.out.println("Dados da conta escritos no arquivo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ContaOrdem contaOrdem = new ContaOrdem(0, "Santos Ndzeko", 0, "Individual");
        ContaPrazo contaPrazo = new ContaPrazo(0, "WhiteLanga", 0);

        String nomeArquivo = "contas.txt";

        escreveNoFicheiro(contaOrdem, nomeArquivo);
        escreveNoFicheiro(contaPrazo, nomeArquivo);
    }
}
