/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 20131bsi0173
 */
public class Setor {
    private String nomeSetor;
    private int codSetor;
    private Funcionario coordenador;

    public Setor(String nomeSetor, int codSetor, Funcionario coordenador) {
        this.nomeSetor = nomeSetor;
        this.codSetor = codSetor;
        this.coordenador = coordenador;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public Funcionario getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Funcionario coordenador) {
        this.coordenador = coordenador;
    }
    
    
    
    
}
