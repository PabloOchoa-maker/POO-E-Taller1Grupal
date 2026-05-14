
package ejercicio2;

public class materia {
    private String nomM;
    private double nota;

    public materia(String nomM, double nota) {
        this.nomM = nomM;
        this.nota = nota;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
