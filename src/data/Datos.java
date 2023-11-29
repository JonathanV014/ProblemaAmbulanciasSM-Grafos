/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Vizcaino
 */
public class Datos {
    public ArrayList<String> nombresB = new ArrayList<>();

    public Datos() {
        nombresB = nbarrios();
    }
    
    

    private ArrayList<String> nbarrios() {
        ArrayList<String> n = new ArrayList<>();
        
        //COMUNA 1
        n.add("Acacias"); //0
        n.add("Simon Bolívar");//1
        n.add("Boulevard de la 19");//2
        n.add("Villa Marbella");//3
        //COMUNA 2
        n.add("El Prado");//4
        n.add("Minuto de Dios");//5
        n.add("Miramar");//6
        n.add("Bavaria");//7
        
        //COMUNA 3
        n.add("Alfonso Lopez");//8
        n.add("Los Almendros");//9
        n.add("Betania");//10
        n.add("Barrio Obrero");//11
        //COMUNA 4
        n.add("Alto Jardin");//12
        n.add("Andrea Doria");//13
        n.add("AV. Del Río");//14
        n.add("Av. Libertador");//15
        //COMUNA 5
        n.add("Alto Delicias");//16
        n.add("Altos Simon Bolívar ");//17
        n.add("Bastidas");//18
        n.add("Chimila");//19
        //COMUNA 6
        n.add("El Cisne");//20
        n.add("Acodis");//21
        n.add("Curinca");//22
        n.add("El Parque");//23
        //COMUNA 7
        n.add("Gaira-Centro");//24
        n.add("Eduardo Gutiérrez");//25
        n.add("El Carmen");//26
        n.add("El Socorro");//27
        //COMUNA 8
        n.add("Bella Sol");//28
        n.add("Bella Vista");//29
        n.add("Don Jaca");//30
        n.add("Aeropuerto");//31 
    
       return n;
    }

    @Override
    public String toString() {
        String datos = "";
        for (int i = 0; i < nombresB.size(); i++) {
            if (i==0) {
                datos+="---COMUNA 1\n";
            }
            if(i==4){
               datos+="\n---COMUNA 2\n"; 
            }
            if(i==8){
                datos+="\n---COMUNA 3\n"; 
            }
            if(i==12){
                datos+="\n---COMUNA 4\n"; 
            }
            if(i==16){
                datos+="\n---COMUNA 5\n"; 
            }
            if(i==20){
                datos+="\n---COMUNA 6\n"; 
            }
            if(i==24){
                datos+="\n---COMUNA 7\n"; 
            }
            if(i==28){
                datos+="\n---COMUNA 8\n"; 
            }
            datos+=i+"."+nombresB.get(i)+"\n";
        }
        return datos;
    }


    
}
