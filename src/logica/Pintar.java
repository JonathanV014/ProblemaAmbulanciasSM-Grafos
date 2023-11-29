/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Jonathan Vizcaino
 */
public class Pintar {
    Color color;

    public Pintar() {
        
    }
    
    public static void pintarCirculo(Graphics g,int x,int y, String n){
        ((Graphics2D)g).setColor(Color.WHITE);
        ((Graphics2D)g).setStroke(new BasicStroke(3));       
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        ((Graphics2D)g).setColor(Color.BLACK);
        ((Graphics2D)g).drawOval(x, y, 15, 15);
        
        ((Graphics2D)g).setColor(Color.BLACK);
        Font fuente=new Font("Arial",Font.BOLD, 15);
        g.setFont(fuente);
        ((Graphics2D) g).setColor(Color.YELLOW); // Cambia Color.RED al color que desees
        ((Graphics2D) g).drawString(n, x, y);  
    }
    
    public static void pintarLinea(Graphics g, int x1, int y1, int x2, int y2, float tam) {
        int xAux = 0;
        int yAux = 0;
        
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(3);
        ((Graphics2D) g).setStroke(stroke);

        // Dibujar la línea
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);

        // Calcular posición para el texto
        if (x1 <= x2)
            xAux = ((x2 - x1) / 2) + x1;
        if (x1 > x2)
            xAux = ((x1 - x2) / 2) + x2;
        if (y1 < y2)
            yAux = ((y2 - y1) / 2) + y1;
        if (y1 >= y2)
            yAux = ((y1 - y2) / 2) + y2;

        String valorKm = String.valueOf(tam) + "Km";

        ((Graphics2D) g).setColor(Color.BLACK);
        Font fuente = new Font("Arial", Font.PLAIN, 10);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(valorKm, xAux, yAux);
    } 
    
    public static void pintarCamino(Graphics g, int x1,int y1,int x2,int y2, Color color){
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1+10, y1+10, x2+10, y2+10);
    }
    
    
    public void clickSobreNodo(Graphics g, int x, int y, String texto, Color a) {
        // Dibujar círculo con fondo blanco
        ((Graphics2D) g).setColor(a);
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        ((Graphics2D) g).fillOval(x, y, 15, 15);

        // Dibujar círculo exterior en negro
        ((Graphics2D) g).setColor(Color.BLACK);
        ((Graphics2D) g).drawOval(x, y, 15, 15);

        // Dibujar etiqueta en negro
        ((Graphics2D) g).setColor(Color.BLACK);
        Font fuente = new Font("Arial", Font.BOLD, 15);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(texto, x, y);
    }
}
