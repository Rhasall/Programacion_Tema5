package com.miTienda.rrhh;
public class Empleado
{
    static double pagoPorHoraExtra = 10;

    String nif;
    String nombre;
    String apellidos;
    double sueldoBase;
    int horasExtras;
    double tipoIRPF;
    boolean casado;
    int numeroHijos;

    //calcular el importe de las horas extra
    double calcularImporteHorasExtras() 
    {
        return horasExtras * pagoPorHoraExtra;
    }

    //calcular el sueldo bruto
    double calcularSueldoBruto()
    {        
        return sueldoBase + calcularImporteHorasExtras();
    }
    
    //calcular el importe de las retencion por IRPF 
    double calcularRetencionIrpf() 
    {
        double tipo = tipoIRPF;
        if (casado)
        {
            tipo = tipo - 2; //2 puntos menos si está casado 
        }

        tipo = tipo - numeroHijos; //un punto menos por cada hijo

        if (tipo < 0)
        {
            tipo = 0; 
        }

        return calcularSueldoBruto () * tipo / 100;
    } 

    //calcular el importe liquido a cobrar
    double calcularSueldo ()
    {        
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }
    
    public static void main(String[] args) 
    {
        Empleado empleado = new Empleado();

        empleado.nif = "48440909D";
        empleado.horasExtras = 3;
        empleado.sueldoBase = 1500;
        empleado.tipoIRPF = 4;
        empleado.numeroHijos = 2;

        double irpf = empleado.calcularRetencionIrpf(); 
        double sueldo = empleado.calcularSueldo();

        System.out.println("Retención IRPF: " + irpf); 
        System.out.println("Sueldo:" + sueldo);

    } 
}