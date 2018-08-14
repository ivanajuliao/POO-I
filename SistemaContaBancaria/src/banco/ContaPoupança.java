/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Ivana
 */
public class ContaPoupança {
    
   private int numConta;
   private String nomeTitular;
   private double saldo;
   private int agencia;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
   
   public void depositar(double valor){
       this.saldo += valor;
   }
   
   public void sacar(double valor){
       this.saldo -= valor;
   }
   
   public void imprirSaldo(){
       System.out.println("Prezado, " + this.nomeTitular);
        System.out.println("Saldo: R$" + this.saldo);
   }
}
