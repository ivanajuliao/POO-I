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
public class SetorSerializado implements Serializable{
    
    persistencia.serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    Setor setor;
    
    public void salvarSetorSerializado(Setor setor) throws IOException {
        persistencia.salvarObjeto(setor);
    }
    
    public Setor recuperarSetorSerializado() throws IOException, ClassNotFoundException {
        Setor setorRecuperado = (Setor) persistencia.recuperarObjeto(Setor.class);
        return setorRecuperado;
    }
    
    public void alterarSetor(String nome, int codSetor, Funcionario coordenador) {
        this.setor.setNomeSetor(nome);
        this.setor.setCodSetor(codSetor);
        this.setor.setCoordenador(coordenador);
    }
    
    public void listarSetor(Setor setor) {
        System.out.println("Setor: " + setor.getNomeSetor());
        System.out.println("Código:" + setor.getCodSetor());
        System.out.println("Coordenador:"+ setor.getCoordenador());
        
    }
    
    public void excluirSetor() {
        
    }
}

