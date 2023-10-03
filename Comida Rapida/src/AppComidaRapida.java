import Bernardo.zamora.personas.Clientes;
import Bernardo.zamora.personas.Empleados;
import Bernardo.zamora.productos.Agua;
import Bernardo.zamora.productos.HotDog;
import Bernardo.zamora.productos.Productos;
import Bernardo.zamora.productos.Refresco;

public class AppComidaRapida {
    public static void main(String[] args) {

// Crear productos
        Productos aguaChico = new Agua("chico");
        Productos refrescoGrande = new Refresco("grande");
        Productos hamburguesaMediano = new Hamburguesa("mediano");
        Productos hotDogChico = new HotDog("chico");
        Productos hotDoggrande = new HotDog("chico");


        Clientes cliente1 = new Clientes();
        cliente1.setNombre("Cliente 1");

        Empleados empleado1 = new Empleados();
        empleado1.setNombre("Empleado 1");


        cliente1.ordenar(aguaChico);
        cliente1.ordenar(refrescoGrande);

        // Empleado registra y entrega el pedido
        empleado1.registrarOrden(cliente1, hamburguesaMediano);
        empleado1.entregarOrden(cliente1);

        // Cliente agrega más productos al pedido
        cliente1.ordenar(hotDoggrande);

        // Empleado cobra y entrega el pedido final
        empleado1.cobrar(cliente1);
        empleado1.entregarOrden(cliente1);
    }

    }


