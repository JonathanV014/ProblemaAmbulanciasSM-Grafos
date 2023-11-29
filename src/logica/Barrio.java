/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.LinkedList;

/**
 *
 * @author Jonathan Vizcaino
 */
public class Barrio {
    private String nombre;
    private int posX = -1;
    private int posY = -1;
    private Ambulancia tieneAmbu = null;
    private LinkedList<Accidente> accidentesReportados = null;

    public Barrio(String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Nombre del barrio: " + nombre + 
                "\nCoordenada: " + posX + "-"+ posY + 
                "\nAccidentes Reportados:\n" + 
                accidentesRep(accidentesReportados) + 
                "\n¿Tiene Ambulancia?: "+ tieneAmb(tieneAmbu);
    }
    
    public String accidentesRep(LinkedList<Accidente> ar){
        String data = "";
        if (!ar.isEmpty()) {
            for (Accidente acci: ar) {
                data += "   "+acci.toString();
            }
        }else{
            data += "No hay accidentes reportados";
        }
        return data;
    }
    
    private String tieneAmb(Ambulancia tieneAmbu) {
        if (tieneAmbu != null) {
            return "\n Tiene una ambulancia con los siguientes datos:\n"
                    + "     "+tieneAmbu.toString();
        }
        return "No tiene ambulancia";
    }
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @return the tieneAmbu
     */
    public Ambulancia getTieneAmbu() {
        return tieneAmbu;
    }

    /**
     * @param tieneAmbu the tieneAmbu to set
     */
    public void setTieneAmbu(Ambulancia tieneAmbu) {
        this.tieneAmbu = tieneAmbu;
    }

    /**
     * @return the accidentesReportados
     */
    public LinkedList<Accidente> getAccidentesReportados() {
        return accidentesReportados;
    }

    /**
     * @param accidentesReportados the accidentesReportados to set
     */
    public void setAccidentesReportados(LinkedList<Accidente> accidentesReportados) {
        this.accidentesReportados = accidentesReportados;
    }

 
    
    
    
}
