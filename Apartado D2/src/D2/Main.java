
package D2;

import java.time.LocalDate;
import java.time.Month;


public class Main 
{
    public static void main(String[] args) 
    {
	Persona persona1 = new Persona();
	Persona persona2 = new Persona();
	
	persona1.setDni("22222222F");
	persona1.setNombre("Trino");
	persona1.setApellidos("Gómez López");
	persona1.setFechaNacimiento(LocalDate.of(2021, Month.MARCH, 20));
	
	persona2.setDni("33333333F");
	persona2.setNombre("Maria");
	persona2.setApellidos("López López");
	persona2.setFechaNacimiento(LocalDate.of(1986, Month.MARCH, 20));
	
	System.out.println("DNI: " +  persona1.getDni() + 
	                   " Nombre: " + persona1.getNombre() + 
                           " Apellidos: " + persona1.getApellidos() + 
                           " FEcha Nacimiento: " + persona1.getFechaNacimiento().toString());
					   
	System.out.println("DNI: " +  persona2.getDni() + 
	                   " Nombre: " + persona2.getNombre() + 
                           " Apellidos: " + persona2.getApellidos() + 
                           " FEcha Nacimiento: " + persona2.getFechaNacimiento().toString());
        
	if(persona1.EsMayorEdad())
	{
            System.out.println(persona1.getNombre() + " es mayor de edad");
	}
	else
	{
            System.out.println(persona1.getNombre() + " es menor de edad");
	}
	
	if(persona2.EsJubilado())
	{
            System.out.println(persona1.getNombre() + " estÃ¡ jubilado");
	}
	else
	{
            System.out.println(persona1.getNombre() + " no estÃ¡ jubilado");
	}
        
        System.out.println("La diferencia de edad es: " + persona2.DiferenciaEdad(persona1));	
    }    
}
