
package D1;


public class Main 
{
    public static void main(String[] args) 
    {
        Punto p1 = null;
	p1 = new Punto();

	Punto p2 = new Punto();

	Punto p3 = new Punto();

	p1.setX(5);
	p1.setY(0);

	p2.setX(10);
	p2.setY(10);

	p3.setX(-3);
	p3.setY(7);

	System.out.println("Punto 1: " + p1.getX() + " " + p1.getY() + " Suma: " + (p1.getX() + p1.getY()));
	System.out.println("Punto 2: " + p2.getX() + " " + p2.getY());
	System.out.println("Punto 3: " + p3.getX() + " " + p3.getY());
	
	System.out.println("Imprimir p1: ");
	p1.Imprimir();
	p1.Desplaza(3, 5);
	System.out.println("Imprimir nuevo p1: ");
	p1.Imprimir();
	
	System.out.println("Distancia entre p1 y p3: "  + p1.Distancia(p3));
    }
}
