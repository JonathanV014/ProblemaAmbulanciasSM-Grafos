/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Vizcaino
 * @param <V>
 * @param <A>
 */
public class logicaGrafo<V,A> implements Grafo<V, A>{
    private ArrayList<V> vertices;
    private Object aristas[][];
    private A inf;
    

    public logicaGrafo(A inf) {
        this.inf = inf;
        vertices= new ArrayList<>();
        aristas= new Object[90][90];
        for (int i = 0; i < aristas.length; i++) {
            for (int j = 0; j < aristas.length; j++) {
                if(i==j)
                    aristas[i][j]=0;
                else
                    aristas[i][j]=inf;
                
            }
            
        }
        
    }  
    
    @Override
    public void insVertice(V x) {
        vertices.add(x);
    }

    @Override
    public V obtVertice(int pos) {
        return vertices.get(pos);
    }

    @Override
    public void insArista(int vi, int vf, A costo) {
        aristas[vi][vf] = costo;
        aristas[vf][vi] = costo;
    }

    @Override
    public void elimArista(int vi, int vf) {
        if (vi!=vf) {
            aristas[vi][vf] = inf;
        }
    }

    @Override
    public A obtArista(int vi, int vf) {
        return (A) aristas[vi][vf];
    }

    @Override
    public int orden() {
        return vertices.size();
    }

    @Override
    public ArrayList<V> sucesores(int v) {
        ArrayList<V> suc = new ArrayList<>();
        for (int i = 0; i < orden(); i++) {
            A arista = obtArista(i, v);
            if (v != i && arista != inf) {
                suc.add(obtVertice(i));
            }
        }
        return suc;
    }
    
    public ArrayList<V> predecesores(int v){
        ArrayList<V> pre = new ArrayList<>();
        for (int i = 0; i < orden(); i++) {
            A arista = obtArista(v, i);
            if (v != i && arista != inf) {
                pre.add(obtVertice(i));
            }
        }
        return pre;
    
    }

    @Override
    public A infinito() {
        return inf;
    }


    
}
