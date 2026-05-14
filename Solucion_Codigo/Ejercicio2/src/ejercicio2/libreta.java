
package ejercicio2;

public class libreta {
    private Estudiante e;
    private String nom;
    private double prom;
    private String promc;
    // conjunto de arreglos de objetos->materia
    private materia [] M;

    public libreta( Estudiante e,String nom, materia[] M) {
        this.nom = nom;
        this.M = M;
        this.e=e;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getProm() {
        return prom;
    }

    public String getPromc() {
        return promc;
    }

    public void CalcProm(double x) {
        double sum=0;
        for(int j =0;j<M.length;j++){
            sum+=getM()[j].getNota();
        }
        this.prom = sum/x;
    }

    public materia[] getM() {
        return M;
    }

    public void setM(materia[] M) {
        this.M = M;
    }

    public Estudiante getE() {
        return e;
    }

    public void setE(Estudiante e) {
        this.e = e;
    }
    
    

    
}
