package ejercicio_somos_pnt;

public class Frutas extends Producto {
    
    private String Contenido;
    
    public Frutas(int precio, String nombre, String contenido){
       super(precio,nombre);
       this.Contenido = contenido;
    }
    
    @Override
    public String toString(){
        
       return "Nombre: " + this.Descripcion + " /// Precio: $" + this.Precio + " /// Unidad de venta: " + this.Contenido;
    }
    
    
}
