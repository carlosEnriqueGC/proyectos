/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author visitante
 */
public class Aplicacion {
    int id_aplicacion;
    String nombreAplicacion;
    String estadoAplicacion;

    public Aplicacion() {
    }

    public Aplicacion(int id_aplicacion) {
        this.id_aplicacion = id_aplicacion;
    }

    public Aplicacion(String nombreAplicacion, String estadoAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
        this.estadoAplicacion = estadoAplicacion;
    }

    public int getId_aplicacion() {
        return id_aplicacion;
    }

    public void setId_aplicacion(int id_aplicacion) {
        this.id_aplicacion = id_aplicacion;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getestadoAplicacion() {
        return estadoAplicacion;
    }

    public void setestadoAplicacion(String estadoAplicacion) {
        this.estadoAplicacion = estadoAplicacion;
    }

    @Override
    public String toString() {
        return "aplicacion{" + "id_aplicacion=" + id_aplicacion + ", nombreAplicacion=" + nombreAplicacion + ", estadoAplicacion=" + estadoAplicacion + '}';
    }
    
}
