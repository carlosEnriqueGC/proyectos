/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Aplicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class AplicacionDAO {

    private static final String SQL_SELECT = "SELECT id_aplicacion, nombreAplicacion, estadoAplicacion FROM aplicacion";
    private static final String SQL_INSERT = "INSERT INTO aplicacion(nombreAplicacion, estadoAplicacion) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE aplicacion SET nombreAplicacion=?, estadoAplicacion=? WHERE id_aplicacion = ?";
    private static final String SQL_DELETE = "DELETE FROM aplicacion WHERE id_aplicacion=?";
    private static final String SQL_QUERY = "SELECT id_aplicacion, nombreAplicacion, estadoAplicacion FROM aplicacion WHERE id_aplicacion = ?";

    public List<Aplicacion> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Aplicacion aplicacion = null;
        List<Aplicacion> aplicaciones = new ArrayList<Aplicacion>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_aplicacion = rs.getInt("id_aplicacion");
                String nombre = rs.getString("nombreAplicacion");
                String estado = rs.getString("estadoAplicacion");
                
                aplicacion = new Aplicacion();
                aplicacion.setId_aplicacion(id_aplicacion);
                aplicacion.setNombreAplicacion(nombre);
                aplicacion.setestadoAplicacion(estado);
                
                aplicaciones.add(aplicacion);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return aplicaciones;
    }

    public int insert(Aplicacion aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, aplicacion.getNombreAplicacion());
            stmt.setString(2, aplicacion.getestadoAplicacion());


            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int update(Aplicacion aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, aplicacion.getNombreAplicacion());
            stmt.setString(2, aplicacion.getestadoAplicacion());
            stmt.setInt(3, aplicacion.getId_aplicacion());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int delete(Aplicacion aplicacion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, aplicacion.getId_aplicacion());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona vendedor) { // Si se utiliza un ArrayList
    public Aplicacion query(Aplicacion aplicacion) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Aplicacion> aplicaciones = new ArrayList<Aplicacion>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, aplicacion.getId_aplicacion());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_aplicacion = rs.getInt("id_aplicacion");
                String nombre = rs.getString("nombreAplicacion");
                String estado = rs.getString("estadoAplicacion");
                
                aplicacion = new Aplicacion();
                aplicacion.setId_aplicacion(id_aplicacion);
                aplicacion.setNombreAplicacion(nombre);
                aplicacion.setestadoAplicacion(estado);
                
                //vendedores.add(vendedor); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return vendedores;  // Si se utiliza un ArrayList
        return aplicacion;
    }
        
}
