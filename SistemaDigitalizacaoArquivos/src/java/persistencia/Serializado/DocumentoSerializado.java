/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.Serializado;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import modelo.Documento;

/**
 *
 * @author Ivana
 */
public class DocumentoSerializado implements Serializable{
    persistencia.Serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    Documento documento;
    
    public void salvarDocumentoSerializado(Documento documento) throws IOException {
        this.persistencia.salvarObjeto(documento);
    }
    
    public Documento recuperarDocumentoSerializado() throws IOException, ClassNotFoundException {
        Documento documentoRecuperado = (Documento) this.persistencia.recuperarObjeto(Documento.class);
        return documentoRecuperado;
    }
    
    public void alterarDocumento(String nomeTitular, String tipoDocumento, Date dataNasc) {
        this.documento.setNomeTitular(nomeTitular);
        this.documento.setTipoDocumento(tipoDocumento);
        this.documento.setDataNasc(dataNasc);
        
    }
    
    public void listarDocumento() {
        System.out.println("Nome Titular: " + this.documento.getNomeTitular());
        System.out.println("Tipo de documento: " + this.documento.getTipoDocumento());
        System.out.println("Data de Nascimento: " + this.documento.getDataNasc());
        
    }
    
    public void excluirDocumento() {
        
    }
}
