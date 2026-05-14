package problema05;

public class Conflicto {

    private String nombre;
    private String estadoActual;
    private Pais[] paisesInvolucrados;
    private Evento[] eventos;

    public Conflicto(String nombre, int cantEventos) {
        this.nombre = nombre;
        this.paisesInvolucrados = new Pais[2];
        this.eventos = new Evento[cantEventos];
        this.estadoActual = "En desarrollo";
    }

    public void setPais(int i, Pais p) {
        this.paisesInvolucrados[i] = p;
    }

    public void setEvento(int i, Evento e) {
        this.eventos[i] = e;
        verificarReglasONU(e);
    }

    private void verificarReglasONU(Evento e) {
        // Regla: Bajas > 50% en cualquier país
        for (Pais p : paisesInvolucrados) {
            if (p != null && e.getBajas() >= (p.getPoblacionTotal() * 0.5)) {
                System.out.println("\n!!! ALERTA ONU: CONVOCATORIA URGENTE POR BAJAS MASIVAS !!!");
            }
        }
        // Regla: Armas nucleares en primer mundo
        if (e.isUsaArmasNucleares()) {
            for (Pais p : paisesInvolucrados) {
                if (p != null && p.isEsPrimerMundo()) {
                    this.estadoActual = "GUERRA MUNDIAL";
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public Pais[] getPaisesInvolucrados() {
        return paisesInvolucrados;
    }

    public Evento[] getEventos() {
        return eventos;
    }
}
