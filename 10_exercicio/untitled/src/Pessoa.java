public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private char estadoCivil;

    public Pessoa(String nome, int idade, char sexo, char estadoCivil) {
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.idade = idade;
        this.nome = nome;
    }

    public char getestadoCivil() {
        return estadoCivil;
    }

    public void setestadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void SetIdade(int idade) {
        this.idade = idade;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + (sexo == 'M' ? "Masculino" : "Feminino"));
        System.out.println("Estado Civil: " + estadoCivilPorExtenso());
        System.out.println("Idade: " + idade);
    }

    private String estadoCivilPorExtenso() {
        switch (estadoCivil) {
            case 'C':
                return "Casado";
            case 'S':
                return "Solteiro";
            case 'D':
                return "Divorciado";
            case 'V':
                return "Viúvo";
            default:
                return "Estado Civil Inválido";
        }
    }
}
