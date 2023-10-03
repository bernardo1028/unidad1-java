package Bernardo.zamora.productos;

public class Refresco extends Productos {

    public Refresco(String tamanio) {
        setNombre("Refresco");
        setTamanio(tamanio);
        setPrecio(calcularPrecio(tamanio));
    }

    public double calcularPrecio(String tamanio) {
        double precio = 0;

        if (tamanio.equals("chico")) {
            precio = 20;
        } else if (tamanio.equals("mediano")) {
            precio = 25;
        } else if (tamanio.equals("grande")) {
            precio = 30;
        }

        return precio;
    }
}
