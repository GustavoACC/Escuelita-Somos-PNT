/*
 * Realizado por Gustavo Arias Contreras (gustavo.ariasc@hotmail.com)
 * Ejercicio de https://somospnt.com/candidatos.html
 * 
 */
package com.ejercicio;
import java.util.*;

public class EjercicioMain {
    
    public static void main(String[] args) {
        List<Producto> Lista = new ArrayList<>();
        
        Bebidas Producto1 = new Bebidas(20,"Coca-Cola Zero",1.5);
        Bebidas Producto2 = new Bebidas(18,"Coca-Cola",1.5);
        Limpieza Producto3 = new Limpieza(19,"Shampoo Sedal",500);
        Frutas Producto4 = new Frutas(64, "Frutillas", "kilo");
        
        Lista.add(Producto1);
        Lista.add(Producto2);
        Lista.add(Producto3);
        Lista.add(Producto4);
        
        for(int i = 0; i < Lista.size();i++)
        {
            System.out.println (Lista.get(i).toString());
        }
        
        System.out.println("=============================");
        Collections.sort(Lista);
        System.out.println ("Producto más caro: " + Lista.get(0).getNombre());
        System.out.println ("Producto más barato: " + Lista.get(Lista.size()-1).getNombre());
    }
}
