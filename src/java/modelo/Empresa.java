/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author WarMachine
 */
public class Empresa {

    private int idEmpresa;
    private String nombreEmpresa;
    private String nitEmpresa;
    private String numeroAutorizacionEmpresa;
    private Date fechaFundacionEmpresa;
    private int activoEmpresa;

    public Empresa() {
    }

    public Empresa(int idEmpresa, String nombreEmpresa, String nitEmpresa, String numeroAutorizacionEmpresa, Date fechaFundacionEmpresa, int activoEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.numeroAutorizacionEmpresa = numeroAutorizacionEmpresa;
        this.fechaFundacionEmpresa = fechaFundacionEmpresa;
        this.activoEmpresa = activoEmpresa;
    }

    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * @return the nitEmpresa
     */
    public String getNitEmpresa() {
        return nitEmpresa;
    }

    /**
     * @param nitEmpresa the nitEmpresa to set
     */
    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    /**
     * @return the numeroAutorizacionEmpresa
     */
    public String getNumeroAutorizacionEmpresa() {
        return numeroAutorizacionEmpresa;
    }

    /**
     * @param numeroAutorizacionEmpresa the numeroAutorizacionEmpresa to set
     */
    public void setNumeroAutorizacionEmpresa(String numeroAutorizacionEmpresa) {
        this.numeroAutorizacionEmpresa = numeroAutorizacionEmpresa;
    }

    /**
     * @return the fechaFundacionEmpresa
     */
    public Date getFechaFundacionEmpresa() {
        return fechaFundacionEmpresa;
    }

    /**
     * @param fechaFundacionEmpresa the fechaFundacionEmpresa to set
     */
    public void setFechaFundacionEmpresa(Date fechaFundacionEmpresa) {
        this.fechaFundacionEmpresa = fechaFundacionEmpresa;
    }

    /**
     * @return the activoEmpresa
     */
    public int getActivoEmpresa() {
        return activoEmpresa;
    }

    /**
     * @param activoEmpresa the activoEmpresa to set
     */
    public void setActivoEmpresa(int activoEmpresa) {
        this.activoEmpresa = activoEmpresa;
    }

}
