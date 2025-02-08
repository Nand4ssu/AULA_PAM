
package projetobanco;


public class Conta {
    String nome ;
    double saldo;
    
    public void depositar(double valor){
        saldo += valor;
        System.out.println(" Operação de depósito no valor de R$: " + valor);
        
    }
    public void exibirSaldo(){
        System.out.println(nome + " Seu saldo R$: " + saldo);
    }
    public void sacar(double valor){
        
        if(saldo > valor){
            saldo -= valor;
            System.out.println("O seu saque foi realizado!");
        }else {
            System.out.println("O seu saldo é negativo para o saque!");
            System.out.println("Seu saldo é R$: "+ saldo +" Saque de R$: "+ valor );
        }
        saldo -= valor;
        System.out.println(" Operação de saque no valor de R$: " + valor);
        
        
    }
    
}
