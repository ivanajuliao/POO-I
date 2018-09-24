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
public class Suco extends Bebida{
    
    private ArrayList<TipoSuco> tipoSuco;
     
    public Suco(int cod, float valor,ArrayList<Suco> tipoSuco) {
        super(cod, valor);
        this.tipoSuco = new ArrayList<TipoSuco>();
       
    }
    
    public void addSabores(TipoSuco sabor ) {
        tipoSuco.add(sabor);
    }
}
