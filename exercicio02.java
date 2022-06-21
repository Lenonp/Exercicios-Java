import java.util.Scanner;

/**abstract
 * Construa um programa que receba a idade de uma pessoa 
 * e identifique sua classe eleitoral: não eleitor (menor que 16 anos de idade)
 * eleitor obrigatorio (entre 18 e 65 anos) e eleitor facultativo 
 * (entre 16 e 18 anos e maior que 65 anos).
 */

public class exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Informe a Idade");
        idade = sc.nextInt();

        if(idade < 16){
            System.out.println("Não Eleitor");
        }
        else{
            if ((idade < 18) || (idade > 65)){
                System.out.println("Eleitor Facultativo");
            }
            else {
                System.out.println("Eleitor Obrigatorio");
            }
        }
        sc.close();
        
    }

}
