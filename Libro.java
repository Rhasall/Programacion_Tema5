package simulacro_examen_ud5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Libro 
{
    private String nombre;
    private String  autor;
    private String codigo;
    private LocalDate fechaPublicacion;
    
    
public Libro(){


}
public Libro(String nombre,String autor, String codigo,LocalDate fecha)
{
this.nombre=nombre;
this.autor=autor;
this.codigo=codigo;
this.fechaPublicacion=fecha;

}

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    
    
public void finalize()
{
System.out.println("elemento eliminado con finalize");
}

}
