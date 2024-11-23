import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in); 

        
        System.out.print("Digite a marca do eletrodoméstico: ");
        String marca = scanner.nextLine(); 

        System.out.print("Digite o modelo do eletrodoméstico: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a preco do eletrodoméstico: ");
        double preco = scanner.nextDouble();

        Electrodoméstico cadeira = new Electrodoméstico(marca, modelo, preco);
        cadeira.visualizarElectrodomestico();

        scanner.close();
    }
}
