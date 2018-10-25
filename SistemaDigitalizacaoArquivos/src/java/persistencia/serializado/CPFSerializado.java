/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.serializado;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import modelo.CPF;

/**
 *
 * @author Ivana
 */
public class CPFSerializado implements Serializable{
    persistencia.serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    CPF cpf;
    
    public void salvarCPFSerializado(CPF cpf) throws IOException {
        this.persistencia.salvarObjeto(cpf);
    }
    
    public CPF recuperarCPFSerializado() throws IOException, ClassNotFoundException {
        CPF cpfRecuperado = (CPF) this.persistencia.recuperarObjeto(CPF.class);
        return cpfRecuperado;
    }
    
    public void alterarCPF(int numCPF) {
        this.cpf.setNumCPF(numCPF);
        
    }
    
    public void listarCPF(CPF cpf) {
        System.out.println("Número do CPF: " + cpf.getNumCPF());
            
        
    }
    
    public void excluirCPF() {
        
    }
}
