package ejercicio_somos_pnt;

public class Limpieza extends Producto {
    
    private int Contenido;
    
    public Limpieza(int precio, String nombre, int contenido){
       super(precio,nombre);
       this.Contenido = contenido;
    }
    
    @Override
    public String toString(){
       return "Nombre: " + this.Descripcion + " /// Contenido: " + this.Contenido + "ml /// Precio: $" + this.Precio;
    }
}
