package problema05;

public class Evento {

    private String nombre, fecha, ubicacion;
    private int bajas;
    private boolean usaArmasNucleares;

    public Evento(String nombre, String fecha, String ubicacion, int bajas, boolean armas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.bajas = bajas;
        this.usaArmasNucleares = armas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getBajas() {
        return bajas;
    }

    public boolean isUsaArmasNucleares() {
        return usaArmasNucleares;
    }
}
