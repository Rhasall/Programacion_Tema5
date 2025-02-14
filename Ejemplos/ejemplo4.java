package com.miTienda.rrhh;

public class Empleado
{   
    private static double pagoPorHoraExtra = 10;
    private String nif;
    private String nombre;
    private String apellidos;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private boolean casado;
    private int numeroHijos;
    
    //calcular el importe de las horas extra
    public double calcularImporteHorasExtras () 
    {       
        return horasExtras * pagoPorHoraExtra;
    }
  
    //calcular el sueldo bruto
    public double calcularSueldoBruto () 
    {
        return sueldoBase + calcularImporteHorasExtras();
    }

    //calcular el importe de las retencion por IRPF 
    public double calcularRetencionIRPF() 
    {
        double tipo = tipoIRPF;

        if(casado)
        {
            tipo = tipo - 2; //2 puntos menos si está casado
        }

        tipo = tipo - numeroHijos; //un punto menos por cada hijo

        if (tipo < 0)
        {
            tipo = 0; 
        }
        return calcularSueldoBruto() * tipo / 100;
    }

    //calcular el importe liquido a cobrar 
    public double calcularsueldo()
    {
        return calcularSueldoBruto() - calcularRetencionIRPF();
    }
}