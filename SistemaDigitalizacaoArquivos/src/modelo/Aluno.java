/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 20131bsi0173
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private Curso curso;
    private ArrayList<Documento> documento;

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.documento = new ArrayList<Documento>();
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

    public Documento getTipoDocumento() {
        if(documento.isEmpty()){
            return null;
        }else{
            for (Documento doc : documento) {
                if (doc instanceof RG) {
                    RG rg = (RG) doc;
                    return rg;
                }else if (doc instanceof  CPF) {
                    CPF cpf = (CPF) doc;
                    return cpf;
                }else{
                    TituloEleitor titulo = (TituloEleitor) doc;
                    return titulo;
                }

            }
        }
        return null;
    }
    
    public ArrayList<Documento> getArrayDocumento() {
        return documento;
    }

    public void addDocumento(Documento documento) {
        this.documento.add(documento);
    }
    
    
 
}
