package H4;


public class Trabajador 
{
    //tipo enumerado que define tres valores posibles: Novato, Maduro y Experto
    public static enum ANTIGUEDAD {Novato, Maduro, Experto};
    
    //tipo enumerado que define tres valores posibles: Empleado, Encargado y Directivo
    public static enum CATEGORIA {Empleado, Encargado, Directivo};
    
    private String nombre;
    private int edad;
    
    //variable de tipo CATEGORIA que indica la categoría laboral del individuo (Empleado, Encargado, Directivo).
    //la variable categoria solo puede tomar los valores Empleado, Encargado o Directivo, ya que es una variable de tipo CATEGORIA
    private CATEGORIA categoria;
    
    //atributo de tipo ANTIGUEDAD que indica la antigüedad del individuo en la empresa (Novato, Maduro, Experto).
    private ANTIGUEDAD antiguedad;
    
    private Trabajador() {}
    
    public Trabajador(String nombre, int edad) throws Exception
    {
        if(ComprobarEdad(edad) && ComprobarNombre(nombre))
        {
           this.nombre = nombre;
           this.edad = edad;
        }
        else
        {
            throw new Exception("No se ha podido crear el trabajador");
        }            
    }
    
    public Trabajador(String nombre, int edad, CATEGORIA categoria, ANTIGUEDAD antiguedad) throws Exception
    {
        this(nombre, edad);       
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }
    
    public Trabajador(Trabajador copia)
    {
        this.nombre = copia.nombre;
        this.edad = copia.edad;
        this.antiguedad = copia.antiguedad;
        this.categoria = copia.categoria;
    }
    
    public double CalcularSueldo() throws Exception
    {
        double resultado = 0;
        int antiguedad = CalcularAntiguedad(this.antiguedad);
        int categoria = CalcularCategoria(this.categoria);
        
        resultado = 607 + (607 * categoria / 100) + antiguedad;
        
        return resultado;
    }
    
     private int CalcularAntiguedad(ANTIGUEDAD antiguedad) throws Exception
    {
        int resultado;
        
        switch(antiguedad) {
            case Novato:
                resultado = 150;
                break;
            case Maduro:
                resultado = 300;
                break;
            case Experto:
                resultado = 600;
                break;
            default:
                throw new Exception("Error al calcular la antigÃ¼edad");
        }
        
        return resultado;
    }
    
    private int CalcularCategoria(CATEGORIA categoria) throws Exception
    {
        int resultado;
        
        switch (categoria) 
        {
            case Directivo:
                resultado = 15;
                break;
            case Encargado:
                resultado = 35;
                break;
            case Empleado:
                resultado = 60;
                break;
            default:
                throw new Exception("Error al calcular la categori­a");
        }
        
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }
  
    public void setNombre(String nombre) throws Exception {
        if(ComprobarNombre(nombre))
        {
           this.nombre = nombre;
        }
        else
        {
            throw new Exception("No se ha podido asignar el nombre");
        }
    }
 
    public int getEdad() {
        return edad;
    }
   
    public void setEdad(int edad) throws Exception 
    {
        if(ComprobarEdad(edad))
        {
           this.edad = edad;
        }
        else
        {
            throw new Exception("No se ha podido asignar la edad");
        }
    }

    public CATEGORIA getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(CATEGORIA categoria) throws Exception 
    {
        this.categoria = categoria;
    }
 
    public ANTIGUEDAD getAntiguedad() 
    {
        return antiguedad;
    }
  
    public void setAntiguedad(ANTIGUEDAD antiguedad) throws Exception 
    {
        this.antiguedad = antiguedad;
    }
    
    private boolean ComprobarNombre(String nombre)
    {
        boolean valido = true;
        
        if(nombre == null || nombre.equals(""))
        {
            valido = false;
        }
        
        return valido;
    }
    
    private boolean ComprobarEdad(int edad)
    {
        boolean valido = true;
        
        if(edad < 18)
        {
            valido = false;
        }
        
        return valido;
    }
    
   
}