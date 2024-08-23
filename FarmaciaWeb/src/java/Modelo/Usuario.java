/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author SENA
 */
public class Usuario {

    private String usuid;
    private String usunombre;
    private String usuapellido;
    private String usudireccion;
    private String usutelefono;
    private String usucorreo;
    private String usuusuario;
    private String usucontrasena;
    private String usutipo;

    public Usuario() {
    }

    public Usuario(String usuid, String usunombre, String usuapellido, String usudireccion, String usutelefono, String usucorreo, String usuusuario, String usucontrasena, String usutipo) {
        this.usuid = usuid;
        this.usunombre = usunombre;
        this.usuapellido = usuapellido;
        this.usudireccion = usudireccion;
        this.usutelefono = usutelefono;
        this.usucorreo = usucorreo;
        this.usuusuario = usuusuario;
        this.usucontrasena = usucontrasena;
        this.usutipo = usutipo;
    }

    public String getUsuid() {
        return usuid;
    }

    public void setUsuid(String usuid) {
        this.usuid = usuid;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsuapellido() {
        return usuapellido;
    }

    public void setUsuapellido(String usuapellido) {
        this.usuapellido = usuapellido;
    }

    public String getUsudireccion() {
        return usudireccion;
    }

    public void setUsudireccion(String usudireccion) {
        this.usudireccion = usudireccion;
    }

    public String getUsutelefono() {
        return usutelefono;
    }

    public void setUsutelefono(String usutelefono) {
        this.usutelefono = usutelefono;
    }

    public String getUsucorreo() {
        return usucorreo;
    }

    public void setUsucorreo(String usucorreo) {
        this.usucorreo = usucorreo;
    }

    public String getUsuusuario() {
        return usuusuario;
    }

    public void setUsuusuario(String usuusuario) {
        this.usuusuario = usuusuario;
    }

    public String getUsucontrasena() {
        return usucontrasena;
    }

    public void setUsucontrasena(String usucontrasena) {
        this.usucontrasena = usucontrasena;
    }

    public String getUsutipo() {
        return usutipo;
    }

    public void setUsutipo(String usutipo) {
        this.usutipo = usutipo;
    }

    

}
