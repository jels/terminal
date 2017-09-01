/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;

/**
 *
 * @author WarMachine
 */
public class ControladorEmpresa {

    public boolean newEmpresa(Empresa empresa) {
        Empresa_model emo = new Empresa_model();
        return emo.crearEmpresa(empresa);
    }

    public String verEmpresas() {
        String htmlcode = "";
        Empresa_model modelempresa = new Empresa_model();
        int c = 1;

        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Empresas</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre</th>\n"
                + "                             <th># Nit</th>\n"
                + "                             <th># Autorizacion</th>\n"
                + "                             <th>Fecha Fundacion</th>\n"
                + "                             <th>Activo</th>\n"
                + "                             <th>Detalles</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        for (Empresa e : modelempresa.getAllEmpresa()) {

            htmlcode += "<div class=\"row\">"
                    + "<tr>\n"
                    + " <td>" + c + "</td>\n"
                    + " <td>" + e.getNombreEmpresa() + "</td>\n"
                    + " <td>" + e.getNitEmpresa() + "</td>\n"
                    + " <td>" + e.getNumeroAutorizacionEmpresa() + "</td>\n"
                    + " <td>" + e.getFechaFundacionEmpresa() + "</td>\n";
            if (e.getActivoEmpresa() == 1) {
                htmlcode += " <td>SI</td>\n";
            } else {
                htmlcode += " <td>NO</td>\n";
            }
            htmlcode += "</tr>\n"
                    + "<div class=\"clear\"></div>\n"
                    + "			  </div>";
            c++;
        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

}
