
package problema03;

import java.util.Scanner;

public class Problema03 {

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    String nombre, dept, direccion, Ruc, cat;
    int numEmp, produc;

    System.out.println("Ingrese el nombre de la empresa");
    nombre = e.nextLine();
    System.out.println("Ingrese el RUC de la empresa");
    Ruc = e.nextLine();
    System.out.println("Ingrese la direccion de la empresa");
    direccion = e.nextLine();

    Departamento[] d = new Departamento[3];
    for (int i = 0; i < 3; i++) {

      System.out.println("Ingrese el nombre del departamento");
      dept = e.nextLine();
      System.out.println("Ingrese el numero de empleados del departamento");
      numEmp = e.nextInt();
      System.out.println("Ingrese la produccion del departamento");
      produc = e.nextInt();
      e.nextLine();
      d[i] = new Departamento(dept, numEmp, produc);
    }
    Empresa emp = new Empresa(nombre, Ruc, direccion, d);
    System.out.println("Empresa: " + emp.getNombre() + " RUC: " + emp.getRuc() + " Direccion: " + emp.getDireccion());
    for (int i = 0; i < 3; i++) {
      emp.getD()[i].calcCat();
      System.out.println("Departamento: " + emp.getD()[i].getNomDep() +"Numero de Empleados: "+emp.getD()[i].getNumEmp()+"Produccion Anual: "+emp.getD()[i].getProduc()+" Categoria: " + emp.getD()[i].getCat());
    }
  }

}
