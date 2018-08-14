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
public class ContaCorrente {
    
   private int numConta;
   private int agencia;
   private String nomeTitular;
   private double saldo;
   private double limite;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void imprimirSaldo() {
        System.out.println("Prezado, " + this.nomeTitular);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Limite: R$" + this.limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
   
   
    
   
}
