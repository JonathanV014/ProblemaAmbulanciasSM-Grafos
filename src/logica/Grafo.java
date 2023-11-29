/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Vizcaino
 */
public interface Grafo<V,A> {
    void insVertice(V x);
    V obtVertice(int pos);
    void insArista(int vi, int vf, A costo);
    void elimArista(int vi, int vf);
    A obtArista(int vi, int vf);
    int orden();
    ArrayList<V> sucesores(int v);
    A infinito();



}
