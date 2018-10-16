/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.Serializado;

import java.io.IOException;
import java.io.Serializable;
import modelo.Funcionario;
import modelo.Setor;

/**
 *
 * @author Ivana
 */
public class FuncionarioSerializado implements Serializable{
    persistencia.Serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    Funcionario funcionario;
    
     public void salvarFuncionarioSerializado(Funcionario funcionario) throws IOException {
        this.persistencia.salvarObjeto(funcionario);
    }
    
    public Funcionario recuperarFuncionarioSerializado() throws IOException, ClassNotFoundException {
        Funcionario funcionarioRecuperado = (Funcionario) this.persistencia.recuperarObjeto(Funcionario.class);
        return funcionarioRecuperado;
    }
    
    public void alterarFuncionario(String nome, String siape, Setor setor) {
        this.funcionario.setNome(nome);
        this.funcionario.setSiape(siape);
        this.funcionario.setSetor(setor);
        
    }
    
    public void listarFuncionario() {
        System.out.println("Nome: " + this.funcionario.getNome());
        System.out.println("Siape: " + this.funcionario.getSiape());
        System.out.println("Setor: " + this.funcionario.getSetor());
        
    }
    
    public void excluirFuncionario() {
        
    }
}
