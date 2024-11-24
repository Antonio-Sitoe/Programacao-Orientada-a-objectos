import java.util.ArrayList;
import java.util.Scanner;

public class ProcessaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        System.out.println("Vamos register funcionarios: ");
        System.out.println("--------------------------------- ");

        for (int i = 0; i < 2; i++) {
            System.out.println("");
            System.out.println("Digite o nome do funcionario  ");
            String nome = scanner.nextLine();

            System.out.println("Digite a quantidade de dias trabalhadas  ");
            int qtdDiasTrabalhadas = scanner.nextInt();

            System.out.println("Digite o valor por hora  ");
            double valorDiario = scanner.nextDouble();


            Funcionario funcionario = new Funcionario(qtdDiasTrabalhadas, valorDiario, nome);
            funcionarios.add(funcionario);
            
            System.out.println("------------------------");
        }

        Funcionario func1 = funcionarios.get(0);
        Funcionario func2 = funcionarios.get(1);
        int quantidadeInstancias = Funcionario.getQuantidadeDeInstancias();
        double salario = Funcionario.calcularSalario(24, 900);

        System.out.println("SAO IGUAIS  "+ func1.equals(func2));

        System.out.println("Objecto 1  " + func1.toString());
        System.out.println("Objecto 2 " + func2.toString());
        System.out.println("SObrecarga 1  "+ func1.calcularSalario());
        System.out.println("SObrecarga 2  "+ func1.calcularSalario(21));
        System.out.println("Quantidade de instancias " + quantidadeInstancias);
        System.out.println("Salario ilustrado " + salario);
    }
}
