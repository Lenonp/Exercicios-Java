public class exercicio08 {
    
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
