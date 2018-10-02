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
public class Curso {
    
    private int codCurso;
    private String nome;

    public Curso(int codCurso, String nome) {
        this.codCurso = codCurso;
        this.nome = nome;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public void alterarCurso(String nome, int codCurso) {
        setNome(nome);
        setCodCurso(codCurso);
    }
    
    public void visualizarCurso() {
        System.out.println("Curso: " + getNome());
        System.out.println("Código:" + getCodCurso());
        
    }
    
    public void excluirCurso() {
        
    }
}
