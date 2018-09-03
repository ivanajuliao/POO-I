/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20131bsi0173
 */
public class QuestaoSubitracao extends Questao{
        
    @Override
    public boolean verificarResposta() {
        if( this.operador1 - this.operador2 == this.resposta){
            return true;
        }    
        return false;
    }
    
    public void criaPergunta(){
        String respostaS = JOptionPane.showInputDialog("Quanto é "+ this.operador1 + " - "+ this.operador2);    
        this.resposta = Integer.parseInt(respostaS);
    }
}
