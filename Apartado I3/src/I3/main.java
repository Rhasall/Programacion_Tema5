package I3;

import java.lang.reflect.Array;

public class main 
{    
  

    public static void main(String[] args) 
    {
       //creamos objeto "cdPirata" de la clase "CD" donde guardaremos las canciones
       //Utilizo el constructor predeterminado, inicializa el título y el autor a cadenas vacías
       CD cdPirata = new CD();

       //Creamos diferentes objetos "Cancion" de la clase "Cancion"
       Cancion Cancion1 = new Cancion("Submarino amarillo", "The Beatles");
       Cancion Cancion2 = new Cancion("Jesus", "Depeche Mode");
       Cancion Cancion3 = new Cancion("Otherside", "Red Hot Chili Peppers");
       Cancion Cancion4 = new Cancion("Dark Necessities", "Red Hot Chili Peppers");
       Cancion Cancion5 = new Cancion("Stairway to Heaven", "Led Zeppelin");
       Cancion Cancion6 = new Cancion("Bohemian Rhapsody", "Queen");
       Cancion Cancion7 = new Cancion("Hotel California", "Eagles");
       Cancion Cancion8 = new Cancion("Smells Like Teen Spirit", "Nirvana");


       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
       //Llamamos al método "Agrega" de la clase "CD" para insertar las canciones
       //cdPirata es el objeto que contiene el array "canciones" donde almacenaremos los objetos "Cancion"
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 1: Agrega() --> agrega en la primera posición libre del array (contador) la Cancion proporcionada.");

       //Compruebo si se ha podido agregar la canción al CD (no deberia de dar problema, ya que es la primera canción en nsertar y el array está vacio)
       if(cdPirata.Agrega(Cancion1))
       {
            System.out.println("Cancion guardada correctamente: " + Cancion1.getTitulo());
       }
       else
       {
           System.out.println("No se ha podido guardar la canción: " + Cancion1.getTitulo());
       }

       //Inserto el resto de canciones al array
       cdPirata.Agrega(Cancion2);     
       cdPirata.Agrega(Cancion3);     
       cdPirata.Agrega(Cancion4);  
       cdPirata.Agrega(Cancion5);     
       cdPirata.Agrega(Cancion6);   
       cdPirata.Agrega(Cancion7);    
       cdPirata.Agrega(Cancion8);     

       //Muestro el contenido del CD
       cdPirata.MostrarContenidoDelCD();


       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //LLAMADA AL METODO: NumeroCanciones
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 2: NumeroCanciones() --> devuelve el valor del contador de canciones.");

       int totalCanciones=cdPirata.NumeroCanciones();

       System.out.println("El cd tiene " + totalCanciones + " canciones.");

       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //LLAMADA AL METODO: DameCancion
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 3: DameCancion(int) --> devuelve la Cancion que se encuentra en la posición indicada.");

       Cancion devuelta = cdPirata.DameCancion(2);

       if(devuelta!=null)
       {
           System.out.println("La cancion encontrada en esa posición es: "+ devuelta.getTitulo());
       }
       else
       {
           System.out.println("Canción no encontrada en esa posicion");
       }

       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////          


       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //LLAMADA AL METODO: GrabaCancion         
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 4: GrabaCancion(int, Cancion) --> graba nueva cancion -Comfortably Numb- en array sin eliminar la que esta en su posicion (2)");

       //Creamos nuevo objeto nuevaCancion11
       Cancion Cancion11 = new Cancion("Comfortably Numb", "Pink Floyd");

       //Le pasamos el objeto array donde queremos guardar la cancion "cdPirata", la posición donde queremos guardar, y el objeto cancion "Cancion11" 
       if(cdPirata.GrabaCancion(2, Cancion11))
       {
           System.out.println("Cancion guardada correctamente.");             
       }
       else
       {
           System.out.println("No hay espacio para guardar la canción.");
       }

       //Voy a mostrar el contenido del cd para comprobar que se ha grabado la canción:
       cdPirata.MostrarContenidoDelCD();

       //Muestro el total de canciones que hay ahora despues de añadir la canción
       System.out.println("Total canciones: " + cdPirata.getContador());
       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //LLAMADA AL METODO: Elimina    
       //Eliminando una cancion que este en la posción indicada     
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 5: Elimina(int) --> eliminando la cancion en posicion 0");


       if(cdPirata.Elimina(0))
       {
           System.out.println("Canción eliminada correctamente.");
       }
       else
       {
           System.out.println("Error al eliminar la canción");
       }

       cdPirata.MostrarContenidoDelCD();
       System.out.println("Total canciones: " + cdPirata.getContador());
       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 6: ObtenerCanciónByAutor(Nirvana) ");

       //Llamo a la funcion y le paso el nombre del grupo a buscar sus canciones
       //Creo un nuevo array "cancionesPorAutor" de la clase "CD" donde guardaré las canciones encontradas en el método "ObtenerCancionByAutor"
       Cancion[] cancionesPorAutor = cdPirata.ObtenerCancionByAutor("Nirvana");

       //Si ha encontrado alguna canción:
       if(cancionesPorAutor != null)
       {              
            System.out.println("Canciones de " + cancionesPorAutor[0].getAutor() + " encontradas:");

            //Muestro las canciones que ha encontrado y guardado en el array recibido:
            for(int i = 0; i < cancionesPorAutor.length; i++)
            {
                System.out.println("\t" + cancionesPorAutor[i].getTitulo());
            }
       }
       else
       {
           System.out.println("No se han encontrado canciones del autor.");
       }

       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //LLAMADA AL METODO: ObtenerPosicionCancionByTitulo       
       //Buscamos la posición donde se ha guardado en el array la cancion "Otherside" 
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 7: ObtenerCanciónByTitulo(titulo) --> obtener posicion de la cancion con titulo Dark Necessities");

       int posicion=cdPirata.ObtenerPosicionCancionByTitulo("Dark Necessities");         

       if(posicion!=-1)
       {
           System.out.println("La posicion guardada de la cancion Dark Necessities es: " + posicion);
       }
       else
       {
           System.out.println("Canción no encontrada.");
       }
       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //LLAMADA AL METODO: Constructor copia
       System.out.println("*********************************************************************************");
       System.out.println("PRUEBA 8: constructor COPIA ");


       //creo el nuevo CD "cdRock" e intento copiar ahi el contenido de cdPirata
       CD cdRock = new CD(cdPirata);
       cdRock.MostrarContenidoDelCD();
       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }        
}
