package I1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main 
{  
    public static void main(String[] args) throws Exception 
    {
        try
        {
            Scanner entrada = new Scanner(System.in);
            
            //creamos objeto "videoClub" de la clase VideoClub.java
            //este contiene un atributo array llamado "listaPeliculas" con capacidad para 10 objetos de tipo pelícla y un atributo contador de tipo int
            VideoClub videoClub = new VideoClub();
            
            
            //Variable para la opción del menuú
            int opcion;
            
            String titulo, fechaSalida, formato;
            
            String[] actores; 
            String[] directores;
            
            //Variable "formatter" del tipo DateTimeFormatter
            DateTimeFormatter formatter;
            
            //Variable "localDate" que representa una fecha (año, mes, día)
            LocalDate localDate;
                    
           do
           {
               System.out.println("Menu");
               System.out.println("1. Insertar Peli­cula");
               System.out.println("2. Modificar Peli­cula");
               System.out.println("3. Eliminar Peli­cula");
               System.out.println("4. Visualzar Peli­cula");
               System.out.println("5. Salir");
               System.out.println("\n Seleccione una opcion: ");
               
               opcion = entrada.nextInt();
               
               switch (opcion) 
               {
                   case 1://Insertar pelicula
                       System.out.println("Introduzca el ti­tulo");
                       titulo = entrada.next();
                       //entrada.next();
                       
                       //////////////////////////////////////////////////
                       //debe ser un bucle par meter mas actores
                       int numAct=0;
                       System.out.println("¿Número de actores?");
                      
                       numAct = entrada.nextInt();
                       
                       actores = new String[numAct]; 
            
                       
                       for(int i=0; i<numAct; i++)
                       {
                           System.out.println("Introduce actor " + (i+1) + " :");
                            actores[i] = entrada.next();
                       }
                       
                       int numDir=0;
                       System.out.println("¿Número de directores?");
                        
                       numDir = entrada.nextInt();
                       directores = new String[numDir];
                       
                       for(int i=0; i<numDir; i++)
                       {
                           System.out.println("Introduce director " + (i+1) + " :");
                            directores[i] = entrada.next();
                       }
                       
                      
                       //////////////////////////////////////////////////
                       
                       System.out.println("Introduzca fecha de salida");
                       fechaSalida = entrada.next();
                       
                       //Creamos el patrón para la fecha
                       formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                       //date = fechaSalida;
                       localDate = LocalDate.parse(fechaSalida, formatter);
                       
                       System.out.println("Introduzca formato");
                       formato = entrada.next();
                       
                      
                       Pelicula pel = new Pelicula(titulo,actores,directores,formato,localDate);
                       //Invocamos al método de la clase "VideoClub" del objeto "videoClub" y enviamos el objeto creado "pel"
                       
                       if(videoClub.InsertarPelicula(pel))
                       {
                           System.out.println("Peli­cula Insertada"); 
                       }
                       else
                       {
                          System.out.println("Error al insertar la peli­cula"); 
                       }
                       break;
                                          
                   case 2://Modificar pelicula
                       System.out.println("Introduzca el ti­tulo");
                       titulo = entrada.next();
                       
                       System.out.println("Introduzca formato");
                       formato = entrada.next();
                       
                       System.out.println("Introduzca fecha de salida");
                       fechaSalida = entrada.next();
                       
                       formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                       
                       localDate = LocalDate.parse(fechaSalida, formatter);
                       
                       //Se invoca el método "ModificarPelicula" del objeto "videoClub", 
                       //pasando como parámetros el nuevo título de la película , el nuevo formato y la nueva fecha de estreno.
                       if(videoClub.ModificarPelicula(titulo, formato, localDate))
                       {
                          System.out.println("Peli­cula modifica"); 
                       }
                       else
                       {
                          System.out.println("Error al modificar la peli­cula"); 
                       }
                       break;
                       
                    case 3://eliminar pelicula
                       System.out.println("Introduzca el ti­tulo");
                       titulo = entrada.next();
                       
                       if(videoClub.BorrarPelicula(titulo))
                       {
                          System.out.println("Peli­cula borrada"); 
                       }
                       else
                       {
                          System.out.println("Error al borrar la peli­cula"); 
                       }
                       break;
                       
                    case 4://Visualizar pelicula
                       System.out.println("Introduzca el ti­tulo");
                       titulo = entrada.next();
                       
                       videoClub.MostrarPelicula(titulo);
                       break;
                       
                   default:
                       System.out.println("ADIOS");
               }              
           }
           while(opcion != 5);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }     
}
