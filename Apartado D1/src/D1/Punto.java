package D1;

public class Punto 
{
    private int x;
    private int y;
    
    public void Imprimir()
    {
        System.out.println("(" + this.getX() + "," + this.getY() + ")");
    }
    
    public void Desplaza(int x, int y)
    {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }
    
    public double Distancia(Punto p)
    {
        double resultado = Math.sqrt(Math.pow((p.getX() - this.getX()), 2) + Math.pow((p.getY() - this.getY()), 2));      
        return resultado;
    }
 
    public int getX() 
    {
        return x;
    }
  
    public void setX(int x) 
    {
        this.x = x;
    }

    public int getY() 
    {
        return y;
    }
    
    public void setY(int y) 
    {
        this.y = y;
    }
}