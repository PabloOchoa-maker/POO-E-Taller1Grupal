
package problema03;

public class Departamento {
    private String nomDep,cat;
    private int numEmp, produc;
    
    
    public Departamento(String nomDep, int numEmp, int produc){
        this.nomDep= nomDep;
        this.numEmp= numEmp;
        this.produc=produc;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public int getProduc() {
        return produc;
    }

    public void setProduc(int produc) {
        this.produc = produc;
    }

    public String getCat() {
        return cat;
    }

    public void calcCat(){
        if ((0<numEmp && numEmp<=10)&&(0<produc&&produc<=500000)){
            cat="C";
        }else if ((10<numEmp && numEmp<=20)&&(500000<produc&&produc<=1000000)){
            cat="B";
        }else if ((20<numEmp)&&(1000000<produc)){
            cat="A";
        }
    }
    
}

