package D4;

public class Articulo 
{
    private double precio;
    private String nombre;
    private int iva = 21;
    private int stock;
    
    
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

    public String getNombre() 
    {
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

    public int getIva() 
    {
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

    public int getStock() 
    {
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