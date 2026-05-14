
package problema03;

public class Empresa {
    private String nombre, Ruc,direc;
    private Departamento[] d;
    public Empresa(String nombre,String Ruc,String direc,Departamento[] d){
        this.Ruc=Ruc;
        this.direc=direc;
        this.nombre=nombre;
        this.d = d;
    }

        public Departamento[] getD() {
            return d;
        }

        public void setD(Departamento[] d) {
            this.d = d;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getDireccion() {
        return direc;
    }

    public void setDireccion(String direccion) {
        this.direc = direccion;
    }
}
