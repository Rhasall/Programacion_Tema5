
package E3;

public class Main 
{
     public static void main(String[] args) 
    {
        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo(13, 15, 20, 23);
        
        rec1.setX1(10);

        rec1.Dibujar();
        
        System.out.println("\n\nEl perÃ­metro es: " + rec2.Perimetro());
        System.out.println("El Ã¡rea es: " + rec2.Area() + "\n");
        
        rec2.Dibujar();
    }
}
