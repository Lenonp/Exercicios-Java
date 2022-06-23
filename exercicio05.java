import java.util.Scanner;

/**
 *Escreva um programa que permita armazenar N (valor informado
pelo usuário) valores em um vetor. O armazenamento dos valores
deverá seguir as seguintes regras: 

a). Não poderá ser aceito valores repetidos.

b). O valores devem ser armazenados em ordem crescente.
 */

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorA;
        int i, j;
        int troca;

        System.out.println("Informe a quantos numeros vai Digitar");
        vetorA = sc.nextInt();

        int[] vet = new int[vetorA];


        for (i = 0; i < vetorA; i++) {
            System.out.printf("\nDigite o elemento: ", i);
            vet[i] = sc.nextInt();
        }

        for (i = 0; i < vetorA; i++) {

            for (j = i; j < vetorA; j++){

                if (vet[i] > vet[j]) {

                    troca = vet[i];
                    vet[i] = vet[j];
                    vet[j] = troca;
                }
            }
        }

        System.out.print("\nVetor Ordenado: ");
        for (i = 0; i < 10; i++) {
            System.out.print(vet[i] + " - ");
        }
        sc.close();

  
    }
    
}
