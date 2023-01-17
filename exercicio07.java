/* Um professor de matemática pede a você que ajude a criar um programa 
que auxilie na resolução das operações em equação do segundo grau completas. 
Para isso ele pede que você crie um programa em que os alunos informem 
os 3 valores e o programa calcule a equação de segundo grau. 
O professor espera que o aluno tenha um entendimento claro do que está 
sendo solicitado e para isso ele quer que o programa solicite as 
variáveis da seguinte forma: */

import java.util.Scanner;

class Operacao {

    public int a;
    public int b;
    public int c;

    public Operacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Valor de a: ");
        a = sc.nextInt();
        System.out.println("Informe o Valor de b: ");
        b = sc.nextInt();
        System.out.println("Informe o Valor de c: ");
        c = sc.nextInt();

    }

    public double delta() {
        return (b * b) - (4 * a * c);
    }

    public void raizes(double valordelta) {
        double x1 = (-b + Math.sqrt(valordelta)) / (2 * a);
        double x2 = (-b - Math.sqrt(valordelta)) / (2 * a);
        System.out.println("O valor X1 é:" + " " + x1);
        System.out.println("O valor X2 é:" + " " + x2);
    }
}

public class exercicio07 {
    public static void main(String[] args) {

        Operacao objeto = new Operacao();
        double valordelta = objeto.delta();
        System.out.println("O valor de Delta é: " + " " + valordelta);

        if (valordelta < 0)
            System.out.print("Delta é menor que zero");

        else
            objeto.raizes(valordelta);
        System.out.println();

    }

}
