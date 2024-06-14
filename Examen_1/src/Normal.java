public class Normal extends Ruta{
    private final double costoMaleta = 2.00;

    public Normal() {
    }

    public Normal(String origen, String destino, double costo) {
        super(origen, destino, costo);
    }

    public Normal(String nombre, String asiento, int cantidadMaletas, String origen, String destino, double costo) {
        super(nombre, asiento, cantidadMaletas, origen, destino, costo);
    }

    public double getCostoMaleta() {
        return costoMaleta;
    }

    public double calculoMaletas() {
        if (getCantidadMaletas() != 1){
            return costoMaleta * getCantidadMaletas();
        }

        return costoMaleta;
    }
}
