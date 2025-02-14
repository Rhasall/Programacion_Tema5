package caso_practico;
import java.util.Scanner;
public class Caso_Practico 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner lectura = new Scanner(System.in);
        boolean pass1=true,pass2=true,pass3=true;
        
        Trabajador t1 = new Trabajador();
        String nombre;
        int edad,categoria,antiguedad;

            System.out.println("dime el nombre para el objeto");
            nombre = lectura.nextLine();
            t1.setNombre(nombre);
            
        do
        {
            try {
                System.out.println("dime ela edad para el objeto");
                edad = lectura.nextInt();
                t1.setEdad(edad);
                pass1=true;
                } 
                catch (Exception e) 
                {
                    System.out.println("la edad deber ser 18 o mas");
                    lectura.next();
                    pass1=false;
                }
        }
        while (pass1==false); 
        
        do
        { 
        try {
            System.out.println("dime la categoria para el objeto");
            categoria = lectura.nextInt();
            t1.setCategoria(categoria);
            pass2=true;
            } 
            catch (Exception e) 
            {
                System.out.println("categoria debe ser 0, 1 o 2");
                lectura.next();
                pass2=false;
            }
        }
        while (pass2==false);  
        
        do
        {            
            try {
                System.out.println("dime la antiguedad para el objeto");
                antiguedad = lectura.nextInt();
                t1.setAntiguedad(antiguedad);
                pass3=true;
                } 
                catch (Exception e) 
                {
                    System.out.println("antiguedad debe ser 0, 1 o 2");
                    lectura.next();
                    pass3=false;
                }
        }
        while (pass3==false);      
        System.out.println("el objeto ha quedado asi: ");
        System.out.println("el nombre es: "+t1.getNombre());
        System.out.println("la edad es: " + t1.getEdad());
        System.out.println("la antiguedad es: "+t1.getAntiguedad());
        System.out.println("la categoria es: "+t1.getCategoria());
        System.out.println("el sueldo a calcular con los datos optenidos es: "+t1.CalcularSueldo()+" €");
        
        System.out.println("ahora invoco con constructos: ");
        Trabajador t2 = new Trabajador("felipe", 44);
        /////////////////////////////////////////////////////////////
        System.out.println("el trabajador con errores en nombre");
        try {
        Trabajador t3 = new Trabajador("", 44);
        } 
        catch (Exception e) 
        {
        System.out.println("Error en el trabajador t3: " + e.getMessage());
        }
 
        Trabajador t4 = new Trabajador("jamon", 32, 1, 2);
        /////////////////////////////////////////////////////////////
        
        System.out.println("el trabajador con errores en categoria y antiguedad");
        try {
        Trabajador t5 = new Trabajador("jamon", 32, -1, 4);
        } 
        catch (Exception e) 
        {
        System.out.println("Error en el trabajador t5: " + e.getMessage());
        }
        /////////////////////////////////////////////////////////////
        
        System.out.println("el trabajador copia");
        Trabajador t6 = new Trabajador(t1); 
    }
}
