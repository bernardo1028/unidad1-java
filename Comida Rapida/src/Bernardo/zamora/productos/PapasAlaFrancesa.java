package Bernardo.zamora.productos;

public class PapasAlaFrancesa extends Productos {
    public PapasAlaFrancesa(String tamanio) {
        setNombre("Papa a la Francesa");
        setTamanio(tamanio);
        setPrecio(calcularPrecio(tamanio));
    }

    public double calcularPrecio(String tamanio) {
        double precio = 0;

        if (tamanio.equals("chico")) {
            precio = 15;
        } else if (tamanio.equals("mediano")) {
            precio = 25;
        } else if (tamanio.equals("grande")) {
            precio = 35;
        }

        return precio;
    }
}
