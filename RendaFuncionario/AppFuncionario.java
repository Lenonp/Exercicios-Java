package RendaFuncionario;

import java.util.Date;

public class AppFuncionario {
    public static void main(String[] args) {
        Date data = new Date();
        Funcionario elito = new Funcionario();

        elito.setNome("Élito Lenon Prates");
        elito.setMatricula("2243");
        elito.setSalario(500);
        elito.setDataAdmissao("25/10/2016");
        elito.setCpf("383.475.026.55");

        elito.setReceberAumento(3);
        elito.getCalcularGanhoBrutoAnual();
        elito.getCalcularGanhoLiquidoAnual();
        elito.getCalcularGanhoLiquidoMensal();

        elito.imprimir();


    }

}
