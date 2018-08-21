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
public class QuestaoSubitracao {
    private int operador1;
    private int operador2;
    private int pontos;
    private int resposta;
    private boolean resultado;
        
    public QuestaoSubitracao(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0, 20);
        this.resultado = false;
    }
    
    public void criaPergunta(){
        String respostaS = JOptionPane.showInputDialog("Quanto é "+ this.operador1 + " - "+ this.operador2);    
        this.resposta = Integer.parseInt(respostaS);
    }
    public void verificaResposta(){
        if( this.operador1 - this.operador2 == this.resposta){
            this.resultado = true;
        }  
    }
    
    public void exibirResultado(){
      if(this.resultado){
          JOptionPane.showMessageDialog(null, "Você acertou!");
      } else{
          JOptionPane.showMessageDialog(null, "Você errou");
      } 
    }
}
