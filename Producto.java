package ejercicio_somos_pnt;

public class Producto implements Comparable<Producto> {

    protected int Precio;
    protected String Descripcion;
    
    public Producto(int precio, String nombre){
        this.Precio = precio;
        this.Descripcion = nombre;
    }
    
    
    public String getNombre(){
        return Descripcion;
    }
    
    public int getPrecio(){
        return Precio;
    }
    
    
    @Override
    public int compareTo(Producto o) {
        int resultado;
        
        if (o.getPrecio() > this.Precio){
            resultado = 1;
        }else if(o.getPrecio() < this.Precio){
            resultado = -1;
        }else{
            resultado = 0;
        }
        
        return resultado;
    }
    
    
}
