
package ejercicio4;

public class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String nivel;       // acusado, testigo, victima
    private double sentencia;   // en anios
    private boolean colabora;
    private boolean confeso;

    public Persona(String nombre, int edad, String ocupacion, String nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getSentencia() {
        return sentencia;
    }

    public void setSentencia(double sentencia) {
        this.sentencia = sentencia;
    }

    public boolean getColabora() {
        return colabora;
    }

    public void setColabora(boolean colabora) {
        this.colabora = colabora;
    }

    public boolean getConfeso() {
        return confeso;
    }

    public void setConfeso(boolean confeso) {
        this.confeso = confeso;
    }

    // Reduce la pena al acusado que confeso (x = porcentaje en decimal, ej 0.3 = 30%)
    public void RedPena(double x){
        if (nivel.equals("acusado") && confeso){
            sentencia = sentencia - (sentencia*x);
        }
    }

    // Verifica si el acusado puede pagar fianza
    public boolean PuedeFianza(){
        if (nivel.equals("acusado") && sentencia<1 && colabora){
            return true;
        }
        return false;
    }

    // Calcula la fianza maxima (50% del danio economico)
    public double CalcFianza(double danio){
        return danio*0.5;
    }

}
