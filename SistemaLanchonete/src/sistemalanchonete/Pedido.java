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
public class Pedido {
    private float valorTotal;
    private ArrayList<ItemPedido> itens;

    public Pedido(float valorTotal) {
        this.itens = new ArrayList<ItemPedido>();
        this.valorTotal = valorTotal;
    }
    
    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void adicionarItemPedido(ItemPedido itemPedido) {
        itens.add(itemPedido);
        
    }
    
}
