public class Cronometro extends Thread {
    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;
    private boolean running = false;
    @Override
    public void run() {
        running = true;
        while (running) {
            actualizarSegundos();
            actualizarMinutos();
            actualizarHoras();
            imprimir();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void iniciar() {
        if (!running) {
            start();
        }
    }

    public void detener() {
        running = false;
    }

    private void imprimir() {
        System.out.print("\r" + String.format("%02d:%02d:%02d", horas, minutos, segundos));
    }

    private void actualizarSegundos() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
        }
    }

    private void actualizarMinutos() {
        if (segundos == 0) {
            minutos++;
            if (minutos == 60) {
                minutos = 0;
            }
        }
    }

    private void actualizarHoras() {
        if (minutos == 0 && segundos == 0) {
            horas++;
            if (horas == 24) {
                horas = 0;
            }
        }
    }



}




