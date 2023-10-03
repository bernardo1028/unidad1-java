package Bernardo.zamora.productos;

public class HotDog extends Productos {

    public HotDog(String tamanio) {
        setNombre("Hot Dog");
        setTamanio(tamanio);
        setPrecio(calcularPrecio(tamanio));
    }

    public double calcularPrecio(String tamanio) {
        double precio = 0;

        if (tamanio.equals("chico")) {
            precio = 20;
        } else if (tamanio.equals("mediano")) {
            precio = 30;
        } else if (tamanio.equals("grande")) {
            precio = 45;
        }

        return precio;
    }
}