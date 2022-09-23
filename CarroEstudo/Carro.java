package CarroEstudo;

public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String combustivel;
    private double motor;
    private int qntPorta;
    private int velocidade;

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
    
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
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

    private boolean estaAcelerando = false;

    public void acelerar(){

        estaAcelerando = true;

        if(velocidade >= 115)
            System.out.println(" O Carro esta em Alta Velocidade " + velocidade + "Km/h" );

        else if ( velocidade >= 70 && velocidade <= 110)
            System.out.println(" O Caro esta em velocidade Permitida " + velocidade + "Km/h");

        else if ( velocidade >= 40 && velocidade <= 69)
            System.out.println(" O Caro esta em baixa velocidade " + velocidade + "Km/h");
        
        else if ( velocidade >= 1 && velocidade <= 39)
            System.out.println(" O carro esta Saindo ou Parando " + velocidade + "Km/h");
        else
            System.out.println("O carro esta Parado");
    }
    
}
