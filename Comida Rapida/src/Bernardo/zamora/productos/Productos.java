package Bernardo.zamora.productos;

public abstract class Productos {
        private String nombre;
        private double precio;
        private String tamanio;

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public double getPrecio() {
                return precio;
        }

        public void setPrecio(double precio) {
                this.precio = precio;
        }

        public String getTamanio() {
                return tamanio;
        }

        public void setTamanio(String tamanio) {
                this.tamanio = tamanio;
        }
}