/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.Serializado;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import modelo.TituloEleitor;

/**
 *
 * @author Ivana
 */
public class TituloEleitorSerializado implements Serializable{
    persistencia.Serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    TituloEleitor titulo;
    
    public void salvarTituloEleitorSerializado(TituloEleitor titulo) throws IOException {
        this.persistencia.salvarObjeto(titulo);
    }
    
    public TituloEleitor recuperarTituloEleitorSerializado() throws IOException, ClassNotFoundException {
        TituloEleitor tituloRecuperado = (TituloEleitor) this.persistencia.recuperarObjeto(TituloEleitor.class);
        return tituloRecuperado;
    }
    
    public void alterarTituloEleitor(Date dataEmissao, String municipio, String uf, int zona, int secao) {
              
        this.titulo.setDataEmissao(dataEmissao);
        this.titulo.setMunicipio(municipio);
        this.titulo.setUf(uf);
        this.titulo.setZona(zona);
        this.titulo.setSecao(secao);
        
    }
    
    public void listarTituloEleitor(TituloEleitor titulo) {
        
        System.out.println("Data de Emissao: " + titulo.getDataEmissao());
        System.out.println("Municipio: " + titulo.getMunicipio());
        System.out.println("UF: " + titulo.getUf());
        System.out.println("Zona: " + titulo.getZona());
        System.out.println("Seção: " + titulo.getSecao());
        
    }
    
    public void excluirTituloEleitor() {
        
    }
    
}
