package caso_practico;

public class Trabajador {
    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (ComprobarNombre(nombre)==false){
            System.out.println("nombre no valido");
        }
        else {
        this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (ComprobarEdad(edad)==false){
            System.out.println("edad no valida");
        }
        else{
        this.edad = edad;
        }
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        if (ComprobarCategoria(categoria)==false){
            System.out.println("categoria no valida");
        }
        else{
        this.categoria = categoria;
        }
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        
        if (ComprobarAntiguedad(antiguedad)==false){
            System.out.println("antiguedad no valida");
        }
        else{
        this.antiguedad = antiguedad;
        }
    }

    public Trabajador()
    {
        
    }
    public Trabajador(String nombre, int edad)throws Exception
    {
        if(edad<18||nombre.equals("")||nombre==null)
        {
        throw new Exception("datos no validos, nombre "+nombre +" o la edad "+edad);
        }
        
        else
        {
        this.nombre=nombre;
        this.edad =edad;
        }
    }
    public Trabajador(String nombre, int edad,int categoria,int antiguedad)throws Exception
     {
        if (antiguedad<0||antiguedad>2 || categoria<0||categoria>2)
        {
        throw new Exception("cagaste en los datos");
        }
        else
        {
        this.nombre=nombre;
        this.edad =edad;
        this.categoria=categoria;
        this.antiguedad=antiguedad;
        }
     
     }
    public Trabajador(Trabajador copia)
    {
        this.nombre=copia.nombre;
        this.edad=copia.edad;
        this.categoria=copia.categoria;
        this.antiguedad=copia.antiguedad;
    
    }  
    private boolean ComprobarCategoria(int categoria)
    {
        if (categoria ==2||categoria==1||categoria==0){
        return true;
        }
        else {return false;}
    }
     private boolean ComprobarAntiguedad(int antiguedad)
    {
        if (antiguedad==2||antiguedad==1||antiguedad==0){
        return true;
        }
        else {return false;}
    }
    private boolean ComprobarNombre(String nombre)
    {
        if (nombre==null||nombre.equals("")){
        return false;
        }
        else {return true;}
    }
    private boolean ComprobarEdad(int edad)
    {
        if (edad<18){
        return false;
        }
        else {return true;}
    }
    public float CalcularSueldo(){
        float sueldoBase=607;
        int categoria=getCategoria();
        int antiguedad=getAntiguedad();
        
        if (categoria==0){categoria=(607*15)/100;}
        if (categoria==1){categoria=(607*35)/100;}
        if (categoria==2){categoria=(607*60)/100;}
        
        if (antiguedad==0){antiguedad=150;}
        if (antiguedad==1){antiguedad=300;}
        if (antiguedad==2){antiguedad=600;}
        
        float totalsueldo=sueldoBase+antiguedad+categoria;
        
        return totalsueldo;
    }
}
