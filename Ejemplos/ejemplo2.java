package com.miTienda.rrhh;

public class Ejemplo 
{
    public static void main(String[] args) 
    {
        Empleado empleado = new Empleado();

        empleado.nif = "48440909D";
        empleado.horasExtras = 3;
        empleado.sueldoBase = 1500;
        empleado.tipoIRPF = 4;
        empleado.numeroHijos = 2;

        double irpf empleado.calcularRetencionIrpf(); 
        double sueldo = empleado.calcularSueldo ();

        System.out.println("Retención IRPF: " + irpf); 
        System.out.println("Sueldo:" + sueldo);
    } 
}