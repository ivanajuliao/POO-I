/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.IOException;
import modelo.Aluno;

/**
 *
 * @author 20131bsi0173
 */
public class AlunoPersistencia {
    persistencia.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    
    public void salvarAlunoSerializado(Aluno aluno) throws IOException {
        persistencia.salvarObjeto(aluno);
    }
    
    public Aluno recuperarAlunoSerializado() throws IOException, ClassNotFoundException {
        Aluno alunoRecuperado = (Aluno) persistencia.recuperarObjeto(Aluno.class);
        return alunoRecuperado;
    }
}
