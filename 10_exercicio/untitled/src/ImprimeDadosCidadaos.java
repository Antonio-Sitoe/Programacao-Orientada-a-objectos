public class ImprimeDadosCidadaos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alberth", 34, 'M', 'C');
        Pessoa pessoa2 = new Pessoa("Rhosty", 27, 'F', 'S');
        Pessoa Pessoa3 = new Pessoa("Phaula", 72, 'F', 'V');

        pessoa.imprimirDados();
        System.out.println();
        pessoa2.imprimirDados();
        System.out.println();
        Pessoa3.imprimirDados();
    }
}
