
package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        String nom,mate,insu;
        Scanner sc =new Scanner(System.in);
        double nota, general;
        int n1,n2,n3,edad ;
        materia[]ACD;
        materia[]APE;
        materia[]AA;
        //Ingreso de datos
        System.out.println("------------------------------");
        System.out.println("Ingrese nombre de estudiante :");
        nom=sc.nextLine();
        System.out.println("Ingrese edad de el Estudiante: ");
        edad=sc.nextInt();
        System.out.println("Ingrese la materia que va a analizar :");
        mate=sc.nextLine();
        Estudiante e1=new Estudiante(nom,edad);
        sc.nextLine();
        System.out.println("Analisis completo listo para empezar...");
        System.out.println("Seccion ACD:");
        
        System.out.println("Ingrese la cantidad de insumos que seran para ACD");
        n1=sc.nextInt();
        ACD = new materia[n1];
        for ( int i =0 ;i<n1;i++){
            sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingrese insumo "+(i+1)+":");
            System.out.println("Nombre (Ej) Trabajo en clase... :");
            insu=sc.nextLine();
            System.out.println("Nota :");
            nota=sc.nextDouble();
            materia m1 = new materia(insu,nota);
            ACD[i]=m1;
        }
        libreta l1 = new libreta(e1,mate,ACD);
        l1.CalcProm(3.5);
        System.out.println("Seccion APE:");
        System.out.println("Ingrese la cantidad de insumos que seran para APE");
        n2=sc.nextInt();
        APE = new materia[n2];
        for ( int i =0 ;i<n2;i++){
            sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingrese insumo "+(i+1)+":");
            System.out.println("Nombre (Ej) Trabajo en clase... :");
            insu=sc.nextLine();
            System.out.println("Nota :");
            nota=sc.nextDouble();
            materia m1 = new materia(insu,nota);
            APE[i]=m1;
        }
        libreta l2 = new libreta(e1,mate,APE);
        l2.CalcProm(3.5);
        System.out.println("Seccion AA:");
        System.out.println("Ingrese la cantidad de insumos que seran para AA");
        n3=sc.nextInt();
        AA = new materia[n3];
        for ( int i =0 ;i<n3;i++){
            sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingrese insumo "+(i+1)+":");
            System.out.println("Nombre (Ej) Trabajo en clase... :");
            insu=sc.nextLine();
            System.out.println("Nota :");
            nota=sc.nextDouble();
            materia m1 = new materia(insu,nota);
            AA[i]=m1;
        }
        libreta l3 = new libreta(e1,mate,AA);
        l3.CalcProm(3.0);
        general=l1.getProm()+l2.getProm()+l3.getProm();
        System.out.println("------------------------------------");
        System.out.println("Resultados de su Libreta: ");
        System.out.println("Nombre Estudiante : "+e1.getNombre());
        System.out.println("Edad : "+e1.getEdad());
        System.out.println("Promedio : "+general);
        System.out.println("Resultados:");
        if (general >=7.0){
            System.out.println("Aprobado , cumple con el requisito ");
        }else{
            System.out.println("DesAprobado deberá rendir un examen de recuperación sobre 3.5/10 pts. agregado al 60% acumulado de los componentes ACD, APE y AA");
        }
        
        
    }
    
}
