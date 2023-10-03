public class DatosPersonales5 extends Thread {
    private String nombre="ber";
    private  int edad =23;
    private String escuela="univer";
    private String grado="septimo";
    private String grupo=" 1623is";

    @Override
    public void run(){
        nombre();
        edad();
        escuela();
        grado();
        grupo();
    }
    public void nombre(){
        System.out.println("mi nombre es:" + nombre);
    }

    public void edad(){
        System.out.println("mi edad es:" + edad);
    }
    public void escuela(){
        System.out.println("mi escuela es:" + escuela);

    }
    public void grado(){

        System.out.println("mi grado es:" + grado);
    }
    
    public void grupo(){
        System.out.println("mi grupo es:" + grupo);
    }

}
