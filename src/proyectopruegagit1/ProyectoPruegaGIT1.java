package proyectopruegagit1;

import java.util.*;

public class ProyectoPruegaGIT1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (salir == false) {
            System.out.println("Hola");
            System.out.print("Ingrese su opcion:");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Saliendo.....");
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    System.out.println("");
                    break;
            }
        }
    }

}
