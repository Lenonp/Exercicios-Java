import java.util.ArrayList;
import java.util.Random;

import javax.swing.BoundedRangeModel;


public class exercicio04 {

    public static void main(String[] args) {     

        
        Random random = new Random();

        int[] numerosAleatorio = new int[20];

        for (int i = 0; i < numerosAleatorio.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorio[i] = numero;
        }

        System.out.print("\nNumeros Aleatorio. ");
        for (int numero : numerosAleatorio) {
            System.out.print(numero + " ");
        }
    
        System.out.print("\nSucessores dos numeros Aleatorios. ");
        for (int numero : numerosAleatorio) {
            System.out.print((numero + 1) + " ");
        }

    }
}
