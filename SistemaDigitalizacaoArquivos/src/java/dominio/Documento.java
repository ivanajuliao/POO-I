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
public class Documento {
    private String tipoDocumento;
    private String nomeTitular;
    private Date dataNasc;
    private int codDocumento;

    public Documento(String tipoDocumento, String nomeTitular, Date dataNasc, int codDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.codDocumento = codDocumento;
        this.nomeTitular = nomeTitular;
        this.dataNasc = dataNasc;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCodDocumento() {
        return codDocumento;
    }

    public void setCodDocumento(int codDocumento) {
        this.codDocumento = codDocumento;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    
}
