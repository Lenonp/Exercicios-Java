package CarroEstudo;

public class AppCarro {
    public static void main(String[] args) {
        
        Carro car = new Carro();
        car.setMarca("BMW");
        car.setModelo("X1");
        car.setPlaca("FF3I-985");
        car.setCor("Branca");
        car.setCombustivel("Gasolina");
        car.setMotor(2.0);
        car.setQntPorta(5);
        car.setVelocidade(15);
        
        car.imprimir();
        car.acelerar();
    }
}
