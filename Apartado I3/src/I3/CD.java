package I3;

public class CD 
{
    //Variable que utilizaré para el tamaño del array "canciones"
    private final int TOTAL = 10;
    
    // "canciones" es un array de objetos de la clase Cancion con 10 elementos
    private Cancion[] canciones;
    private int contador;
    
    public CD()
    {
        this.canciones = new Cancion[TOTAL];
        this.contador = 0;
    }
    
    //Constructor copia, permite copiar el array de canciones
    public CD(CD copia)
    {
        this.canciones = copia.canciones;
        this.contador = copia.contador;
    }
    
    //devuelve el valor del contador de canciones
    public int NumeroCanciones()
    {
        return this.contador;
    }
    
    public Cancion ObtenerCancionByTitulo(String titulo)
    {
        Cancion tema=new Cancion();
        
        for(int i = 0; i < this.contador; i++)
        {
            if(this.canciones[i].getTitulo().equals(titulo))
            {
                tema = this.canciones[i];
            }
        }
        return tema;
    }
    
    //devuelve la Cancion que se encuentra en la posición indicada
    public Cancion DameCancion(int posicion) 
    {
        Cancion tema=null;
        
        if(posicion<this.contador)
        {
            tema = this.getCanciones()[posicion];
        }
        return tema;
    }
    
    //Reemplazar (sin eliminar) una canción existente en un array de canciones por una nueva canción.
    public boolean GrabaCancion(int posicion, Cancion nuevaCancion) 
    {
        //Compruebo si hay espacio libre en el array para mover la cancion
        if(this.contador<TOTAL) //al menos habrá una posición libre para mover la canción
        {
            //muevo la canción a la última posición del array
            this.canciones[this.contador]=this.canciones[posicion];
            
            //Guardo la nuevaCacion en la posición elegida
            this.canciones[posicion] = nuevaCancion;
            
            this.contador++;
            
            return true;
        }
        else
            return false;
    }
    
    //agrega al final del array la Cancion proporcionada. Devolverá un boolean indicando si se ha podido agragar la canción
    public boolean Agrega(Cancion nuevaCancion)
    {
        boolean resultado = false;
        
        if(this.contador < 10)
        {
            this.canciones[contador] = nuevaCancion;
            this.contador++;
            resultado = true;
        }
        return resultado;
    }
    
    //Elimina la Cancion que se encuentra en la posición indicada
    public boolean Elimina(int posicion) 
    {
        if(posicion<this.contador)
        {
            //borramos el contenido en la posicion deseada en el array
            this.canciones[posicion] = null;

            //desplazamos desde la posción eliminada las canciones hacia la izquierda
            for(int i = posicion; i < this.contador-1; i++)
            {
                this.canciones[i] = this.canciones[i+1];
            }

            //Eliminamos la ultima canción para evitar duplicados
            this.canciones[this.contador-1] = null;

            //Decrementamos el contador de canciones
            this.contador--;
            
            return true;
        }
        return false;
    }
    
    //devuelve un array de canciones relacionadas con el autor que se pasa por parámetro
    public Cancion[] ObtenerCancionByAutor(String autor)
    {
        // Creo un array del tipo Cancion. El tamaño del array dependerá de la cantidad de canciones encontradas.
        // Si no se encuentra ninguna canción, devolverá el array nulo.
        Cancion[] cancionesAutor=null;
        
        int numCanciones = 0;
        
        //Primero contamos cuantas canciones existen del autor, de esta forma averiguamos de que tamaño será nuestro array "cancionesAutor"
        for(int i = 0; i < this.contador; i++)
        {
            //this.canciones[i].getAutor() -> recorro todo el array obtenido cada autor || Despues se compara con el nombre recibido
            if(this.canciones[i].getAutor().equals(autor))
            {
                //En el caso de encontrar el autor en el array se aumenta el contador
                numCanciones++;
            }
        }
      
        //Si he encontrado alguna cancion
        if(numCanciones>0)
        {
            int cont = 0;
            
            //Damos el tamaño al array "cancionesAutor" 
             cancionesAutor = new Cancion[numCanciones];

            //Guardamos las canciones encontradas en el array
            for(int i = 0; i < this.contador; i++)
            {
                if(this.canciones[i].getAutor().equals(autor))
                {
                    cancionesAutor[cont] = this.canciones[i];
                    cont++;
                }
            }
        }
        //devolvemos el array con las canciones guardadas o nulo en caso de no haber encontrado ninguna.
        return cancionesAutor;
    }
    
    //devuelve la posición del array donde se encuentra la canción con el título pasado por parámetro
    public int ObtenerPosicionCancionByTitulo(String titulo)
    {
        int cancionBuscada = -1;
        
        for(int i = 0; i < this.contador; i++)
        {
            if(this.canciones[i].getTitulo().equals(titulo))
            {
                cancionBuscada = i;
            }
        }
        return cancionBuscada;
    }
    
    //Creo esta funcion aunque no la pide el ejercicio para mostrar las canciones del CD
    public void MostrarContenidoDelCD()
    {
        System.out.println("Listado de canciones del CD: ");
        for(int x=0; x< this.contador; x++)
        {
            System.out.println("\t"+ x + ". Titulo: " +this.canciones[x].getTitulo() + " || Autor: "+ this.canciones[x].getAutor());
        }
    }
    
    public Cancion[] getCanciones() 
    {
        return canciones;
    }
   
    public void setCanciones(Cancion[] canciones) 
    {
        this.canciones = canciones;
    }

    public int getContador() 
    {
        return contador;
    }
  
    public void setContador(int contador) 
    {
        this.contador = contador;
    }
}
