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
    private double valorTotal;
    private ArrayList<ItemPedido> itens;

    public Pedido(double valorTotal) {
        this.itens = new ArrayList<ItemPedido>();
        this.valorTotal = valorTotal;
    }
    
    public double getValorTotal() {
        for (ItemPedido item : itens) {
            valorTotal += item.getValorParcial();
        }
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void adicionarItemPedido(ItemPedido itemPedido) {
        itens.add(itemPedido);
        
    }

    public void listarPedidos() {
        System.out.println("Valor Total: RS " + getValorTotal());
        for (ItemPedido item : itens) {
            System.out.println("CodBebida: " + item.getItemBebida());
            System.out.println("Comida: " + item.getItemComida());
            
        }
        
        
    }
    
}
