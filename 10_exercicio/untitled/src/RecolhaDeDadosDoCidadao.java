import java.util.Scanner;

public class RecolhaDeDadosDoCidadao {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira os dados do primeiro indivíduo:");
    System.out.print("Nome: ");
    String nome1 = scanner.nextLine();

    System.out.print("Sexo (M/F): ");
    char sexo1 = scanner.next().charAt(0);

    System.out.print("Estado Civil (C - Casado, S - Solteiro, D - Divorciado, V - Viúvo): ");
    char estadoCivil1 = scanner.next().charAt(0);
    System.out.print("Idade: ");
    int idade1 = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("\nInsira os dados do segundo indivíduo:");
    System.out.print("Nome: ");
    String nome2 = scanner.nextLine();

    System.out.print("Sexo (M/F): ");
    char sexo2 = scanner.next().charAt(0);

    System.out.print("Estado Civil (C - Casado, S - Solteiro, D - Divorciado, V - Viúvo): ");
    char estadoCivil2 = scanner.next().charAt(0);

    System.out.print("Idade: ");
    int idade2 = scanner.nextInt();


    Pessoa pessoa = new Pessoa(nome1, idade1, sexo1, estadoCivil1);
    Pessoa pessoa2 = new Pessoa(nome2, idade2, sexo2, estadoCivil2);

    System.out.println("\nDados do primeiro indivíduo:");
    pessoa.imprimirDados();;

    System.out.println("\nDados do segundo indivíduo:");
    pessoa2.imprimirDados();
   
    scanner.close();
    }
}
