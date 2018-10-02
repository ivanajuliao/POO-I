/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author 20131bsi0173
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private Curso curso;

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void alterarAluno(String nome, String matricula, Curso curso) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
    }
    
    public void visualizarAluno() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula" + getMatricula());
        System.out.println("Curso:" + getCurso());
        
    }
    
    public void excluirAluno() {
        
    }
 
}
