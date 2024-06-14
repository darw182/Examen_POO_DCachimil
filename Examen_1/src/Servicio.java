public class Servicio extends Vip{
    private final double costoServicioAdicional = 1.5 ;

    public Servicio() {
    }

    public Servicio(String nombre, String asiento, int cantidadMaletas, String origen, String destino, double costo, String serviciosAdicional) {
        super(nombre, asiento, cantidadMaletas, origen, destino, costo, serviciosAdicional);
    }

    public Servicio(String origen, String destino, double costo, String serviciosAdicional) {
        super(origen, destino, costo, serviciosAdicional);
    }

    public Servicio(String serviciosAdicional) {
        super(serviciosAdicional);
    }

    public double getCostoServicioAdicional() {
        return costoServicioAdicional;
    }



    public double calculoCostoservicioAdicional() {
        if (getServiciosAdicional().equals("Internet")){
            return getCostoServicioAdicional() * 4;
        }else  if (getServiciosAdicional().equals("Almohada")){
            return  getCostoServicioAdicional() * 2;
        }

        return 0;
    }
}
