
package D5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Fecha 
{
    private int any;
    private int mes;
    private int dia;
    
    public Fecha DiaSiguiente()
    {
        //Creamos una variable Localdate con los atributos de la clase.
        LocalDate date = LocalDate.of(any, getMes(), this.getDia());
        //Sumamos 1 dÃ­a, y guardamos la nueva fecha en la variable date.
        date = date.plusDays(1);
        
        Fecha diaSiguiente = new Fecha();
        
        diaSiguiente.setAny(date.getYear());
        diaSiguiente.setMes(date.getMonthValue());
        diaSiguiente.setDia(date.getDayOfMonth());
        
        return diaSiguiente;
    }
    
    public void MostrarFecha()
    {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate fecha = LocalDate.of(this.getAny(), this.getMes(), this.getDia());
        
        System.err.println("La fecha es " + fecha.format(formatoFecha));
    }
    
    public boolean MayorA(Fecha f)
    {
        boolean mayor = false;
        
        LocalDate thisDate = LocalDate.of(this.getAny(), this.getMes(), this.getDia());
        LocalDate fDate = LocalDate.of(f.getAny(), f.getMes(), f.getDia());
        
        if(thisDate.isAfter(fDate))
        {
            mayor = true;
        }
        
        return mayor;
    }
    
    public boolean MenorA(Fecha f)
    {
        boolean menor = false;
        
        LocalDate thisDate = LocalDate.of(this.getAny(), this.getMes(), this.getDia());
        LocalDate fDate = LocalDate.of(f.getAny(), f.getMes(), f.getDia());
        
        if(thisDate.isBefore(fDate))
        {
            menor = true;
        }
        
        return menor;
    }
    
    public boolean IgualA(Fecha f)
    {
        boolean igual = false;
        
        LocalDate thisDate = LocalDate.of(this.getAny(), this.getMes(), this.getDia());
        LocalDate fDate = LocalDate.of(f.getAny(), f.getMes(), f.getDia());
        
        if(thisDate.isEqual(fDate))
        {
            igual = true;
        }
        
        return igual;
    }

    public int getAny() 
    {
        return any;
    }

    public void setAny(int any) 
    {
        this.any = any;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
