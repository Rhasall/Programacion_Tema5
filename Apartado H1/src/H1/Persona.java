package H1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona 
{
    /*
    "final" 
     Atributo inmutable: El DNI de una persona no puede variar.
     Solo se puede modificar en el constructor.
    
    "private"
    Solo accesible desde la clase,  
    Cada objeto tendrá su propia copia de la variable dni con su propio valor único*/
    private final String dni;
    //Cada instancia de la clase (objeto) tiene su propia copia única e inmutable de la variable dni.
    
    
    /* "static"
    Indica que la variable "MayoriaEdad" es compartida por todas las instancias (objetos) de la clase. 
    No hay una copia individual de MayoriaEdad para cada objeto.
    "private"
    solo accesible desde la clase
    "final"
    Atributo inmutable: La mayoria de edad no puede cambiar */ 
    private static final int MayoriaEdad=18;
    
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private char sexo;
    private double peso;
    private double altura;
	
    //////////////////////////////////////////////////////////////////////////////////////////////////
    //constructor por defecto
    private Persona() {
        // Declarado como privado para que no se pueda utilizar fuera de la clase
        // y se debe especificar el DNI al crear una Persona
        dni = null;       
    }
    
    //constructor sobrecargado 1
    public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //constructor sobrecargado 2
    public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, char sexo, double peso, double altura)
    {
        this(dni, nombre, apellidos, fechaNacimiento);
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public void Saludar()
    {
            System.out.println("Hola, soy " + getNombre());
    }

    public void Mostrar()
    {
            System.out.println("DNI: " + this.getDni());
            System.out.println("Nombre: " + this.getNombre());
            System.out.println("Apellidos: " + this.getApellidos());
            System.out.println("Fecha Nacimiento: " + this.getFechaNacimiento());
            System.out.println("Sexo: " + this.getSexo());
            System.out.println("Peso: " + this.getPeso());
            System.out.println("Altura: " + this.getAltura());
    }
    
    public boolean EsMayorEdad()
    {
        boolean resultado = false;
        
        LocalDate hoy = LocalDate.now();
        int edad = (int)ChronoUnit.YEARS.between(this.getFechaNacimiento(), hoy);
        
        //comprueba si una persona es mayor de edad
        if(edad >= MayoriaEdad)
        {
            resultado = true;
        }
        
        return resultado;            
    }
    
    public boolean EsJubilado()
    {
        boolean resultado = false;
        
        LocalDate hoy = LocalDate.now();
        int edad = (int)ChronoUnit.YEARS.between(this.getFechaNacimiento(), hoy);
        
        if(edad >= 65)
        {
            resultado = true;
        }
        
        return resultado;           
    }
    
    public int DiferenciaEdad(Persona p)
    {
        int diferencia = (int)ChronoUnit.YEARS.between(this.getFechaNacimiento(), p.getFechaNacimiento());
        
        return diferencia;
    }

    public String getDni() {
        return dni;
    }

    /*
    Ya no se puede utilizar este metodo, porque Java no dejará modificar el atributo dni
    al ser declarada "private final String dni"
    public void setDni(String dni) {
        this.dni = dni;
    }  */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}