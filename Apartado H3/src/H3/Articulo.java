package H3;

public class Articulo 
{
    private double precio;
    private String nombre;
    private int iva;
    private int stock;
    
    // Declaración de tipos de IVA como variables estáticas
    private static final int IVA_GENERAL = 21;
    private static final int IVA_REDUCIDO = 10;
    private static final int IVA_SUPERREDUCIDO = 4;

    public Articulo() 
    {
        this.iva = IVA_GENERAL;  // Inicializamos con IVA general por defecto
    }
    
    //CONSTRUCTOR COPIA
    public Articulo(Articulo articulo) 
    {
        this.precio = articulo.precio;
        this.nombre = articulo.nombre;
        this.iva = articulo.iva;
        this.stock = articulo.stock;
    }
    
    //constructor sobrecargado
    public Articulo(double precio, String nombre, int iva, int stock)
    {
        this();
        ////////////////////////////////////////////////////////////////////////////////////////////
        // Validamos que el tipo de IVA proporcionado sea uno de los valores permitidos
        if (iva == IVA_GENERAL || iva == IVA_REDUCIDO || iva == IVA_SUPERREDUCIDO) 
        {
            this.iva = iva;          
        }
        else
        {
            System.err.println("ERROR en constructor sobrecargado EN EL IVA");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////
        if(precio <= 0)
        {
            System.err.println("ERROR EN EL PRECIO");
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
        if(stock < 0)
        {
            System.out.println("ERROR EN EL STOCK");
        }
        else
        {
            this.stock = stock;
        }
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Los métodos estáticos no tienen acceso a las instancias de la clase y no pueden utilizar variables de instancia
    //Son independientes de cualquier objeto específico
    
    // Métodos para obtener los tipos de IVA estáticos
    public static int getIvaGeneral() {
        return IVA_GENERAL;
    }
    public static int getIvaReducido() {
        return IVA_REDUCIDO;
    }

    public static int getIvaSuperReducido() {
        return IVA_SUPERREDUCIDO;
    }

    public int getIva() {
        return this.iva;
    }
    //////////////////////////////////////////////////////////////////////////////
    
    public void setTipoIva(int iva) 
    {
        // Validamos que el tipo de IVA proporcionado sea uno de los valores permitidos
        if (iva == IVA_GENERAL || iva == IVA_REDUCIDO || iva == IVA_SUPERREDUCIDO) 
        {
            this.iva = iva;
        } 
        else 
        {
            System.err.println("ERROR: Tipo de IVA no válido");
        }
    }
    //////////////////////////////////////////////////////////////////////////////
    
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
