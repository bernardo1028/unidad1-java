import java.util.Scanner;

public class PedirDatos {
    public  static  void main(String[] args){
        String nombre;
        int edad;
        String escuela;
        String grado;
        String grupo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nombre de usuario");
        nombre= scanner.nextLine();
        System.out.println("Nombre de usuario:"+ nombre);

        Scanner scanner1= new Scanner(System.in);
        System.out.println("ingrese su edad");
        edad= scanner1.nextInt();
        System.out.println("edad del usario:"+ edad);

        Scanner scanner2= new Scanner(System.in);
        System.out.println("ingrese su escuela");
        escuela= scanner2.nextLine();
        System.out.println("su escuela es:"+ escuela);

        Scanner scanner3= new Scanner(System.in);
        System.out.println("ingrese su grupo");
        grupo= scanner3.nextLine();
        System.out.println("su grupo es:"+ grupo);

        Scanner scanner4= new Scanner(System.in);
        System.out.println("ingrese su grado");
        grado= scanner4.nextLine();
        System.out.println("su grado es:"+ grado);

    }
}
