package G1;

public class Main 
{
     public static void main(String[] args) 
    {
        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo(5, 15, 20, 23);
        
       
        //Rectangulo copia
        Rectangulo copia = new Rectangulo(rec2);
        
        rec1.setX1(10);

        rec2.Dibujar();
        
        System.out.println("\n\nEl peri­metro de copia es: " + copia.Perimetro());
        System.out.println("El Area de copia es: " + copia.Area() + "\n");
        
        copia.Dibujar();
        
        System.out.println("");
        
        copia = null;
        rec2 = null;
        
       
        System.gc();
    }
}
