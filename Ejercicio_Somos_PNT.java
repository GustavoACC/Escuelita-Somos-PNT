/*
 * Realizado por Gustavo Arias Contreras (gustavo.ariasc@hotmail.com)
 * Ejercicio de https://somospnt.com/candidatos.html
 * 
 */
package ejercicio_somos_pnt;
import java.util.*;

public class Ejercicio_Somos_PNT {

    
    public static void main(String[] args) {
        List<Producto> Lista = new ArrayList<>();
        
        Bebidas Pro1 = new Bebidas(20,"Coca-Cola Zero",1.5);
        Bebidas Pro2 = new Bebidas(18,"Coca-Cola",1.5);
        Limpieza Pro3 = new Limpieza(19,"Shampoo Sedal",500);
        Frutas Pro4 = new Frutas(64, "Frutillas", "kilo");
        
        Lista.add(Pro1);
        Lista.add(Pro2);
        Lista.add(Pro3);
        Lista.add(Pro4);
        
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
