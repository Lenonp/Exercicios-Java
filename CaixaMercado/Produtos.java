package CaixaMercado;
import javax.swing.JOptionPane;

/**
 * Produtos
 */
public class Produtos {

        public String nome;
        public double valor;
        public int tipo;
        public int quantidade;

        public void exibirProduto() {
            JOptionPane.showMessageDialog(null, "\nNome do Produto: " + nome + "\nQuantidade: " + quantidade + 
            "\nTipo: " + tipo + "\nValor: R$" + valor);
        }
    
}