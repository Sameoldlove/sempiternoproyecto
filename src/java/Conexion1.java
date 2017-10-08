/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class Conexion1 {
    
    private Connection cnx;
    
    public Connection obtener() {
        if(this.cnx == null) {
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sempiterno", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.cnx;
        
    }
    
    public void cerrar() throws SQLException {
        if(this.cnx != null) {
            this.cnx.close();
        }
    }
}
