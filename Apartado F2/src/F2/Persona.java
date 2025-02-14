package F2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Persona 
{
    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private char sexo;
    private double peso;
    private double altura;
	
    //////////////////////////////////////////////////////////////////////////////////////////////////
    //constructor por defecto
    public Persona() {
        
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
    
    //constructor COPIA
    public Persona(Persona persona) 
    {
        this.dni=persona.dni;
        this.nombre=persona.nombre;
        this.apellidos=persona.apellidos;
        this.fechaNacimiento=persona.fechaNacimiento;
        this.sexo=persona.sexo;
        this.peso=persona.peso;
        this.altura=persona.altura;  
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
        
        if(edad >= 18)
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

    public void setDni(String dni) {
        this.dni = dni;
    }

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