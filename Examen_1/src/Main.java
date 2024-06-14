//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ruta r = new Ruta("Darwin", "venta",3,"Quito","Guayaquil", 20.0);
        Normal n = new Normal("Darwin", "venta",3,"Quito","Guayaquil", 20.0);

        System.out.println("Nombre persona: " + r.getNombre());
        System.out.println("Costo espacio maleta: "+ n.calculoMaletas());
    }
}