Public class Lienzo
{
    public void pintar (int valor)
    {
        System.out.println("Pintar n�mero entero: " + valor);
    }

    public void pintar (double valor)
    {
        System.out.println("Pintar n�mero double: " + valor);
    }

    public void pintar (String valor)
    {
        System.out.println("Pintar cadena String: " + valor);
    }
    public void pintar (int valorEntero, String valorString)
    {
        System.out.println("Pintar numero entero: " + valorEntero + 
                            "\n junto a cadena String:" + valorString);
    }
}