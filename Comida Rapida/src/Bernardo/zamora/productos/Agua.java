package Bernardo.zamora.productos;


public class Agua extends Productos {

    public Agua(String tamanio) {
        setNombre("Agua");
        setTamanio(tamanio);
        setPrecio(calcularPrecio(tamanio));
    }

    public double calcularPrecio(String tamanio) {
        double precio = 8;

        if (tamanio.equals("chico")) {
            precio = 18;
        } else if (tamanio.equals("mediano")) {
            precio = 15;
        } else if (tamanio.equals("grande")) {
            precio = 20;
        }

        return precio;
    }
}


