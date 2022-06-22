import java.util.Scanner;

/**
 * De acordo com uma tabela médica, o peso ideal está relacionado 
 * com altura e sexo. Elabore um algoritimo que receba altura e sexo 
 * de uma pessoa e calcule e imprima o seu peso ideal, sabendo que:
 * **** Para Homens....(72.7 x altura) - 58   ****
 * **** Para Mulheres..(62.1 x altura) - 44.7 ****
 */


public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        double peso;
        char sexo;

        System.out.println("Informe o Sexo (M/F):");
        sexo = sc.next().charAt(0);
        System.out.println("Informe a Altura: ");
        altura = sc.nextDouble();
        
        if ((sexo == 'F') || (sexo == 'f')) {
            peso = (62.1 * altura) - 44.7;
        }
        else {
            peso = (72.7 * altura) - 58;
        }

        System.out.println(" O Seu Sexo é: " + sexo);
        System.out.println(" A Sua Altura é: " + String.format("%.2f", altura));
        System.out.println(" O Seu Peso ideal é: " + String.format("%.2f", peso));

        sc.close();
    }
}
