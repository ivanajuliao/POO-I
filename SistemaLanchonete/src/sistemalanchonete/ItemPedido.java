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
public class ItemPedido implements Serializable{
    private double valorParcial;
    private ArrayList<Hamburguer> comida;
    private ArrayList<Bebida> bebida;

    public ItemPedido(double valorParcial) {
        this.comida = new ArrayList<Hamburguer>();
        this.bebida = new ArrayList<Bebida>();
        this.valorParcial = valorParcial;
    }

    public double getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(double valorParcial) {
        this.valorParcial = valorParcial;
    }
    
    public void addItemComida(Hamburguer itemComida) {
        comida.add(itemComida);
    }
     public void addItemBebida(Bebida itemBebida) {
        bebida.add(itemBebida);
    }
     
    public String getItemBebidaNome() {
        if (bebida.isEmpty()) {
            return null;
        }else{
            for (Bebida itemBebida : bebida) {
                if(itemBebida instanceof Refrigerante){
                    Refrigerante refri = (Refrigerante) itemBebida;
                    return refri.getNome();
                }else{
                    Suco suco = (Suco) itemBebida;
                    return "Suco de " + suco.getTipoSuco();
                }
            }
        }
        return null;
    }
    
    public String getItemComidaNome() {
        if (comida.isEmpty()) {
            return null;
        }else{
            for (Hamburguer hanburger : comida) {
                return hanburger.getNome();
            } 
        }
        return null;
    }

}
