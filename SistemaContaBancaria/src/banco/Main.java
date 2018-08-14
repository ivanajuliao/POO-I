/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaCorrente novaCC = new ContaCorrente();
        
        String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do titular da conta corrente:");
        novaCC.setNomeTitular(nomeCliente);
        
        String numeroConta = JOptionPane.showInputDialog(null,"Digite o numero da conta");
        int numConta = Integer.parseInt(numeroConta);
        novaCC.setNumConta(numConta);
        
        String numeroAgencia = JOptionPane.showInputDialog(null,"Digite o numero da Agencia");
        int numAgencia = Integer.parseInt(numeroAgencia);
        novaCC.setAgencia(numAgencia);
        
        String limite = JOptionPane.showInputDialog(null,"Digite o limite");
        double limiteConta =Double.parseDouble(limite);
        novaCC.setLimite(limiteConta);
        
        String deposito = JOptionPane.showInputDialog(null, "Informe o valor que deseja depositar:");
        double valorD = Double.parseDouble(deposito);
        novaCC.depositar(valorD);
        
        novaCC.imprimirSaldo();
        
        String saque = JOptionPane.showInputDialog(null, "Informe o valor que deseja sacar:");
        double valorS = Double.parseDouble(saque);
        novaCC.sacar(valorS);
        
        novaCC.imprimirSaldo();
                
        // ------------------------------------------------------------------------------------------
        
        ContaPoupança novaPoupanca = new ContaPoupança();
        
        String nomeTitularP = JOptionPane.showInputDialog(null, "Digite o nome do titular da conta poupança:");
        novaPoupanca.setNomeTitular(nomeTitularP);
        
        String numeroContaP = JOptionPane.showInputDialog(null,"Digite o numero da conta");
        int numContaP = Integer.parseInt(numeroContaP);
        novaPoupanca.setNumConta(numContaP);
        
        String numeroAgenciaP = JOptionPane.showInputDialog(null,"Digite o numero da Agencia");
        int numAgenciaP = Integer.parseInt(numeroAgenciaP);
        novaPoupanca.setAgencia(numAgenciaP);
        
        String depositoP = JOptionPane.showInputDialog(null, "Informe o valor que deseja depositar:");
        double valorDP = Double.parseDouble(depositoP);
        novaPoupanca.depositar(valorDP);
        
        novaPoupanca.imprimirSaldo();
        
        String saqueP = JOptionPane.showInputDialog(null, "Informe o valor que deseja sacar:");
        double valorSP = Double.parseDouble(saqueP);
        novaPoupanca.sacar(valorSP);
        
        novaPoupanca.imprimirSaldo();

    }
    
}
