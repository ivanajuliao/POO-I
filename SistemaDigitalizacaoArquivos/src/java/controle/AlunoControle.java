/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.Serializable;
import modelo.Aluno;
import modelo.Curso;

/**
 *
 * @author 20131bsi0173
 */
public class AlunoControle implements Serializable{
    controle.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    modelo.Aluno aluno;
    
    public void salvarAlunoSerializado(Aluno aluno) throws IOException {
        this.persistencia.salvarObjeto(aluno);
    }
    
    public Aluno recuperarAlunoSerializado() throws IOException, ClassNotFoundException {
        Aluno alunoRecuperado = (Aluno) this.persistencia.recuperarObjeto(Aluno.class);
        return alunoRecuperado;
    }
    
    public void alterarAluno(String nome, String matricula, Curso curso) {
        this.aluno.setNome(nome);
        this.aluno.setMatricula(matricula);
        this.aluno.setCurso(curso);
        
    }
    
    public void listarAluno() {
        System.out.println("Nome: " + this.aluno.getNome());
        System.out.println("Matrícula: " + this.aluno.getMatricula());
        System.out.println("Curso: " + this.aluno.getCurso());
        
    }
    
    public void excluirAluno() {
        
    }
}
