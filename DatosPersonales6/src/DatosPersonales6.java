import java.util.Scanner;

public class DatosPersonales6 extends Thread{
    private String nombre;
    private  int edad;
    private String escuela;
    private String grado;
    private String grupo;

    @Override
    public void run(){
        Obtnerdatos();
        mostrarDatos();
    }
    public void Obtnerdatos(){
        Scanner scanner = new Scanner(System.in);
        this.nombre =ObtenerNombre(scanner);
        this.edad =ObtenerEdad(scanner);

        this.escuela = ObtenerEscuela(scanner);
        this.grupo = ObtenerGrupo(scanner);
        this.grado =ObtenerGrado(scanner);

        scanner.close();
    }
    public String ObtenerNombre(Scanner scanner){
        System.out.print("\u001B[39m  ingresar nombre:");
        return scanner.nextLine();

    }

    public int ObtenerEdad(Scanner scanner){
        System.out.print("\033[0;44m] ingresar edad:");
        return Integer.parseInt(scanner.nextLine());

    }
    public String ObtenerEscuela(Scanner scanner) {
        System.out.print(" \033[0;44m] ingresar Escuela:");
        return scanner.nextLine();
    }
    public String  ObtenerGrupo(Scanner scanner){
        System.out.print(" \033[0;44m] ingresar Grupo:");
        return scanner.nextLine();

    }
    public String  ObtenerGrado(Scanner scanner){
        System.out.print("\033[0;44m] ingresar Grado:");
        return scanner.nextLine();

    }
    public void  mostrarDatos(){
        System.out.println("\u001B[32m  nombre:" + this.nombre);
        System.out.println("\033[0;36m] edad:" + this.edad);
        System.out.println("\033[0;36m] escuela:" + this.escuela);
        System.out.println("\033[0;36m] grupo:" + this.grupo);
        System.out.println("\033[0;36m] grado:" + this.grado);
    }


}

