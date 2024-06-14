public class Ruta extends Pasajero{
    private String origen;
    private String destino;
    private double costo;

    public Ruta() {
    }

    public Ruta(String origen, String destino, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
    }

    public Ruta(String nombre, String asiento, int cantidadMaletas, String origen, String destino, double costo) {
        super(nombre, asiento, cantidadMaletas);
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
