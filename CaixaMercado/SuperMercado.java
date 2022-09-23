package CaixaMercado;

public class SuperMercado {
    public static void main(String[] args) {
        
        Produtos  produto01 = new Produtos();
        Produtos  produto02 = new Produtos();
        Produtos  produto03 = new Produtos();
        Produtos  produto04 = new Produtos();
        Produtos  produto05 = new Produtos();
        Produtos  produto06 = new Produtos();


        produto01.nome = "Banana";
        produto01.valor = 0.99;
        produto01.tipo = 2;
        produto01.quantidade = 3;
        
        produto02.nome = "Energetico";
        produto02.valor = 5.49;
        produto02.tipo = 3;
        produto02.quantidade = 7;
        
        produto03.nome = "Arroz";
        produto03.valor = 20.0;
        produto03.tipo = 1;
        produto03.quantidade = 1;
        
        produto04.nome = "Chocolate";
        produto04.valor = 4.50;
        produto04.tipo = 1;
        produto04.quantidade = 12;
        
        produto05.nome = "Leite";
        produto05.valor = 3.73;
        produto05.tipo = 3;
        produto05.quantidade = 5;

        produto06.nome = "Abacaxi";
        produto06.valor = 2.40;
        produto06.tipo = 2;
        produto06.quantidade = 1;

        produto04.exibirProduto();

    }
}
