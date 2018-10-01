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
public class Suco extends Bebida implements Serializable{
    
    private ArrayList<TipoSuco> tipoSuco;
     
    public Suco(int cod, double valor) {
        super(cod, valor);
        this.tipoSuco = new ArrayList<TipoSuco>();
       
    }
    
    public void addSabores(TipoSuco sabor ) {
        tipoSuco.add(sabor);
    }
    
    public String getTipoSuco() {
        for (TipoSuco sabor : tipoSuco) {
            return sabor.getSabor();
        }
        return "";
    }
}
