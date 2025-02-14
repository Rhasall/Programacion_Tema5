package H2;

public class Main 
{
    public static void main(String[] args) throws Exception
    {
        //Rectangulo rec1 = new Rectangulo();
               
        try 
        {
                                            //x1  x2  y1  y2
             Rectangulo rec2 = new Rectangulo(21, 40, 30, 50);

             rec2.Dibujar();

             System.out.println("\n\nEl peri­metro es: " + rec2.Perimetro());
             System.out.println("El Area es: " + rec2.Area() + "\n");

             rec2.setX1(41);
             
             
             rec2.Dibujar();
        } 
        catch (Exception e)           
        {
            System.err.println(e.getMessage());      
        }       
    }
}
