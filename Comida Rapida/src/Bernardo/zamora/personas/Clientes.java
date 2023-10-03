package Bernardo.zamora.personas;

import Bernardo.zamora.productos.Productos;

import java.util.ArrayList;
import java.util.List;

public class Clientes extends Personas {
    private int numeroPedido;
    private List<Productos> orden = new ArrayList<>();

    public void ordenar(Productos producto) {
        System.out.println(getNombre() + " está ordenando " + producto.getNombre());
        orden.add(producto);
    }

    public double pagar() {
        double total = calcularTotal();
        System.out.println(getNombre() + " está pagando $" + total);
        return total;
    }

    public void recibir() {
        System.out.println(getNombre() + " ha recibido su orden.");
        orden.clear();
    }

    private double calcularTotal() {
        double total = 0.0;
        for (Productos producto : orden) {
            total += producto.getPrecio();
        }
        return total;
    }
}




