package H1;

import java.time.LocalDate;
import java.time.Month;


public class Main 
{
    public static void main(String[] args) 
    {
       
        /*
        Intento crear una instancia de Persona usando el constructor por defecto,
        Pero al ser privado mostraría error
        //Persona persona0 = new Persona(); */
        
        //LLamo al constructor sobrecargado 1
	Persona persona1 = new Persona("44444444D", "Maria", "Perez", LocalDate.of(1986, Month.JANUARY, 10));
        
        //LLamo al constructor sobrecargado 2
        Persona persona2 = new Persona("12345678J", "Julian", "Perez Perez", LocalDate.of(1986, Month.JULY, 4), 'H', 75, 1.75);
	
	persona1.setNombre("Trino");
	persona1.setApellidos("Gomez Lopez");
	persona1.setFechaNacimiento(LocalDate.of(2021, Month.MARCH, 20));
	
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
		System.out.println(persona1.getNombre() + " esta jubilado");
	}
	else
	{
		System.out.println(persona1.getNombre() + " no esta jubilado");
	}
        
        System.out.println("La diferencia de edad es: " + persona2.DiferenciaEdad(persona1));	
    }   
}
