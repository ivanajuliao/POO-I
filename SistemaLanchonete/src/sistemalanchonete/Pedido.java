/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalanchonete;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 20122BSI0379
 */
public class Pedido implements Serializable{
    private double valorTotal;
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<ItemPedido>();
        this.valorTotal = valorTotal;
    }
    
    public double calculaValorTotal() {
        for (ItemPedido item : itens) {
            valorTotal += item.getValorItem();
        }
        return valorTotal;
    }
    
    public void adicionarItemPedido(ItemPedido itemPedido) {
        itens.add(itemPedido);
        
    }

    public void listarPedidos() {
        System.out.println("Valor Total: RS " + calculaValorTotal());
        for (ItemPedido item : itens) {  
            System.out.println("Bebida: " + item.getItemBebidaNome());
            System.out.println("Comida: " + item.getItemComidaNome());
            
        }
        
        
    }
    
}
