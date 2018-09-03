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
 * @author Ivana
 */
public abstract class Questao {
    int pontos;
    int operador1;
    int operador2;
    int resposta;
    
    public Questao(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0, 100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0, 20);
        
    }
    
    public abstract boolean verificarResposta();
     public void exibirResultado(){
        if(verificarResposta()){
            JOptionPane.showMessageDialog(null, "Você acertou!");
        } else{
            JOptionPane.showMessageDialog(null, "Você errou");
        } 
    }
    
    
}
