package carros;

/**
 * Carro
 */
public class Carro {

    // *** Definindo Atributos basico - Carro tem. ***

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // *** Definindo Metodos Basicos - Carro Faz. ***
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }


    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }
    
}