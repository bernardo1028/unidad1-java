import java.util.Scanner;

public class Metronomo extends Thread {
    private final int bpm = 60;
    private int velocidad;
    private boolean running = true;



    @Override
    public void run() {
        ingresarVelocidad();
        while (running) {
            try {
                int tiempoEspera = calcularTiempoEspera();
                System.out.println("Tick - Tiempo de espera en milisegundos: " + tiempoEspera);
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void ingresarVelocidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la velocidad : ");
        velocidad = scanner.nextInt();
        scanner.close();
    }

    private int calcularTiempoEspera() {
        return  velocidad/bpm;
    }

    public void detener() {
        running = false;
    }
}


