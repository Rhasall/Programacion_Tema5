
package E4;


public class Main 
{
    public static void main(String[] args) 
    {
        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo(34, "Jamon", 21, 450);

        articulo1.setPrecio(18.5);
        articulo1.setNombre("Queso");
        articulo1.setStock(10);

        articulo1.Imprimir();
        System.out.println();
        articulo2.Imprimir();
        
        System.out.println("Precio PVP de arti­culo 1: " + articulo1.GetPVP());
        System.out.println("Precio PVP con descuento de arti­culo 2: " + articulo2.GetPVPDescuento(3));
		
        articulo1.setIva(25);
    }
}
