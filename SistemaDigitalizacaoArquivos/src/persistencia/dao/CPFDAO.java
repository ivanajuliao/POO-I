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
import java.sql.Statement;
import java.util.List;
import modelo.CPF;

/**
 *
 * @author Ivana
 */

public class CPFDAO implements Serializable, IBasePersistenciaDao{
//    ConexaoJDBC con = new ConexaoJDBC();

    /**
     *Cria uma nova tabela no banco de dados
     */
    public synchronized void criarTabela(){
  
        String sql = "CREATE TABLE IF NOT EXISTS CPF(\n"
                + "id integer PRIMARY KEY AUTOINCREMENT,\n"//Autoincrement
//                + "codDocumento integer,\n"
                + "numCPF integer\n"
                + ");";
        
           try (Connection c = ConexaoJDBC.getInstance();
                Statement stmt = c.createStatement()) {
            // create a new table
            stmt.execute(sql);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage()); 
//            System.out.println(e.getMessage());
        }
        System.out.println("Table created successfully");
    }

    @Override
    public void salvar(Object bean) {
        CPF cpf = (CPF)bean;

        String sql = "INSERT INTO CPF(numcpf) VALUES(?)";
 
        try (Connection c = ConexaoJDBC.getInstance();
                PreparedStatement pstmt = c.prepareStatement(sql)) {
            pstmt.setInt(1, cpf.getNumCPF());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
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
