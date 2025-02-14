package E3;


public class Rectangulo 
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private char caracter;
      
    //constructor
    public Rectangulo() 
    {
        this.caracter = 'x';
    }
    
    //constructor
    public Rectangulo(int x1, int y1, int x2, int y2)
    {
        if(x1 > x2 || y1 > y2)
        {
            System.err.println("ERROR al instanciar el rectangulo");
        }
        else
        {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.caracter = 'x';
        }
    }
    
    public double Perimetro()
    {
        return (2 * (this.x2 - this.x1) + 2 * (this.y2 - this.y1));
    }
    
    public double Area()
    {
        return (this.x2 - this.x1) * (this.y2 - this.y1) / 2;
    }
    
    public void Dibujar()
    {
        for(int i = 0; i < (this.x2 - this.x1); i++)
        {
            System.out.print(caracter);
        }
        
        System.out.println("");
        
        for(int i = 0; i < ((this.y2 - this.y1) - 2); i++)
        {
            System.out.print(caracter);
            
            for(int j = 1; j < (this.x2 - this.x1) - 1; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println(caracter);
        }
        
        for(int i = 0; i < (this.x2 - this.x1); i++)
        {
            System.out.print(caracter);
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) 
    {
        if(x1 > this.x2)
        {
            System.out.println("ERROR X1 NO PUEDE SER MAYOR A X2");
        }
        else
        {
            this.x1 = x1;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) 
    {
        if(y1 > this.y2)
        {
            System.out.println("ERROR Y1 NO PUEDE SER MAYOR A Y2");
        }
        else
        {
            this.y1 = y1;
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) 
    {
        if(x2 < this.x1)
        {
            System.out.println("ERROR X1 NO PUEDE SER MAYOR A X2");
        }
        else
        {
            this.x2 = x2;
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if(y2 < this.y1)
        {
            System.out.println("ERROR Y2 NO PUEDE SER MENOR A Y1");
        }
        else
        {
            this.y2 = y2;
        }
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
}
