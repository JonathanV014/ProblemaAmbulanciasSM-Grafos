/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import data.Datos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Jonathan Vizcaino
 */
public class SantaMarta {
    public Datos nombres = new Datos();
    public ArrayList<Integer> corX = new ArrayList<>(Arrays.asList(316,344,271,278,241,214,184,236,189,195,166,174,205,207,234,226,189,222,172,210,325,335,301,280,338,319,373,385,472, 501,550,619));
    public ArrayList<Integer> corY = new ArrayList<>(Arrays.asList(216,284,289,257,351,341,340,319,259,227,278,305,313,287,277,244,199,210,175,184,164,257,246,231,379,365,373,325,383,326,353,366));

    public Grafo<Barrio, Integer> barrios = insertarVertices();
    public ArrayList<Barrio> conAmbulancia = new ArrayList<>();


    
    public Grafo<Barrio, Integer> insertarVertices(){
        ArrayList<String> nombresBarrios = nombres.nombresB;
        Grafo<Barrio, Integer> grafo = new logicaGrafo<>(9999);
        
        int nv = nombresBarrios.size();
        for (int i = 0; i < nv; i++) {
            Barrio ins = new Barrio(nombresBarrios.get(i), corX.get(i), corY.get(i));
            grafo.insVertice(ins);
        }

        return grafo;
    }

    public void geneArisGrafo(Grafo<Barrio, Integer> graf, int numA) {
        int entreCuanto = 6;
        
        graf.insArista(31, 30, Math.round(disEuclid(31, 30) / entreCuanto));
        graf.insArista(30, 29, Math.round(disEuclid(30, 29) / entreCuanto));
        graf.insArista(30, 28, Math.round(disEuclid(30, 28) / entreCuanto));
        graf.insArista(28, 29, Math.round(disEuclid(28, 29) / entreCuanto));
        graf.insArista(29, 27, Math.round(disEuclid(29, 27) / entreCuanto));
        graf.insArista(38, 27, Math.round(disEuclid(38, 27) / entreCuanto));
        graf.insArista(27, 26, Math.round(disEuclid(27, 26) / entreCuanto));
        graf.insArista(27, 1, Math.round(disEuclid(27, 1) / entreCuanto));
        graf.insArista(27, 25, Math.round(disEuclid(27, 25) / entreCuanto));
        graf.insArista(27, 24, Math.round(disEuclid(27, 24) / entreCuanto));
        graf.insArista(24, 26, Math.round(disEuclid(24, 26) / entreCuanto));
        graf.insArista(25, 26, Math.round(disEuclid(25, 26) / entreCuanto));
        graf.insArista(25, 24, Math.round(disEuclid(25, 24) / entreCuanto));
        graf.insArista(25, 4, Math.round(disEuclid(25, 4) / entreCuanto));


        int c=0;
        while(true){
            int vi=(int) (Math.random()* graf.orden());
            int vf=(int) (Math.random()* graf.orden());
            int costo;
            if(vi!=vf && graf.obtArista(vi, vf) == graf.infinito()){
                costo = disEuclid(vi, vf);
                if (costo != -1) {
                    costo = Math.round(Math.round(costo) / entreCuanto);
                    graf.insArista(vi, vf, costo);
                    c++;
                    if(c==numA) break;
                } 
            }   
        }
    }
    
    public int disEuclid(int vi, int vf){
        if (vi>= 0 && vi < corX.size()) {
            if ( vf>= 0 && vf < corY.size()) {
                int x1 = corX.get(vi);
                int y1 = corY.get(vi);
                
                int x2 = corX.get(vf);
                int y2 = corY.get(vf);
                return (int) Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
            }else{
                return -1;
            }  
        }else{
            return -1;
        }
    
    }

    private Float convertirAFloatYRedondear(float f) {
        return (float) Math.round(f);
    }
    
