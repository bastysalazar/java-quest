    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            for (int contador = 1; contador < 5; contador++) {
                System.out.println("registro procesado: " + contador);

                int opcion = 1;
                while (opcion != 0) {

                    System.out.println("------MENU-------");
                    System.out.println("1). Estado");
                    System.out.println("2). Operaciones");
                    System.out.println("3). Salir");

                    System.out.println("Eliga la opcion");
                    opcion = Scanner.nextInt();
                }
                if (opcion == 1) ;
                System.out.println("Sistema operativo");
            } else if (opcion == 2) {
                System.out.println("Proceso operacional");
            } else if (opcion == 0) {
                System.out.println("Cerrando sistema");


            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingtrese su carrera: ");
            String carrera = scanner.nextLine();

            System.out.println("Ingerese su edad: ");
            int edad = scanner.nextInt();

            Estudiante estudiante = new Estudiante(nombre, carrera, edad );

            if (edad < 18) {
                System.out.println("el estudiante es menor de edad");
            } else if (edad < 24) {
                System.out.println("estudiante joven.");
            } else {
                System.out.println("estudiante adulto.");
            }

            estudiante.mostrarInformacion();

            }
        }
}
