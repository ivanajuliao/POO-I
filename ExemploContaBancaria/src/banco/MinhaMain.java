/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author 20122bsi0379
 */
public class MinhaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaração de objeto 
        Conta novaConta = new Conta();
        
        String nomeCliente = JOptionPane.showInputDialog(null,"Digite o nome do cliente");
        novaConta.setNomeCliente(nomeCliente);
        
        String numeroConta = JOptionPane.showInputDialog(null,"Digite o numero da conta");
        int numConta = Integer.parseInt(numeroConta);
        novaConta.setNumero(numConta);
        
        String numeroAgencia = JOptionPane.showInputDialog(null,"Digite o numero da Agencia");
        int numAgencia = Integer.parseInt(numeroAgencia);
        novaConta.setAgencia(numAgencia);
        
        String limite = JOptionPane.showInputDialog(null,"Digite o limite");
        double limiteConta =Double.parseDouble(limite);
        novaConta.setLimite(limiteConta);
        
        /*
        Conta novaConta1 =new Conta();
     
        novaConta1.setNomeCliente("Artur de Oliveira");
        novaConta1.setNumero(002);
        novaConta1.setAgencia(005);
        novaConta1.setLimite(10000);
        */
        
    }
    
}
