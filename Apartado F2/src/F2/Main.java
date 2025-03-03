package F2;

import java.time.LocalDate;
import java.time.Month;


public class Main 
{
    public static void main(String[] args) 
    {
	Persona persona1 = new Persona();
	Persona persona2 = new Persona("44444444D", "Maria", "Perez", LocalDate.of(1986, Month.JANUARY, 10));
        
        Persona copia2 = new Persona(persona2);
	
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
        
        
        System.out.println("DNI: " +  copia2.getDni() + 
	                   " Nombre: " + copia2.getNombre() + 
                           " Apellidos: " + copia2.getApellidos() + 
                           " FEcha Nacimiento: " + copia2.getFechaNacimiento().toString());
        
	if(copia2.EsMayorEdad())
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
