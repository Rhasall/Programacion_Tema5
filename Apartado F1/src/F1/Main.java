
package F1;


public class Main 
{
    public static void main(String[] args) 
    {
        Punto p1 = new Punto();
        
        p1=null;
        
	Punto p2 = new Punto();

	Punto p3 = new Punto(10, 12);
                
        //Copio objeto "p3" en objeto "copia"
        Punto copia = new Punto(p3);
      

	p2.setX(10);
	p2.setY(10);

	System.out.println("Punto 1: " + p1.getX() + " " + p1.getY() + " Suma: " + (p1.getX() + p1.getY()));
	System.out.println("Punto 2: " + p2.getX() + " " + p2.getY());
	System.out.println("Punto 3: " + p3.getX() + " " + p3.getY());
        
        //IMPRIMO EL OBJETO COPIADO
        System.out.println("Punto copia: " + copia.getX() + " " + copia.getY());
	
	System.out.println("Imprimir p1: ");
	p1.Imprimir();
	p1.Desplaza(3, 5);
	System.out.println("Imprimir nuevo p1: ");
	p1.Imprimir();
	
	System.out.println("Distancia entre p1 y p3: "  + p1.Distancia(p3));
    }   
}
