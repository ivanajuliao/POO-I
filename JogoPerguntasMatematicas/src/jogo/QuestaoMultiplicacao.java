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
public class QuestaoMultiplicacao {
    private int operador1 = ThreadLocalRandom.current().nextInt(0,100);
    private int operador2 = ThreadLocalRandom.current().nextInt(0, 10);
    private int pontos;
    private int resposta;
    private String respostaS;
    private boolean resultado = false;
        
    public QuestaoMultiplicacao(){}
    
    public void criaPergunta(){
        this.respostaS = JOptionPane.showInputDialog("Quanto é "+ this.operador1 + " x "+ this.operador2);    
    }
    public void verificaResposta(){
        this.resposta = Integer.parseInt(this.respostaS);
        if( this.operador1 * this.operador2 == this.resposta){
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
