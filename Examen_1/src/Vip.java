public class Vip extends Normal{
   private String serviciosAdicional;

    public Vip() {
    }

    public Vip(String serviciosAdicional) {
        this.serviciosAdicional = serviciosAdicional;
    }

    public Vip(String origen, String destino, double costo, String serviciosAdicional) {
        super(origen, destino, costo);
        this.serviciosAdicional = serviciosAdicional;
    }

    public Vip(String nombre, String asiento, int cantidadMaletas, String origen, String destino, double costo, String serviciosAdicional) {
        super(nombre, asiento, cantidadMaletas, origen, destino, costo);
        this.serviciosAdicional = serviciosAdicional;
    }

    public String getServiciosAdicional() {
        return serviciosAdicional;
    }

    public void setServiciosAdicional(String serviciosAdicional) {
        this.serviciosAdicional = serviciosAdicional;
    }

    public double costoPasajeVip(){
        return getCosto() * 1.03;

    }

    @Override
    public double calculoMaletas() {
        if (getCantidadMaletas() > 2 ){
            return getCostoMaleta() * getCantidadMaletas();
        }

        return getCostoMaleta();
    }
}
