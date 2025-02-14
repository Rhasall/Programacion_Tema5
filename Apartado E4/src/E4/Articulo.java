package E4;

public class Articulo 
{
    private double precio;
    private String nombre;
    private int iva;
    private int stock;
    
    public Articulo() 
    {
        this.iva = 21;
    }
    
    //constructor sobrecargado
    public Articulo(double precio, String nombre, int iva, int stock)
    {
        if(precio <= 0)
        {
            System.out.println("ERROR EN EL PRECIO");
        }
        else
        {
            this.precio = precio;
        }
        
        if(nombre == null || nombre.equals(""))
        {
           System.out.println("ERROR EN EL NOMBRE");
        }
        else
        {
            this.nombre = nombre;
        }
        
        if(iva != 21)
        {
            System.out.println("ERROR EN EL IVA");
        }
        else
        {
            this.iva = iva;
        }
        
        if(stock < 0)
        {
            System.out.println("ERROR EN EL STOCK");
        }
        else
        {
            this.stock = stock;
        }
    }
    
    public void Imprimir()
    {
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("IVA: " + this.getIva());
        System.out.println("Stock: " + this.getStock());
    }
    
    public double GetPVP()
    {
        return this.getPrecio() * (1 + (double)(this.getIva()) / 100);
    }
    
    public double GetPVPDescuento(double descuento)
    {
        return this.getPrecio() * (1 + (double)(this.getIva()) / 100) - descuento;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        if(precio <= 0)
        {
            System.out.println("ERROR Precio Meno o Igual a CERO");
        }
        else
        {
            this.precio = precio;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        if(nombre == null || nombre.equals(""))
        {
            System.out.println("ERROR NOmbre VACIO");
        }
        else
        {
            this.nombre = nombre;
        }
    }

    public int getIva() {
        return this.iva;
    }

    public void setIva(int iva) 
    {
        if(iva != 21)
        {
            System.err.println("ERROR IVA Distinto a 21");
        }
        else
        {
            this.iva = iva;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) 
    {
        if(stock < 0)
        {
            System.out.println("STOCK Inferior a CERO");
        }
        else
        {
            this.stock = stock;
        }
    }
}
