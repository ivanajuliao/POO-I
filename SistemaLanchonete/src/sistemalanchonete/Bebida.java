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
public class Bebida {
    private int cod;
    private double valor;

    public Bebida(int cod, double valor) {
        this.cod = cod;
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
