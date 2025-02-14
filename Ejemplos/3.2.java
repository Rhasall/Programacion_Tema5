public class Empleado 
{
    String nombre; //Atributo que almacena el nombre
    int edad;
    String apellido1;
    String apellido2;
    String NIF;
    double sueldoBase;
    
    // Método para calcular el sueldo teniendo en cuenta las horas extras y el precio por hora
    double calculaSueldo(int horasExtra, double precioHora)
    {
        double sueldo = sueldoBase;
        sueldo = sueldo + horasExtra * precioHora;
        return sueldo;
    }
}