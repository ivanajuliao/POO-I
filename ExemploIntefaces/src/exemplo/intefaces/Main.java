package exemplo.intefaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculaMedia media = new CalculaMedia();
        CalculaMediana mediana = new CalculaMediana();

        //complete o código para chamar o método calcula para a média        
        calcula(media);                    
        //complete o código para chamar o método calcula para a mediana        
        calcula(mediana);                    
    }    
    public static double calcula(ICalcula  operacao){        
      List<Integer> lista = new ArrayList();        
      lista.add(1);
      lista.add(2); 
      lista.add(3); 
      lista.add(4); 
      lista.add(5); 
      lista.add(6);
      double resultado = operacao.calcula(lista);
      return resultado;              
    }
    
    
}
