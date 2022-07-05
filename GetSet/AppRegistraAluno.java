package GetSet;
public class AppRegistraAluno {
    public static void main(String[] args) {
        
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();      
        
        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");

        System.out.println(beto.getNome());
        System.out.println("Contador " + RegistraAluno.getQuantidadeAlunos());
    }
}
