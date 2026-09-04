    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    import java.util.Scanner;

    public class main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingtrese su carrera: ");
            String carrera = scanner.nextLine();

            System.out.println("Ingerese su edad: ");
            int edad = scanner.nextInt();

            Estudiante estudiante = new Estudiante(nombre, carrera, edad);

            estudiante.mostrarInformacion();
        }
    }
}
