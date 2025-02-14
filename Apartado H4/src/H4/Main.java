package H4;

public class Main 
{
     
    public static void main(String[] args) throws Exception 
    {
        Trabajador tr1 = new Trabajador("Luis", 20, Trabajador.CATEGORIA.Directivo, Trabajador.ANTIGUEDAD.Experto);
        
        System.out.println("El sueldo es: " + tr1.CalcularSueldo());
    } 
    
}
