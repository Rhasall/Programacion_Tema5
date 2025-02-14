package I3;

public class Cancion 
{
    private String titulo;
    private String autor;
    
    //constructor predeterminado que inicializa el título y el autor a cadenas vacías
    public Cancion() {}
    
    //constructor sobrecargado que recibe como parámetros el título y el auto de la canción
    public Cancion(String tit, String aut) 
    {
        this.titulo = tit;
        this.autor = aut;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        //Antes de actualizar el titulo validamos que no esté vacio
        //ValidarCadena(titulo);
        this.titulo = titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    } 
}