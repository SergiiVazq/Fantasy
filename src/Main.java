//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
        // PROYECTO FANTASY CATEGORIAS BASE SIN REBOTES ROBOS ASISTENCIAS ETC
        //START MENU
        do {

            opcion = doMenu();
            while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {

                System.out.println("Opcion Incorrecta teclea una opcion correacta");
                opcion = doMenu();

            }
            switch (opcion) {
                case 1:
                    System.out.println("no implementado");
                    break;
                case 2:
                    System.out.println("no implementado");
                    break;
                case 3:
                    System.out.println("no implementado");
                    break;
                case 4:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de juggadors que jugaron el partido:");
                    int jugadores = entrada.nextInt();

                    Jugador[] personas = new Jugador[jugadores];


                    // datos de un partido
                    for (int i = 0; i < personas.length; i++) {
                        personas[i] = new Jugador("x", "x", 0, 0, 0, 0, 0, 0);

                        System.out.println("=== CÁLCULO DE PUNTAJE DE JUGADOR ===");
                        System.out.println("Nombre del jugador " + (i + 1) + " : ");
                        personas[i].setNombre(entrada.next());
                        System.out.println("Apellido del jugador: ");
                        personas[i].setApellido(entrada.next());

                        System.out.print("Puntos anotados: ");
                        personas[i].setPuntos(entrada.nextInt());

                        System.out.print("Minutos jugados: ");
                        personas[i].setMinutos(entrada.nextInt());

                        System.out.print("Cantidad de faltas: ");
                        personas[i].setPenalizacionFaltas(entrada.nextInt());

                        // Cálculos individuales


                        personas[i].setPuntosindividuales(personas[i].getPuntos() * 3 + personas[i].getMinutos() - personas[i].getPenalizacionFaltas() * 2);


                    }


                    // Datos colectivos
                    System.out.println("\n=== RESULTADO DEL EQUIPO ===");
                    System.out.print("¿El equipo ganó o perdió? (g/p): ");
                    char resultado = entrada.next().charAt(0);
                    while (resultado != 'g' && resultado != 'p' && resultado != 'P' && resultado != 'G') {
                        System.out.println("Error introduce bien g si gananron el partido y p si perdieron el partido : ");
                        resultado = entrada.next().charAt(0);
                    }
                    System.out.print("Diferencia de puntos en el marcador: ");
                    int diferencia = entrada.nextInt();

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

                    //for (int i = 0; i < personas.length; i++) {
                    //    personas[i].setPuntostotales(personas[i].getPuntosindividuales()+puntosEquipo);
                    calculoindividual(personas, puntosEquipo);
                    //}

                    System.out.println("\n=== RESULTADO FANTASY ===");
                    for (int i = 0; i < personas.length; i++) {
                        System.out.print("\njugador: " + (i + 1) + " con nombre : " + personas[i].getNombre() + " ANOTÓ ==> " + personas[i].getPuntosindividuales() + " puntos fantasy individuales");
                        System.out.print(" y puntos FANTASY DE EQUIPO ==> " + personas[i].getPuntostotales());

                    }
                    System.out.println(" ================ ");

            }


        } while (opcion != 5);
    }

    public static int doMenu() {
     /*
           public static int domenu(){
           }
         */
        Scanner menuselect = new Scanner(System.in);
        System.out.println("\n--<=== BIENVENIDO AL MENU FANTASY ===>--");
        System.out.println("\n pulsa el numero correspondiente para acceder a las secciones");
        System.out.println("- 1. MERCADO(SIN ACABAR).");
        System.out.println("- 2. TU EQUIPO FANTASY(SIN ACABAR) ");
        System.out.println("- 3. CLASIFICACION FANTASY(SIN ACABAR) ");
        System.out.println("- 4. PARTIDO MANUAL(FUNCIONA)");
        System.out.println("- 5. SALIR DE LA APLICACCION(FUNCIONA) ");
        System.out.println(" etc work in progress... ");
        System.out.println("TU SELECCION =>");

        int menu = menuselect.nextInt();

        return menu;
    }
    public static void calculoindividual (Jugador[]players,int x){
        for (int i = 0; i < players.length; i++) {


            players[i].setPuntostotales(players[i].getPuntosindividuales() + x);
        }
    }



}
