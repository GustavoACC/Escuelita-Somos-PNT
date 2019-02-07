package ejercicio_somos_pnt;

public class Bebidas extends Producto {
    
    private double Contenido;
    
    public Bebidas(int precio, String nombre, double contenido){
       super(precio,nombre);
       this.Contenido = contenido;
    }
    
    @Override
    public String toString(){
        
       return "Nombre: " + this.Descripcion + " /// Litros: " + this.Contenido + " /// Precio: $" + this.Precio;
    }
    
}
