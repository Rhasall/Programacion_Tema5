package simulacro_examen_ud5;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
public class Simulacro_Examen_UD5 
{
    public static void Menu() {
        System.out.println("MENU");
        System.out.println("1. Añadir Libro");
        System.out.println("2. Borrar Libro");
        System.out.println("3. Consultar Numero de Libros");
        System.out.println("4. Mostrar Informacion del Libro");
        System.out.println("5. Modificar Libro");
        System.out.println("6. Salir");
        
        System.out.println("\t Seleccione una opcion: ");
    }
    
    public static void main(String[] args) throws Exception 
    {

        Scanner lectura = new Scanner(System.in);
        int opcionMenu=-1;
        boolean MenuFin=true;
        Biblioteca b1=new Biblioteca();
        
        do {  
        Menu();
        
            try {
                opcionMenu= lectura.nextInt();
            } catch (Exception e) {
             
            }
            
        lectura.nextLine();
        switch (opcionMenu) {
            case 1:
                String nombre,autor,codigo,fechaString;
                LocalDate fecha;
                System.out.print("dime el nombre del libro: ");
                nombre=lectura.nextLine();
                System.out.print("dime el nombre del autor: ");
                autor=lectura.nextLine();
                System.out.print("dime el nombre del codigo: ");
                codigo=lectura.nextLine();
                System.out.print("dime la fecha en la que se publico con este formato dd/MM/yyyy: ");
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //mi patron
                
                fechaString = lectura.nextLine();
                fecha = LocalDate.parse(fechaString, formato);
                
                Libro libreria = new Libro(nombre, autor, codigo, fecha);
                
                b1.AnyadirLibro(libreria);
                
                break;
                
            case 2:
                String CodigoLibroBorrar;
                System.out.println("dime el codigo del libro a borrar: ");
                CodigoLibroBorrar=lectura.nextLine();
                b1.BorrarLibro(CodigoLibroBorrar);
                
                break;
            case 3:
                 System.out.print("esta es la consulta de los libros que hay:");
                 System.out.println(b1.NumeroLibros());
                 break;
                 
            case 4:
                 String nombreLibro;
                 System.out.print("Dime el libro a consultar:");
                 nombreLibro=lectura.nextLine();
                
                 b1.MostrarInformacion(nombreLibro);
                 
                 break;
            case 5:
                 String codigoLibroBorrar,NombreModificar,AutorModificar;
                 
                 System.out.println("vamos a modificar los datos:");
                 System.out.println("dime el codigo del libro que quieres modificar:");
                 codigoLibroBorrar=lectura.nextLine();
                 System.out.println("dime el nuevo nombre a modificar del libro");
                 NombreModificar=lectura.nextLine();
                 System.out.println("dime el nuevo autor a modificar");
                 AutorModificar=lectura.nextLine();
                 
                 b1.ModificarLibro(codigoLibroBorrar, NombreModificar, AutorModificar);
                
                
                 break;
            case 6:
                System.out.println("adios");
                MenuFin=false;
                break;   
                 
            default:
                System.out.println("esa opcion no existe, pon un numero entero del 1 al 6");
        }
                  
            
        } while (MenuFin==true);
    }
}
