package RendaFuncionario;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String matricula;
    private String cpf;
    private double salario;
    private Date dataAdmissao;

    //*  Metodos */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date data) {
        this.dataAdmissao = data;
    }

    public void setReceberAumento(double aumento){
        double receberAumento = aumento;
    }

    public double getCalcularGanhoBrutoAnual(){
        this.salario = salario * 12;
        return salario;
    }

    public double getCalculaImposto(){
        double inss = 0;

            if(salario >= 2501){
                inss = salario * 0.175 - salario;
            }
            else {
                inss = salario * 0.11 - salario; 
            }        

        return inss * 12;
    }

    public double getCalcularGanhoLiquidoMensal(){
        double inss = 0;

            if(salario >= 2501){
                inss = salario * 0.175 - salario;
            }
            else {
                inss = salario * 0.11 - salario; 
            }        

        return inss - salario;
    }

    public double getCalcularGanhoLiquidoAnual(){
        double inss = 0;

            if(salario >= 2501){
                inss = salario * 0.175 - salario;
            }
            else {
                inss = salario * 0.11 - salario; 
            }        

        return (inss - salario) * 12;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + salario);
        System.out.println("Data Admissão: " + dataAdmissao);
        System.out.println("Cpf: " + cpf);
    }

}
