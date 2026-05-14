package problema05;

public class Pais {

    private String nombre;
    private boolean esPrimerMundo;
    private long poblacionTotal;

    public Pais(String nombre, boolean esPrimerMundo, long poblacionTotal) {
        this.nombre = nombre;
        this.esPrimerMundo = esPrimerMundo;
        this.poblacionTotal = poblacionTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsPrimerMundo() {
        return esPrimerMundo;
    }

    public long getPoblacionTotal() {
        return poblacionTotal;
    }
}
