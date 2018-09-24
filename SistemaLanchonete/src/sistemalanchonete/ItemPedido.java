/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalanchonete;

import java.util.ArrayList;

/**
 *
 * @author 20122BSI0379
 */
public class ItemPedido {
    private float valorParcial;
    private ArrayList<TipoHanburger> comida;
    private ArrayList<Bebida> bebida;

    public ItemPedido(float valorParcial) {
        this.comida = new ArrayList<TipoHanburger>();
        this.bebida = new ArrayList<Bebida>();
        this.valorParcial = valorParcial;
    }

    public float getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(float valorParcial) {
        this.valorParcial = valorParcial;
    }
    
    public void addItem(TipoHanburger itemComida, Bebida itemBebida) {
        comida.add(itemComida);
        bebida.add(itemBebida);
    }
}
