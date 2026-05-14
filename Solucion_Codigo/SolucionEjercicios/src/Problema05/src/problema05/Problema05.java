package problema05;

import java.util.Scanner;

public class Problema05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- REGISTRO DE CONFLICTO INTERNACIONAL ---");
        System.out.print("Nombre del conflicto: ");
        String nomC = sc.nextLine();
        System.out.print("Cantidad de eventos a registrar: ");
        int nEv = sc.nextInt();
        sc.nextLine();

        Conflicto conflicto = new Conflicto(nomC, nEv);

        // IIngresar paises
        for (int i = 0; i < 2; i++) {
            System.out.println("\nDatos del País Involucrado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nP = sc.nextLine();
            System.out.print("¿Es país desarrollado? (true/false): ");
            boolean esDes = sc.nextBoolean();
            System.out.print("Población Total: ");
            long pob = sc.nextLong();
            sc.nextLine();
            conflicto.setPais(i, new Pais(nP, esDes, pob));
        }

        // Ingresar eventos
        for (int i = 0; i < nEv; i++) {
            System.out.println("\nDatos del Evento " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nE = sc.nextLine();
            System.out.print("Fecha: ");
            String fE = sc.nextLine();
            System.out.print("Ubicación: ");
            String uE = sc.nextLine();
            System.out.print("Número de bajas: ");
            int bE = sc.nextInt();
            System.out.print("¿Hubo uso de armas nucleares? (true/false): ");
            boolean aE = sc.nextBoolean();
            sc.nextLine();

            conflicto.setEvento(i, new Evento(nE, fE, uE, bE, aE));
        }

        // REPORTE FINAL
        System.out.println("\n==============================================");
        System.out.println("REPORTE HISTÓRICO: " + conflicto.getNombre());
        System.out.println("ESTADO FINAL: " + conflicto.getEstadoActual());
        System.out.println("==============================================");

        System.out.println("PAÍSES PARTICIPANTES:");
        for (Pais p : conflicto.getPaisesInvolucrados()) {
            System.out.println("- " + p.getNombre() + " (Población: " + p.getPoblacionTotal() + ")");
        }

        System.out.println("\nCRONOLOGÍA DE EVENTOS:");
        for (Evento e : conflicto.getEventos()) {
            System.out.println("[" + e.getFecha() + "] " + e.getNombre() + " en " + e.getUbicacion());
            System.out.println("    Bajas: " + e.getBajas() + " | Nuclear: " + (e.isUsaArmasNucleares() ? "SÍ" : "NO"));
            System.out.println("----------------------------------------------");
        }
    }
}
