//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE PUNTAJE DE JUGADOR ===");

        // Datos individuales
        System.out.print("Puntos anotados: ");
        JUGADOR jugador1 = new JUGADOR();
        sc.nextInt() = jugador1.setPuntos();

        System.out.print("Minutos jugados: ");
        jugador1.setMinutos() = sc.nextInt();

        System.out.print("Cantidad de faltas: ");
        jugador1.setPenalizacionFaltas() = sc.nextInt();



        // Cálculos individuales
        int puntos = jugador1.getPuntos() * 3;
        int minutos = jugador1.getMinutos() * 1;
        int penalizacionFaltas = jugador1.getPenalizacionFaltas() * 2;

        int puntosIndividuales = puntos + minutos -(penalizacionFaltas);






        // Datos colectivos
        System.out.println("\n=== RESULTADO DEL EQUIPO ===");
        System.out.print("¿El equipo ganó o perdió? (g/p): ");
        char resultado = sc.next().toLowerCase().charAt(0);

        System.out.print("Diferencia de puntos en el marcador: ");
        int diferencia = sc.nextInt();

        int puntosEquipo = 0;

        if (resultado == 'g') {
            if (diferencia > 20) {
                puntosEquipo = 10;
            } else {
                puntosEquipo = 5;
            }
        } else if (resultado == 'p') {
            if (diferencia > 20) {
                puntosEquipo = -10;
            } else {
                puntosEquipo = -5;
            }
        } else {
            System.out.println("Entrada inválida. No se sumarán puntos de equipo.");
        }

        // Puntaje total final
        double puntajeTotal = puntosIndividuales + puntosEquipo;

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Puntaje individual del jugador: " + puntosIndividuales);
        System.out.printf("Puntaje total del jugador: %.2f\n", puntajeTotal);

        sc.close();
    }
}
