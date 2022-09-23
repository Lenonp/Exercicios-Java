package CarroEstudo;

public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String combustivel;
    private double motor;
    private int qntPorta;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
    public int getQntPorta() {
        return qntPorta;
    }
    public void setQntPorta(int qntPorta) {
        this.qntPorta = qntPorta;
    }

    public void imprimir(){
        System.out.println("Carro da Marca: " + marca);
        System.out.println("O Modelo: " + modelo);
        System.out.println("A Placa: " + placa);
        System.out.println("A Cor: " + cor);
        System.out.println("Tipo de Combustivel: " + combustivel);
        System.out.println("Potencia do Motor: " + motor);
        System.out.println("Quantidade de porta: " + qntPorta);
    }
    
}
