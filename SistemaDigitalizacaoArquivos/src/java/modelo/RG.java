/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author 20131bsi0173
 */
public class RG extends Documento{

    private String nomePai;
    private String nomeMae;
    private int numRG;
    private Date dataExpedissao;
    private String municipio;
    private String uf;
    private String cidade;
    private CPF numCpf;

    public RG(String nomePai, String nomeMae, int numRG, Date dataExpedissao, String municipio, String uf, String cidade, CPF numCpf, String tipoDocumento, String nomeTitular, Date dataNasc, int codDocumento) {
        super(tipoDocumento, nomeTitular, dataNasc, codDocumento);
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.numRG = numRG;
        this.dataExpedissao = dataExpedissao;
        this.municipio = municipio;
        this.uf = uf;
        this.cidade = cidade;
        this.numCpf = numCpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getNumRG() {
        return numRG;
    }

    public void setNumRG(int numRG) {
        this.numRG = numRG;
    }

    public Date getDataExpedissao() {
        return dataExpedissao;
    }

    public void setDataExpedissao(Date dataExpedissao) {
        this.dataExpedissao = dataExpedissao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public CPF getNumCpf() {
        return numCpf;
    }

    public void setNumCpf(CPF numCpf) {
        this.numCpf = numCpf;
    }
    
    
    
}
