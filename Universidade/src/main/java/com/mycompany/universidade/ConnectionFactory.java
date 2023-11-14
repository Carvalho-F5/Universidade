/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universidade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
/**
 *
 * @author 82317363
 */
public class ConnectionFactory {
    public String usuario ="root";
    public String URL = "jdbc:mysql://localhost:3306/Universidade?useTimezone=true&serverTimezone=UTC";
    public String senha ="usjt";
      public Connection obtemConexao()throws SQLException{
          try{
              Connection con = DriverManager.getConnection(URL, usuario, senha);
              System.out.println(con);
              return con;    
          }catch (SQLException ex){
    ex.printStackTrace();
    return null;
}
    }}