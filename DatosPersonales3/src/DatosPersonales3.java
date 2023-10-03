import java.util.Scanner;

public class DatosPersonales3 {
    public  static  void main(String[] args){
        String nombre;
        int edad;
        String escuela;
        String grado;
        String grupo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("\033[0;31m] nombre de usuario");
        nombre= scanner.nextLine();
        System.out.println("\033[0;33m]Nombre de usuario:"+ nombre);

        Scanner scanner1= new Scanner(System.in);
        System.out.println("\033[0;41m]ingrese su edad");
        edad= scanner1.nextInt();
        System.out.println("\033[1;30m]edad del usario:"+ edad);

        Scanner scanner2= new Scanner(System.in);
        System.out.println("\033[0;35m]ingrese su escuela");
        escuela= scanner2.nextLine();
        System.out.println("\033[1;36m]su escuela es:"+ escuela);

        Scanner scanner3= new Scanner(System.in);
        System.out.println("\033[0;40m]ingrese su grupo");
        grupo= scanner3.nextLine();
        System.out.println("\033[0;37m]su grupo es:"+ grupo);

        Scanner scanner4= new Scanner(System.in);
        System.out.println("\033[0;35m]ingrese su grado");
        grado= scanner4.nextLine();
        System.out.println("\033[0;45m]su grado es:"+ grado);

    }
}
