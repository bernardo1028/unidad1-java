package Bernardo.zamora.productos;

public class Hambuergesa extends Productos {


        public Hambuergesa (String tamanio) {
            setNombre("Hamburguesa");
            setTamanio(tamanio);
            setPrecio(calcularPrecio(tamanio));
        }

        public double calcularPrecio(String tamanio) {
            double precio = 0;

            if (tamanio.equals("chico")) {
                precio = 30;
            } else if (tamanio.equals("mediano")) {
                precio = 35;
            } else if (tamanio.equals("grande")) {
                precio = 40;
            }

            return precio;
        }
    }


