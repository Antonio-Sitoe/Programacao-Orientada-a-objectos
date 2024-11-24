public class Funcionario {
    private String nome;
    private int qtdDiasTrabalhadas;
    private double valorDiario;

    private static int qtdDeInstancias = 0;

    public Funcionario(int qtdDiasTrabalhadas, double valorDiario, String nome) {
        this.qtdDiasTrabalhadas = qtdDiasTrabalhadas;
        this.valorDiario = valorDiario;
        this.nome = nome;
        qtdDeInstancias++;
    }

    public int getQtdDiasTrabalhadas() {
        return this.qtdDiasTrabalhadas;
    }

    public double getValorDiario() {
        return this.valorDiario;
    }

    public void setQtdDiasTrabalhadas(int qtdDiasTrabalhadas) {
        this.qtdDiasTrabalhadas = qtdDiasTrabalhadas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularSalario() {
        return this.qtdDiasTrabalhadas * this.valorDiario;
    }

    public double calcularSalario(double qtdDiasTrabalhadas){
        return qtdDiasTrabalhadas * this.valorDiario;
    }

    public static double calcularSalario(int qtdDiasTrabalhadas, double valorDiario){
        return qtdDiasTrabalhadas * valorDiario;   
    }

    public static int getQuantidadeDeInstancias(){
        return qtdDeInstancias;
    }


    @Override
    public String toString() {
        return "Funcionario { " +
                "Nome: '" + nome + '\'' +
                ", Dias Trabalhados: " + qtdDiasTrabalhadas +
                ", Valor Diário: R$" + valorDiario +
                ", Salário: R$" + calcularSalario() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Funcionario outroFuncionario = (Funcionario) obj;
        return this.nome.equals(outroFuncionario.nome) && 
               this.qtdDiasTrabalhadas == outroFuncionario.qtdDiasTrabalhadas &&
               this.valorDiario == outroFuncionario.valorDiario;
    }
}
