/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalanchonete;

import java.io.IOException;
import persistencia.PersistenciaSerializada;

/**
 *
 * @author 20122BSI0379
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        Pedido novoPedido = new Pedido();
        ItemPedido item1 = new ItemPedido(0);
        ItemPedido item2 = new ItemPedido(0);

        
        Hamburguer novoBurguer = new Hamburguer(001, "Vegetariano Especial", 18.00);
        TipoSuco sabor = new TipoSuco("Laranja");
        Suco novoSuco = new Suco(002, 5.00);
        novoSuco.addSabores(sabor);
        
        Refrigerante novoRefri = new Refrigerante(003, 9.00, "Refri");
        
        item1.addItemComida(novoBurguer);
        item1.addItemBebida(novoRefri);
        item1.setValorItem(novoBurguer.getValor()+ novoRefri.getValor());
        
        item2.addItemBebida(novoSuco);
        item2.setValorItem(novoSuco.getValor());
        
        novoPedido.adicionarItemPedido(item1);
        novoPedido.adicionarItemPedido(item2);
        
        //novoPedido.listarPedidos();
        
        persistencia.PersistenciaSerializada persistencia = new PersistenciaSerializada();
        persistencia.salvarObjeto(novoPedido);
        
        
        Pedido pedidoRecuperado = (Pedido) persistencia.recuperarObjeto(Pedido.class);
        pedidoRecuperado.listarPedidos();
    }
    
}
