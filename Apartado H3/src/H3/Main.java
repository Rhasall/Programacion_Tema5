package H3;

public class Main 
{
    public static void main(String[] args) 
    {
        //Al tener un método "estático" getIvaGeneral() en la clase Articulo, 
        //se puede llamar directamente desde el  main sin necesidad de crear una instancia (objeto) de la clase.
        //Llamadas a los métodos estáticos desde el main:
        int ivaGeneral = Articulo.getIvaGeneral();
        int ivaReducido = Articulo.getIvaReducido();
        int ivaSuperReducido = Articulo.getIvaSuperReducido();
        
        //En el caso de que el atributo "static" fuera "public" se podría acceder directamente a su valor desde fuera de la clase
        //int ivaGeneral = Articulo.IVA_GENERAL;
               
        System.out.println("Iva general: "+ivaGeneral+" Iva reducido: "+ ivaReducido+" Iva super reducido: " + ivaSuperReducido);
        
        //Creo objeto articulo1
        Articulo articulo1 = new Articulo();
        
        //Muestro valores por defecto
        System.out.println("\n"+"Valores por defecto de articulo1: ");
        articulo1.Imprimir();
        
        //Modifico sus valores
        articulo1.setPrecio(18.5);
        articulo1.setNombre("Queso");
        articulo1.setStock(10);
        articulo1.setTipoIva(25);//Aqui lanzara mensaje error y no modificará el iva
        
        //Muestro valores modificados
        System.out.println("\n" + "Valores modificados de articulo1: ");
        articulo1.Imprimir();
        System.out.println();
        
        //Creo objeto articulo2
        Articulo articulo2 = new Articulo(34, "Jamon", 99, 450);
        System.out.println("Valores de articulo2: ");
        articulo2.Imprimir();
        System.out.println();
        
        
        Articulo copia2 = new Articulo(articulo2);
        copia2.setTipoIva(4);
        
        //Muestro valores por defecto
        System.out.println("\n" +"Valores por defecto de copia2: ");
        copia2.Imprimir();
        System.out.println();

        
        
        System.out.println("Precio PVP de arti­culo 1: " + articulo1.GetPVP());
        System.out.println("Precio PVP con descuento de arti­culo 2: " + articulo2.GetPVPDescuento(3));
        System.out.println("Precio PVP con descuento de arti­culo copia2: " + copia2.GetPVPDescuento(3));       
    }
}
