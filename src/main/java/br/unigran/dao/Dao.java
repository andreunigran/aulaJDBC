/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author andre
 */
public abstract class Dao {
    private static Connection conn;
   
    private static void inicio() throws SQLException{
          if(conn==null ||conn.isClosed()){
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
          }
    }
    public static Connection getConn() throws SQLException{
           inicio();
        return conn;
    }
    public static Statement getstatStatement() throws SQLException{
           inicio();
        return conn.createStatement();
    }
    public static PreparedStatement getPreStatement(String sql) throws SQLException{
           inicio();
        return conn.prepareStatement(sql);
    }
    
    public static void close() throws SQLException{
          conn.close();
    }   
}
