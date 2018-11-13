/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.serializado;

import java.io.IOException;
import java.io.Serializable;
import modelo.Funcionario;
import modelo.Setor;

/**
 *
 * @author Ivana
 */
public class FuncionarioSerializado implements Serializable{
    persistencia.serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    persistencia.serializado.SetorSerializado setorSerial = new SetorSerializado();
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
    
    public void listarFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Siape: " + funcionario.getSiape());
        this.setorSerial.listarSetor(funcionario.getSetor());
        
    }
    
    public void excluirFuncionario() {
        
    }
}
