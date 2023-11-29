/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Jonathan Vizcaino
 */
public class Ambulancia {
    private String placa;
    private int numAccidentesAtendidos;

    public Ambulancia(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Placa de la Ambulancia: " + placa 
                + "\nNumero de accidentes atendidos: " + numAccidentesAtendidos + '}';
    }

    
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the numAccidentesAtendidos
     */
    public int getNumAccidentesAtendidos() {
        return numAccidentesAtendidos;
    }

    /**
     * @param numAccidentesAtendidos the numAccidentesAtendidos to set
     */
    public void setNumAccidentesAtendidos(int numAccidentesAtendidos) {
        this.numAccidentesAtendidos = numAccidentesAtendidos;
    }
    
    
}
