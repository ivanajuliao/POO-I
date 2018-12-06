/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import persistencia.dao.CPFDAO;
import persistencia.dao.IBasePersistenciaDao;

/**
 *
 * @author 20131bsi0173
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Curso curso1 = new Curso(001, "Sistemas de Informação");
        Curso curso2 = new Curso(002, "Engenharia de Controle e Automação");
        
        Documento docCpf = new Documento("cpf", "Benicio Kaue Galvao", new Date(1996,10,14), 0);
        CPF cpf1 = new CPF(1111111111, docCpf.getTipoDocumento(),docCpf.getNomeTitular(),docCpf.getDataNasc(),docCpf.getCodDocumento());
        
//        ConexaoJDBC con = new ConexaoJDBC();
//        Connection c  = con.getInstance();
        
        CPFDAO cpfDAO = new CPFDAO();
        cpfDAO.criarTabela();
        cpfDAO.salvar(cpf1);
        
        
        
    }
    
}
