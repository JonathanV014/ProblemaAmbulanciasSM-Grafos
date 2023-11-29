/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Jonathan Vizcaino
 */
public class Accidente {
    private String fecha;
    private String descripccion;

    public Accidente(String fecha, String descripccion) {
        this.fecha = fecha;
        this.descripccion = descripccion;
    }

    @Override
    public String toString() {
        return "Fecha -------------> " + fecha + "\n"
                + "     Descripccion del accidente:\n"
                + "            " + descripccion + '}';
    }

    
    
    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the descripccion
     */
    public String getDescripccion() {
        return descripccion;
    }

    /**
     * @param descripccion the descripccion to set
     */
    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    } 
    
    
}
