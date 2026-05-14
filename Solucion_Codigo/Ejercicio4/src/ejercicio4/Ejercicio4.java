
package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        String nomC, fecha, detalles, nom, ocup, nivel, col, conf;
        Scanner sc = new Scanner(System.in);
        double danio, sentencia;
        int dias, n, edad;
        Persona[] PER;
        //Ingreso de datos
        System.out.println("------------------------------");
        System.out.println("Fiscalia General del Estado - Casos de Corrupcion");
        System.out.println("------------------------------");
        System.out.println("Ingrese nombre del caso :");
        nomC = sc.nextLine();
        System.out.println("Ingrese fecha de inicio (dd/mm/aaaa) :");
        fecha = sc.nextLine();
        System.out.println("Ingrese detalles del caso :");
        detalles = sc.nextLine();
        System.out.println("Ingrese danio economico al estado ($) :");
        danio = sc.nextDouble();
        System.out.println("Dias transcurridos desde el inicio :");
        dias = sc.nextInt();
        sc.nextLine();
        System.out.println("Caso registrado, listo para ingresar implicados...");
        System.out.println("Ingrese cantidad de personas implicadas :");
        n = sc.nextInt();
        sc.nextLine();
        PER = new Persona[n];
        for (int i=0; i<n; i++){
            System.out.println("--------------------------");
            System.out.println("Persona "+(i+1)+":");
            System.out.println("Nombre :");
            nom = sc.nextLine();
            System.out.println("Edad :");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ocupacion :");
            ocup = sc.nextLine();
            System.out.println("Nivel de implicacion (acusado/testigo/victima) :");
            nivel = sc.nextLine();
            Persona p1 = new Persona(nom, edad, ocup, nivel);
            if (nivel.equals("acusado")){
                System.out.println("Sentencia en anios :");
                sentencia = sc.nextDouble();
                sc.nextLine();
                p1.setSentencia(sentencia);
                System.out.println("Colabora? (si/no) :");
                col = sc.nextLine();
                p1.setColabora(col.equals("si"));
                System.out.println("Confeso la verdad? (si/no) :");
                conf = sc.nextLine();
                p1.setConfeso(conf.equals("si"));
            }
            System.out.println("--------------------------");
            PER[i] = p1;
        }
        CasosC c1 = new CasosC(nomC, fecha, detalles, danio, PER);
        c1.ActEstado(dias);
        System.out.println("------------------------------------");
        System.out.println("Resumen del Caso :");
        System.out.println("Nombre : "+c1.getNomC());
        System.out.println("Fecha inicio : "+c1.getFecha());
        System.out.println("Dias transcurridos : "+c1.getDias());
        System.out.println("Estado : "+c1.getEstado());
        System.out.println("Detalles : "+c1.getDetalles());
        System.out.println("Danio economico : $"+c1.getDanio());
        System.out.println("------------------------------------");
        System.out.println("Personas implicadas :");
        for (int i=0; i<c1.getP().length; i++){
            Persona p = c1.getP()[i];
            System.out.println("- "+p.getNombre()+" | "+p.getEdad()+" anios | "+p.getOcupacion()+" | Rol: "+p.getNivel());
            if (p.getNivel().equals("acusado")){
                System.out.println("  Sentencia inicial : "+p.getSentencia()+" anios");
                if (p.getConfeso()){
                    p.RedPena(0.3);
                    System.out.println("  Aplica reduccion de pena (confeso). Sentencia ahora : "+p.getSentencia()+" anios");
                }
                if (p.PuedeFianza()){
                    double f = p.CalcFianza(c1.getDanio());
                    System.out.println("  Puede acogerse a fianza. Fianza maxima : $"+f);
                } else {
                    System.out.println("  No aplica fianza");
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Fin del proceso.");

    }

}
