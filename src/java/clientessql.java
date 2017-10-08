
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class clientessql {
    public void insertar(Connection cnx, Clientes t) {
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cnx.prepareStatement("INSERT INTO Clientes (nombre, apellido, direccion, fechadenacimiento, telefono, email) VALUES(?, ?, ?,? ,? ,?)");
            ps.setString(1, t.getnombre());
            ps.setString(2, t.getapellido());
            ps.setString(3, t.getdireccion());
            ps.setInt(4, t.getfechadenacimiento());
            ps.setInt(5, t.gettelefono());
            ps.setString(1, t.getemail());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clientessql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void obtener_uno(Connection cnx, int id) {
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cnx.prepareStatement("SELECT * FROM Clientes WHERE id_cliente = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String direccion = rs.getString("direccion");
                int fechadenacimiento = rs.getInt("fechadenacimiento");
                int telefono = rs.getInt("telefono");
                String email = rs.getString("email");
               
                System.out.println("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientessql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizar(Connection cnx, Clientes t) {
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cnx.prepareStatement("UPDATE Clientes SET nombre = ?, apellido = ?, direccion = ?, fechadenacimiento = ?, telefono = ?, email = ? WHERE id_cliente = ?");
            ps.setString(1, t.getnombre());
            ps.setString(2, t.getapellido());
            ps.setString(3, t.getdireccion());
            ps.setInt(4, t.getfechadenacimiento());
            ps.setInt(5, t.gettelefono());
            ps.setString(1, t.getemail());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clientessql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void borrar(Connection cnx, int id) {
        try {
            PreparedStatement ps = (PreparedStatement) cnx.prepareStatement("DELETE FROM Clientes WHERE id_cliente = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(clientessql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void obtener_todos(Connection cnx) {
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cnx.prepareStatement("SELECT * FROM Clientes");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String direccion = rs.getString("direccion");
                int fechadenacimiento = rs.getInt("fechadenacimiento");
                int telefono = rs.getInt("telefono");
                String email = rs.getString("email");
                System.out.println("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientessql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
