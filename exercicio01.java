import java.util.Scanner;
/**
 * Faça um programa que leia um numero e informe se ele é divisivel por cinco.
 */
public class exercicio01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num;

        System.out.println("Informe o Numero:");
        num = sc.nextInt();
        
        if (num % 5 == 0) {
            System.out.printf("O numero é divisivel por 5", + num);
        }
        else {
            System.out.printf("O numero não é divisivel por 5", + num);
        }

        sc.close();


    }
    
}