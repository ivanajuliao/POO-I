/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalanchonete;

import java.io.Serializable;

/**
 *
 * @author 20122BSI0379
 */
public class Hamburguer implements Serializable{
    private int cod;
    private String nome;
    private double valor;

    public Hamburguer(int cod, String nome, double valor) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
    }
    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
