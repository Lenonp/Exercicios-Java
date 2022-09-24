package EstudosLogica;
import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade, ano;
        double altura, peso, pesoIdeal;

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();

        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();

        ano = 2022 - idade;

        double imc = 0;
        imc = peso / (altura * altura);
        pesoIdeal = (altura * altura) * 22;

        if(imc >= 18.5 && imc <= 24.9)
            System.out.println("O usuario esta com seu peso normal " + peso + "Kg ");

        else if (imc >= 25.0 && imc <= 29.9)
            System.out.println("O usuario esta com sobrepeso " + peso + "Kg "  + "Seu Peso Ideal é: " + ((pesoIdeal * 0.05) + pesoIdeal) + "Kg ");
        
        else if (imc >= 30 && imc <= 39)
            System.out.println("O usuario esta em Obesidade " + peso + "Kg " + "Seu Peso Ideal é: " + ((pesoIdeal * 0.05) + pesoIdeal) + "Kg ");

        else if (imc > 40)
            System.out.println("O usuario esta com Obesidade Grave " + peso + "Kg " + "Seu Peso Ideal é: " + ((pesoIdeal * 0.05) + pesoIdeal) + "Kg ");

        else 
            System.out.println("O usuario esta Abaixo do peso: " + peso + "Kg " + "Seu Peso Ideal é: " + ((pesoIdeal * 0.05) + pesoIdeal) + "Kg ");


        System.out.println(" O nome do Usuario é: " + nome + " " + " nascido em: " + ano);
        System.out.println(" Com a idade de: : " + idade + " anos ");
        System.out.println("A sua altura é : " + altura);
        
      
       
    }
}
