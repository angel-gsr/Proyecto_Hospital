/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropaciente;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author garci
 */
public class Conexion {
    
    Connection conectar = null;

    public Connection CadConn() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/hospitalpuertadelcielo", "root", "");
            JOptionPane.showMessageDialog(null, "Conectado exitosamente");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
