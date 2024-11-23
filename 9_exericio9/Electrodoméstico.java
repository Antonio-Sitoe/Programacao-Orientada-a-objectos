public class Electrodoméstico {
    private String marca;
    private String modelo;
    private double preco;

    public Electrodoméstico(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public void visualizarElectrodomestico() {
        System.out.println("DADOS DO ELECTRODOMESTICO");
        System.out.println("MODELO " + modelo);
        System.out.println("PRECO " + preco);
        System.out.println("MARCA " + marca);
    }
}
