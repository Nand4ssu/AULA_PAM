
package projetobanco;

import javax.swing.JOptionPane;

public class ProjetoBanco {

    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta = new Conta();
        
        conta.nome = JOptionPane.showInputDialog("Digite seu nome");
        conta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu saldo"));
        
        conta.exibirSaldo();
        
        
        conta.depositar(50);
        
        conta.exibirSaldo();
        
        conta.sacar(200);
        
    }
    
}