    public void eliminarTodasAristas(){
        for (int i = 0; i < barrios.orden(); i++) {
            for (int j = 0; j <barrios.orden(); j++) {
                if (i!=j) {
                    barrios.elimArista(i, j);
                }
            }
        }
        
    }

    public void aislarBarrio(int posB){
        for (int i = 0; i < barrios.orden(); i++) {
            if (i != posB) {
                barrios.elimArista(i, posB);
                barrios.elimArista(posB, i);
            }
        } 
    }
    
    /*
    
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
        
    
    */
    
    public void situar(ArrayList<Ambulancia> ambu){
        if (ambu.size() == 4) {
            barrios.obtVertice(31).setTieneAmbu(ambu.get(0));
            barrios.obtVertice(26).setTieneAmbu(ambu.get(1));
            barrios.obtVertice(3).setTieneAmbu(ambu.get(2));
            barrios.obtVertice(18).setTieneAmbu(ambu.get(3));
            
            conAmbulancia.add(barrios.obtVertice(31));
            conAmbulancia.add(barrios.obtVertice(26));
            conAmbulancia.add(barrios.obtVertice(3));
            conAmbulancia.add(barrios.obtVertice(18));
        }else{
            if (ambu.size() == 5) {
                barrios.obtVertice(31).setTieneAmbu(ambu.get(0));
                barrios.obtVertice(26).setTieneAmbu(ambu.get(1));
                barrios.obtVertice(21).setTieneAmbu(ambu.get(2));
                barrios.obtVertice(6).setTieneAmbu(ambu.get(3));
                barrios.obtVertice(17).setTieneAmbu(ambu.get(4));
                
                conAmbulancia.add(barrios.obtVertice(31));
                conAmbulancia.add(barrios.obtVertice(26));
                conAmbulancia.add(barrios.obtVertice(21));
                conAmbulancia.add(barrios.obtVertice(6));
                conAmbulancia.add(barrios.obtVertice(17));
            }
        }
    }
    
    public int enviarAmbulanciaMasCerca(int verticeBarrioAccidente){
        Barrio ambulanciaMasCerca = null;
        int menorDistancia = barrios.infinito();

        if (verticeBarrioAccidente >= 0 && verticeBarrioAccidente < barrios.orden()) {
            try {
                for (int i = 0; i < conAmbulancia.size(); i++) {
                    Floyd1 reco = new Floyd1(barrios);
                    int posAmbu = buscar(conAmbulancia.get(i));

                    if (reco.f[posAmbu][verticeBarrioAccidente] != barrios.infinito()) {
                        if (reco.f[posAmbu][verticeBarrioAccidente] < menorDistancia) {
                            menorDistancia = reco.f[posAmbu][verticeBarrioAccidente];
                            ambulanciaMasCerca = conAmbulancia.get(i);
                        }
                    }
                }
            } catch (ClassCastException e) {
                // Manejar la excepción
                e.printStackTrace();
            }
        }

        return buscar(ambulanciaMasCerca);
    }
    
    private int buscar(Barrio barrio) {
        for (int i = 0; i < barrios.orden(); i++) {
            if (barrio.getNombre().equalsIgnoreCase(barrios.obtVertice(i).getNombre())){
                return i;
            } 
        }
        return -1;
    }
    

//    
    
    
    public Barrio conMasAccidentes(){
        Barrio conMasAccidentes = null;
        int numAcci = 0;
        for (int i = 0; i < barrios.orden(); i++) {
            int numMa = barrios.obtVertice(i).getAccidentesReportados().size();
            if (numMa > numAcci) {
                numAcci = numMa;
                conMasAccidentes = barrios.obtVertice(i);
            }
        }
        return conMasAccidentes;
    
    }
    
//    
//    public Ambulancia consultar(int posVerAm){
//        
//        
//    }

    /**
     * @param barrios the barrios to set
     */
    public void setBarrios(Grafo<Barrio, Integer> barrios) {
        this.barrios = barrios;
    }


}
