package simulacro_examen_ud5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;


public class Biblioteca 
{
    private Libro [] libro;
    private int contador ;

    public Biblioteca(){
    this.libro = new Libro[10];
    this.contador=0;
    }
    
    public boolean AnyadirLibro(Libro l)
    {
        if (this.contador == 10){
            System.out.println("no se puede añadir, el espacio esta lleno");
            return false;}
        
        for (int i = 0; i < this.contador; i++) 
        {
            if (this.libro[i].getCodigo().equals(l.getCodigo()))
            System.out.println("ese codigo y aexiste, no se puede añadir");
            return false;
        }
        
        this.libro[contador]=l;
        this.contador++;
        System.out.println("libro añadido");
        return true;  
    }
    public boolean BorrarLibro(String codigo)
    {
    for(int x=0;x<this.contador;x++)
        {
                if(libro[x].getCodigo().equals(codigo) && contador!=0){
                libro[x]=null;
                this.contador--;
                return true;
                }
                else{
                    System.out.println("no se ha encontrado el libro o directamente no hay ninguno");
                }
        }
    return false;
    }
    
    public int NumeroLibros(){
 
    return this.contador;
    }
    
    public boolean MostrarInformacion(String nombre)
    {
        for(int x=0;x<this.contador;x++)
        {
            if(this.libro[x].getNombre().equals(nombre)){
            System.out.println("LOS DATOS DEL LIBRO SELECCIONADO SON:");
            System.out.println("nombre: "+this.libro[x].getNombre());
            System.out.println("autor: "+this.libro[x].getAutor());
            System.out.println("codigo: "+this.libro[x].getCodigo());
            System.out.println("Fecha de Publicacion: "+this.libro[x].getFechaPublicacion());
            return true;
            }
            else{
            System.out.println("no hay informacion disponible");
                }
        }
        
    return false;
    }
public boolean ModificarLibro(String codigo,String nombre, String autor)
    {
        for(int x=0;x<this.contador;x++)
        {
            if(this.libro[x].getCodigo().equals(codigo))
            {
            this.libro[x].setNombre(nombre);
            this.libro[x].setAutor(autor);
                System.out.println("libro modificado con exito");
            return true;
            }
            else{
                System.out.println("no hay ningun libro con ese codigo");
                }
        }
        
    return false;
    }

    public Libro[] getLibro() {
        return libro;
    }

    public int getContador() {
        return contador;
    }

    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
