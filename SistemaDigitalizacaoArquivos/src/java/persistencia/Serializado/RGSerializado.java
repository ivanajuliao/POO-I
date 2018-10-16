/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.Serializado;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import modelo.CPF;
import modelo.RG;

/**
 *
 * @author Ivana
 */
public class RGSerializado implements Serializable{
    persistencia.Serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    RG rg;
    
     public void salvarRGSerializado(RG rg) throws IOException {
        this.persistencia.salvarObjeto(rg);
    }
    
    public RG recuperarRGSerializado() throws IOException, ClassNotFoundException {
        RG rgRecuperado = (RG) this.persistencia.recuperarObjeto(RG.class);
        return rgRecuperado;
    }
    
    public void alterarRG(String nomePai, String nomeMae, int numRG, Date dataExpedissao, String municipio, String uf, String cidade, CPF numCpf, String tipoDocumento) {
        this.rg.setNomePai(nomePai);
        this.rg.setNomeMae(nomeMae);
        this.rg.setNumRG(numRG);
        this.rg.setDataExpedissao(dataExpedissao);
        this.rg.setMunicipio(municipio);
        this.rg.setUf(uf);
        this.rg.setCidade(cidade);
        this.rg.setNumCpf(numCpf);
        
    }
    
    public void listarRG(RG rg) {
        System.out.println("Nome do Pai: " + rg.getNomePai());
        System.out.println("Nome da Mãe: " + rg.getNomeMae());
        System.out.println("Número do RG: " + rg.getNumRG());
        System.out.println("Data de Expedissão: " + rg.getDataExpedissao());
        System.out.println("Município: " + rg.getMunicipio());
        System.out.println("UF: " + rg.getUf());
        System.out.println("Cidade: " + rg.getCidade());
        System.out.println("CPF: " + rg.getNumCpf());       
        
    }
    
    public void excluirRG() {
        
    }
}
