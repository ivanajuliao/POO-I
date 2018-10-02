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
public class CPF extends Documento{
    private int numCPF;

    public CPF(int numCPF, String tipoDocumento, String nomeTitular, Date dataNasc, int codDocumento) {
        super(tipoDocumento, nomeTitular, dataNasc, codDocumento);
        this.numCPF = numCPF;
    }

    public int getNumCPF() {
        return numCPF;
    }

    public void setNumCPF(int numCPF) {
        this.numCPF = numCPF;
    }
    
    
}
