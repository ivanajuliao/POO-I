/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ivana
 */
public class ConexaoJDBC {
    private static Connection instance = null; 

    public ConexaoJDBC() {
    }
    
    
    /**
     * Connect to the nomeBD database
     *
     * @return the Connection object
     */
    public static synchronized Connection getInstance() {
        // SQLite connection string
        if( instance == null){
            String url = "jdbc:sqlite:..\\SistemaDigitalizacaoArquivos\\Banco de Dados\\imsda.db";
             try {
                Connection c = null;
                c = DriverManager.getConnection(url);
                c.setAutoCommit(true);
                instance = c;
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }   
        }
        
        return instance;
    }
    
}
