public class Articulo 
{
    private String cod;   
    private String titulo;   
    private String formato;   
    private float precio_alquiler;   
    private int stock;  

    public String getCod () 
    { 
        return cod;    
    }   

    public void setCod(String cod) 
    {
         this.cod = cod; 
    }

    public String getTitulo () 
    { 
        return titulo; 
    }
    
    public void setTitulo (String titulo) 
    { 
        this.titulo = titulo; 
    }
    
    public String getFormato () 
    { 
        return formato;
    }
    
    public void setFormato (String formato) 
    { 
        this.formato = formato; 
    }
    
    public float getPrecio_alquiler() 
    { 
        return precio_alquiler; 
    }

    public void setPrecio_alquiler (float precio_alquiler) 
    {
        this.precio_alquiler = precio_alquiler; 
    }
        
    public int getstock() 
    { 
        return stock; 
    }
        
    public void setStock(int stock) 
    { 
        this.stock = stock;       
    }
        
    public void MostrarArticulo ()
    {   
        System.out.println("Código: " + this.cod + "\n" + 
                           "Título:" + this.titulo + "\n" + 
                           "Formato: " + this.formato + "\n" +    
                           "Precio Alquiler:" + this.precio_alquiler + "\n");
    }
}