
package banco;

/**
 *
 * @author 20122bsi0379
 */
public class Conta {
    
    /* Atributos */
    private int numero;
    private String nomeCliente;
    private double saldo;
    private double limite;
    private int agencia;

    /* Getters e Setters (metodos de acesso)*/
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if(nomeCliente.length()>=8){
            this.nomeCliente = nomeCliente;
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor){
        this.saldo += valor;   
    }

    public void sacar (double valor){
        this.saldo -= valor;  
    }
    
    public void imprimirSaldo(){
        System.out.println("Prezado, " + this.nomeCliente);
        System.out.println("Seu Saldo atual é: R$" + this.saldo);
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    
    
}
