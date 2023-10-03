public class Inicio {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        cronometro.iniciar();


        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        cronometro.detener();
    }

}
