package Bernardo.zamora.personas;

import Bernardo.zamora.productos.Productos;

public class Empleados extends Personas {
    private String puesto;
    private double sueldo;
    private String turno;

    public void registrarOrden(Clientes cliente, Productos producto) {
        System.out.println(getNombre() + " ha registrado la orden de " + cliente.getNombre() + ": " + producto.getNombre());
        cliente.ordenar(producto);
    }

    public void cobrar(Clientes cliente) {
        double total = cliente.pagar();
        System.out.println(getNombre() + " ha cobrado $" + total + " a " + cliente.getNombre());
    }

    public void entregarOrden(Clientes cliente) {
        System.out.println(getNombre() + " ha entregado la orden a " + cliente.getNombre());
        cliente.recibir();
    }}
