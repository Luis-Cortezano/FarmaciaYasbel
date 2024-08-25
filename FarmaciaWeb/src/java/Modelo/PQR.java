/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HOME
 */
public class PQR {
    private int pqrCodigo;
    private int tblUsuID;
    private String pqrFecha;
    private String pqrNombre;
    private String correo;
    private int pqrTelefono;
    private String  pqrTipo;
    private String pqrDescripcion;
    private String PqrEstado;

    public PQR() {
    }

    public PQR(int pqrCodigo, int tblUsuID, String pqrFecha, String pqrNombre, String correo, int pqrTelefono, String pqrTipo, String pqrDescripcion, String PqrEstado) {
        this.pqrCodigo = pqrCodigo;
        this.tblUsuID = tblUsuID;
        this.pqrFecha = pqrFecha;
        this.pqrNombre = pqrNombre;
        this.correo = correo;
        this.pqrTelefono = pqrTelefono;
        this.pqrTipo = pqrTipo;
        this.pqrDescripcion = pqrDescripcion;
        this.PqrEstado = PqrEstado;
    }

    public int getPqrCodigo() {
        return pqrCodigo;
    }

    public void setPqrCodigo(int pqrCodigo) {
        this.pqrCodigo = pqrCodigo;
    }

    public int getTblUsuID() {
        return tblUsuID;
    }

    public void setTblUsuID(int tblUsuID) {
        this.tblUsuID = tblUsuID;
    }

    public String getPqrFecha() {
        return pqrFecha;
    }

    public void setPqrFecha(String pqrFecha) {
        this.pqrFecha = pqrFecha;
    }

    public String getPqrNombre() {
        return pqrNombre;
    }

    public void setPqrNombre(String pqrNombre) {
        this.pqrNombre = pqrNombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPqrTelefono() {
        return pqrTelefono;
    }

    public void setPqrTelefono(int pqrTelefono) {
        this.pqrTelefono = pqrTelefono;
    }

    public String getPqrTipo() {
        return pqrTipo;
    }

    public void setPqrTipo(String pqrTipo) {
        this.pqrTipo = pqrTipo;
    }

    public String getPqrDescripcion() {
        return pqrDescripcion;
    }

    public void setPqrDescripcion(String pqrDescripcion) {
        this.pqrDescripcion = pqrDescripcion;
    }

    public String getPqrEstado() {
        return PqrEstado;
    }

    public void setPqrEstado(String PqrEstado) {
        this.PqrEstado = PqrEstado;
    }
    
    
}
