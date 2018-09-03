/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author 20131bsi0173
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuestaoSoma novaQuestao = new QuestaoSoma();
        QuestaoSubitracao novaQuestaoSub = new QuestaoSubitracao();
        QuestaoMultiplicacao novaQuestaoMult = new QuestaoMultiplicacao();
        
        for(int i=0; i<30 ; i++){
        
            novaQuestao.criaPergunta();
            novaQuestao.verificaResposta();
            novaQuestao.exibirResultado();

            novaQuestaoSub.criaPergunta();
            novaQuestaoSub.verificaResposta();
            novaQuestaoSub.exibirResultado();

            novaQuestaoMult.criaPergunta();
            novaQuestaoMult.verificaResposta();
            novaQuestaoMult.exibirResultado();
        }
    }
    
}
