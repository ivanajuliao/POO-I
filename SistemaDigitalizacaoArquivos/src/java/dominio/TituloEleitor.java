/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

/**
 *
 * @author 20131bsi0173
 */
public class TituloEleitor extends Documento{
    
    private Date dataEmissao;
    private String municipio;
    private String uf;
    private int zona;
    private int secao;

    public TituloEleitor(String tipoDocumento, int codDocumento, Date dataNasc, String nomeTitular, Date dataEmissao, String municipio, String uf, int zona, int secao) {
        super(tipoDocumento, nomeTitular, dataNasc, codDocumento);
        this.dataEmissao = dataEmissao;
        this.municipio = municipio;
        this.uf = uf;
        this.zona = zona;
        this.secao = secao;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
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

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }
    
    
}
