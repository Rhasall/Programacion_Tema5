
package D5;


public class Main 
{
    public static void main(String[] args) 
    {
        Fecha fec1;
        
       fec1 = new Fecha();
        
        
        fec1.setAny(1987);
        fec1.setMes(4);
        fec1.setDia(23);
        
        Fecha fechaNueva = fec1.DiaSiguiente();
        fechaNueva.MostrarFecha();
        
        Fecha fec2 = new Fecha();
        fec2.setAny(1987);
        fec2.setMes(2);
        fec2.setDia(28);
        
        fechaNueva = fec2.DiaSiguiente();
        fechaNueva.MostrarFecha();
		
        if(fec1.IgualA(fec2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("No son iguales");
        }
        
        if(fec1.MayorA(fec2))
        {
            System.out.println("Fec1 es mayor a Fec2");
        }
        else
        {
            System.out.println("Fec1 NO es mayor a Fec2");
        }
        
        if(fec1.MenorA(fec2))
        {
            System.out.println("Fec1 es menor a Fec2");
        }
        else
        {
            System.out.println("Fec1 NO es menor a Fec2");
        }
    }
    
}
