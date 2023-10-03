package Bernardo.zamora.productos;

public class Pizza extends Productos {

    public Pizza(String tamanio) {
        setNombre("Pizza");
        setTamanio(tamanio);
        setPrecio(calcularPrecio(tamanio));
    }

    public double calcularPrecio(String tamanio) {
        double precio = 0;

        if (tamanio.equals("chico")) {
            precio = 60;
        } else if (tamanio.equals("mediano")) {
            precio = 90;
        } else if (tamanio.equals("grande")) {
            precio = 120;
        }

        return precio;
    }
}
