
package ejercicio4;

public class CasosC {
    private String nomC;
    private String fecha;       // dd/mm/aaaa
    private int dias;           // dias transcurridos desde el inicio
    private String estado;
    private String detalles;
    private double danio;       // danio economico al estado
    // conjunto de arreglos de objetos->Persona
    private Persona [] P;

    public CasosC(String nomC, String fecha, String detalles, double danio, Persona[] P) {
        this.nomC = nomC;
        this.fecha = fecha;
        this.detalles = detalles;
        this.danio = danio;
        this.P = P;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public String getEstado() {
        return estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public Persona[] getP() {
        return P;
    }

    public void setP(Persona[] P) {
        this.P = P;
    }

    // Actualiza el estado segun los dias transcurridos
    public void ActEstado(int d){
        this.dias = d;
        if (d>14){
            this.estado="Urgente";
        } else if (d>7){
            this.estado="Alerta";
        } else {
            this.estado="Iniciado";
        }
    }

}
