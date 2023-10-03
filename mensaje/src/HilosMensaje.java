public class HilosMensaje  extends Thread{

    @Override
    public void run(){
        mensaje();
    }
    public void mensaje(){
        System.out.println("hola");
    }

}
