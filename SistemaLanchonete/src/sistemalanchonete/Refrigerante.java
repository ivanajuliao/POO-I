/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalanchonete;

/**
 *
 * @author 20122BSI0379
 */
public class Refrigerante extends Bebida{
    
    private String nome;
    public Refrigerante(int cod, double valor, String nome) {
        super(cod, valor);
        this.nome = nome;
    }
    
}
