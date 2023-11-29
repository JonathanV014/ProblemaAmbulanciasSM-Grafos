/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Jonathan Vizcaino
 */
public class Profundidad {
    Grafo<Barrio, Integer> grafo;
    public int verticeInicial;
    public HashSet<String> visitados;

    
    public Profundidad(){
        visitados = new HashSet<>();
    }
    
    public void dfs(Grafo<Barrio, Integer> g, int vi){
        grafo = g;
        this.verticeInicial = verticeInicial;
        visitados.clear();
        
        prof(g, verticeInicial);
    }

    private void prof(Grafo<Barrio, Integer> g, int verticeInicial) {
        visitados.add(g.obtVertice(verticeInicial).getNombre());
        ArrayList<Barrio> sucesores = g.sucesores(verticeInicial);
        for (Barrio s : sucesores) {
            if (!visitados.contains(s.getNombre())) {
                prof(g, buscar(s));
            }
        }
    }

    private int buscar(Barrio s) {
        for (int i = 0; i < grafo.orden(); i++) {
            if (grafo.obtVertice(i).getNombre().equalsIgnoreCase(s.getNombre())) {
                return i;
            }
        }
        return -1;
    }
    
    
}
