/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author HOME
 */
public class PQRDAO {
    Connection con;
    PreparedStatement pstm;
    Conectar Conexion;
    
    public void crearPQR(PQR pqr){
        try{
        Conexion = new Conectar();
        con = Conexion.crearconexion();
        if(con != null){
            System.out.println("Conexion establecida con la base de datos");
        }
        pstm = con.prepareStatement("INSERT INTO tblpqr (tblUsuID, PQRNombre, PQRCorreo, PQRtelefono, PQRTipo, PQRDescripcion, PQREstado) VALUES (?, ?, ?, ?, ?, ?, ?)");
         pstm.setInt(1, pqr.getTblUsuID());
            pstm.setString(2, pqr.getPqrNombre());
            pstm.setString(3, pqr.getCorreo());
            pstm.setInt(4, pqr.getPqrTelefono());
            pstm.setString(5, pqr.getPqrTipo());
            pstm.setString(6, pqr.getPqrDescripcion());
            pstm.setString(7, pqr.getPqrEstado());
            pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al Crear la PQR" + e);
        }
    }
}
