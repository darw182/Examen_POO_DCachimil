public class Pasajero {
    private String nombre;
    private String asiento;
    private int cantidadMaletas;

    public Pasajero() {
    }

    public Pasajero(String nombre, String asiento, int cantidadMaletas) {
        this.nombre = nombre;
        this.asiento = asiento;
        this.cantidadMaletas = cantidadMaletas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getCantidadMaletas() {
        return cantidadMaletas;
    }

    public void setCantidadMaletas(int cantidadMaletas) {
        this.cantidadMaletas = cantidadMaletas;
    }
}
