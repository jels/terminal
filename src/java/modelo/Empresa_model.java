/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WarMachine
 */
public class Empresa_model {

    Conexion cn = new Conexion();

    public ArrayList<Empresa> getAllEmpresa() {
        ArrayList<Empresa> empresa = new ArrayList<>();
        PreparedStatement pst;
        ResultSet rs;

        try {
            String sql = "SELECT * FROM empresa";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("Llego...");
                empresa.add(new Empresa(rs.getInt("idEmpresa"), rs.getString("nombreEmpresa"), rs.getString("nitEmpresa"), rs.getString("numeroAutorizacionEmpr"), rs.getDate("fechaFundacionEmpr"), rs.getInt("activoEmpresa")));
            }

        } catch (Exception e) {
            System.out.println("Error getAllEmpresa: " + e);
        }
        return empresa;
    }

    public boolean crearEmpresa(Empresa empresa) {
        PreparedStatement pst;
        int rs;

        try {
            String consulta = "INSERT INTO empresa"
                    + "(nombreEmpresa, nitEmpresa, "
                    + "numeroAutorizacionEmpr, fechaFundacionEmpr, "
                    + "activoEmpresa)"
                    + " VALUES (?,?,?,?,?)";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, empresa.getNombreEmpresa());
            pst.setString(3, empresa.getNitEmpresa());
            pst.setString(2, empresa.getNumeroAutorizacionEmpresa());
            pst.setDate(4, empresa.getFechaFundacionEmpresa());
            pst.setInt(5, 1);
            rs = pst.executeUpdate();
            return rs == 1;

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return false;
        }
    }

}
