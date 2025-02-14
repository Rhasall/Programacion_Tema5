package I1;

import java.time.LocalDate;

public class VideoClub 
{
    
    //Para utilizar Pelicula[] listaPeliculas; debe existir la clase llamada "Pelicula". 
    //La declaración Pelicula[] listaPeliculas; está indicando que listaPeliculas es un array que puede contener objetos de la clase Pelicula.
    private Pelicula[] listaPeliculas;
    private int contador;
    
    public VideoClub()
    {
        //creo un array de objetos de la clase Pelicula con capacidad para 10 elementos
        listaPeliculas = new Pelicula[10];
        contador = 0;
    }
    
    //Recibo del main.java los valores para crear un nuevo objeto "nuevaPelicula"
    //public boolean InsertarPelicula(String titulo, String[] actores, String[] directores, String formato, LocalDate fechaSalida)
    public boolean InsertarPelicula(Pelicula p1)
    {
        boolean resultado = false;
        
        //Creo objeto "nuevaPelicula" de la clase "Pelicula.java" con los valores recibidos
        //Utilizo el constructor sobrecargado de la clase "Pelicula"
        //Pelicula nuevaPelicula = new Pelicula(titulo, actores, directores, formato, fechaSalida);
        
        //Compruebo que no hayan mas de 10 (objetos) peliculas para poder guardarla en el array "listaPeliculas" del objeto "videoClub"
        //con el this nos estamos refiriendo al objeto "videoClub"
        if(this.contador < 10)
        {
            //Guardamos la nueva pelicula en el array
            this.listaPeliculas[this.contador] = p1;
            //this.listaPeliculas[this.contador] =new Pelicula(titulo, actores, directores, formato, fechaSalida);
            this.contador++;
            resultado = true;
        }       
        return resultado;
    }
    
    public boolean ModificarPelicula(String titulo, String formato, LocalDate fecha)
    {
        boolean resultado = false;
        
        //Bucle que recorre el array en busca del titulo de la pelicula
        for(int i = 0; i < this.contador; i++)
        {
            //Si encuentra el titulo
            if(this.listaPeliculas[i].getTitulo().equals(titulo))
            {
                this.listaPeliculas[i].ModificarPelicula(formato, fecha);
                resultado = true;
            }
        }   
        
        return resultado;
    }
    
    public boolean BorrarPelicula(String titulo)
    {
        boolean resultado = false;
        
        //Vamos a recorrer el array "listaPeliculas" en busca del titulo
        for(int i = 0; i < this.contador; i++)
        {
            //Si encontramos el titulo
            if(this.listaPeliculas[i].getTitulo().equals(titulo))
            {
                //Ponemos a "null" esa posición del array (borramos la pelicula)
                this.listaPeliculas[i] = null;
                
                //Desde la posicion que hemos borrado hasta el final del array
                for(int j = i; j < this.contador; j++)
                {
                    //Movemos las posiciones de las peliculas dentro del array                            
                    this.listaPeliculas[j] = this.listaPeliculas[j+1];
                }
                
                //Borramos la Ultima peli­cula para no duplicarlo.
                this.listaPeliculas[contador] = null;
                
                resultado =true;
                this.contador--;
            }
        }
        
        return resultado;
    }
    
    public void MostrarPelicula(String titulo)
    {
        for(int i = 0; i < this.contador; i++)
        {
            //atributo del objeto "videoClub"
            if(this.listaPeliculas[i].getTitulo().equals(titulo))
            {
                this.listaPeliculas[i].VisualizarPelicula();
            }
            else
            {
                System.out.println("Pelicula no encontrada.");
            }
        }
    }
}

