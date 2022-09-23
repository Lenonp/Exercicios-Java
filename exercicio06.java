/* Você pode verificar que estudar programação possibilita criar operações simples e complexas
utilizando as estruturas de controle, seleção e repetição. No qual estas estruturas permitem 
que os programas produzam o melhor resultado: escalabilidade. Para esta atividade você deverá 
criar um programa em java para calcular e mostrar a média da soma dos 
números impares entre 1 e 1000 (inclusive) usando while. */

public class exercicio06 {

    public static void main(String[] args) {


        int soma = 0;
        int i = 1;
        double media;

        while (i <= 1000) {
            if (i % 2 == 1)
                soma += i;
            i++;
        }

        media = soma / (i * 1.0);

        System.out.println("A soma dos numeros imapares é: " + soma);
        System.out.println("A media dos numeros imapares é: " + String.format("%.2f", media));

    }
}