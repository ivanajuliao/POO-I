/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.serializado;

import java.io.IOException;
import java.io.Serializable;
import modelo.Curso;

/**
 *
 * @author Ivana
 */
public class CursoSerializado implements Serializable{
    persistencia.serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    Curso curso;
    
    public void salvarCursoSerializado(Curso curso) throws IOException {
        persistencia.salvarObjeto(curso);
    }
    
    public Curso recuperarCursoSerializado() throws IOException, ClassNotFoundException {
        Curso cursoRecuperado = (Curso) persistencia.recuperarObjeto(Curso.class);
        return cursoRecuperado;
    }
    
    public void alterarCurso(String nome, int codCurso) {
        this.curso.setNome(nome);
        this.curso.setCodCurso(codCurso);
    }
    
    public void visualizarCurso() {
        System.out.println("Curso: " + this.curso.getNome());
        System.out.println("Código:" + this.curso.getCodCurso());
        
    }
    
    public void excluirCurso() {
        
    }
    
}
