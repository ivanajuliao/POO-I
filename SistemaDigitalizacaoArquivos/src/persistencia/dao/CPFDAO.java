/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ivana
 */

public class CPFDAO implements Serializable, IBasePersistenciaDao{
    
    /**
     *Cria uma nova tabela no banco de dados
     */
    public synchronized void criarTabela(){
        ConexaoJDBC con = new ConexaoJDBC();
        String sql = "create table CPF(\n"
                + "id int primary key not null,\n"//Autoincrement
                + "nome varchar(100),\n"
                + "dataNasc date,\n"
                + "codDocumento integer,\n"
                + "numCPF integer\n"
                + ");";
        
           try (Connection c = con.getInstance();
                PreparedStatement stmt = c.prepareStatement(sql)) {
            // create a new table
            stmt.execute(sql);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void salvar(Object bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Object bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
