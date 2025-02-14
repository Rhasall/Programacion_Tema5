package I1;

import java.time.LocalDate;

public class Pelicula 
{
    private String titulo;
    private String[] actores;
    private String[] directores;
    private String formato;
    private LocalDate fechaSalida;
    
    public Pelicula() {}

    public Pelicula(String titulo, String[] actores, String[] directores, String formato, LocalDate fechaSalida)
    {
        this.titulo = titulo;
        this.actores = actores;
        this.directores = directores;
        this.formato = formato;
        this.fechaSalida = fechaSalida;
    }
    
    public void ModificarPelicula(String formato, LocalDate fecha)
    {
        
        //this.setFormato(formato);
        this.formato=formato;
        
        //this.setFechaSalida(fecha);
        this.fechaSalida=fecha;
    }
    
    //recibe el objeto pelicula
    public void VisualizarPelicula()
    {
        System.out.println("Titulo: " + this.getTitulo());
        
        System.out.println("directores: ");
        
        
        
        for(int i = 0; i < this.getDirectores().length; i++)
        {
            System.out.println("\t" + this.getDirectores()[i]);
        }
        
        System.out.println("Actores: ");
        for(int i = 0; i < this.getActores().length; i++)
        {
            System.out.println("\t" + this.getActores()[i]);
        }
        
        System.out.println("Fecha salida: " + this.fechaSalida);
        System.out.println("Formato: " + this.formato);
    }
    
     public String[] getDirectores() {
        return directores;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    public void setDirectores(String[] directores) {
        this.directores = directores;
    }
  
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}