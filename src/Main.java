//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;

        int jornadas = 0;

        Jornadas[] ptotal = new Jornadas[100];
        for (int i = 0; i < 100; i++) {
            ptotal[i] = new Jornadas("y", "x", 0, 0, 0);

        }

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
                    //de momento es un resumen de todos los jugadores introduciodos manualmente
                    System.out.println("\n=== ESTE ES EL RESUMEN DE TU EQUIPO FANTASY ==\n");
                    for (int i = 0; i < ptotal.length; i++) {
                        if(!ptotal[i].getNombre().equals("y")){
                            System.out.println(" jugador "+ (i+1) + " con nombre "+ ptotal[i].getNombre() +" puntos individuales ==> "+ ptotal[i].getPuntosindividualesfantasy() + " Y puntos de equipo ==> " + ptotal[i].getPuntostotalesfantasy());
                        }
                    }

                    break;
                case 3:
                    System.out.println("no implementado");
                    System.out.println("\n=== ESTE ES LA CLASIFICACION ACTUAL DE LOS INTRODUCIDOS MANUALMENTE ==\n");;
                    Jornadas[] clasificacion = new Jornadas[ptotal.length];
                    for (int i = 0; i < ptotal.length; i++) {
                        clasificacion[i] = new Jornadas("y", "x", 0, 0, 0);
                    }

                    //sin acabar ->
                    for (int i = 0; i < clasificacion.length; i++) {
                        for (int j = 0; j < clasificacion.length; j++) {
                            if(clasificacion[i].getPuntosindividualesfantasy()<ptotal[j].getPuntosindividualesfantasy()){

                                //imprime siempre el mayor(cambiar)
                                clasificacion[i] = ptotal[j];
                            }




                        }

                            System.out.println(" CLASIFICADO "+ (i+1) + "º con nombre "+ clasificacion[i].getNombre() +" puntos individuales ==> "+ clasificacion[i].getPuntosindividualesfantasy());


                    }
                    // <- sin acabar

                    break;
                case 4:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad de juggadors que jugaron el partido:");
                    int jugadores = entrada.nextInt();

                    Jugador[] personas = new Jugador[jugadores];
                    for (int i = 0; i < jugadores; i++) {


                        personas[i] = new Jugador("y", "x", 0, 0, 0, 0, 0, 0);
                    }


                    // datos de un partido
                    for (int i = 0; i < personas.length; i++) {
                        int pruebacontrol = 0;


                        System.out.println("=== CÁLCULO DE PUNTAJE DE JUGADOR ===");
                        System.out.println("Nombre del jugador " + (i + 1) + " : ");
                        personas[i].setNombre(entrada.next());

                        for (int i1 = 0; i1 < ptotal.length; i1++) {
                            if (personas[i].getNombre().equals(ptotal[i1].getNombre())) {

                                pruebacontrol = i1;
                                break;


                            } else if (ptotal[i1].getNombre().equals("y")) {
                                pruebacontrol = i1;
                                ptotal[i1].setNombre(personas[i].getNombre());
                                break;
                            }
                        }

                        System.out.println("Apellido del jugador: ");
                        personas[i].setApellido(entrada.next());
                        ptotal[pruebacontrol].setApellido(personas[i].getApellido());

                        System.out.print("Puntos anotados: ");
                        personas[i].setPuntos(entrada.nextInt());

                        System.out.print("Minutos jugados: ");
                        personas[i].setMinutos(entrada.nextInt());

                        System.out.print("Cantidad de faltas: ");
                        personas[i].setPenalizacionFaltas(entrada.nextInt());

                        // Cálculos individuales


                        personas[i].setPuntosindividuales(personas[i].getPuntos() * 3 + personas[i].getMinutos() - personas[i].getPenalizacionFaltas() * 2);
                        ptotal[pruebacontrol].setPuntosindividualesfantasy(ptotal[pruebacontrol].getPuntosindividualesfantasy() + personas[i].getPuntosindividuales());


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
                        personas[i].setPuntostotales(personas[i].getPuntosindividuales() + puntosEquipo);
                        ptotal[pruebacontrol].setPuntostotalesfantasy(ptotal[pruebacontrol].getPuntostotalesfantasy() + personas[i].getPuntostotales());
                    }


                    // Puntaje total final

                    //for (int i = 0; i < personas.length; i++) {
                    //    personas[i].setPuntostotales(personas[i].getPuntosindividuales()+puntosEquipo);


                    //}

                    System.out.println("\n=== RESULTADO FANTASY ===");
                    for (int i = 0; i < personas.length; i++) {
                        int pruebacontrol = 0;
                        for (int i1 = 0; i1 < ptotal.length; i1++) {

                            if (personas[i].getNombre().equals(ptotal[i1].getNombre())) {

                                pruebacontrol = i1;
                            }


                        }


                        System.out.print("\njugador: " + (i + 1) + " con nombre : " + personas[i].getNombre() + " ANOTÓ ==> " + personas[i].getPuntosindividuales() + " puntos fantasy individuales");
                        System.out.print(" y puntos FANTASY DE EQUIPO ==> " + personas[i].getPuntostotales());
                        System.out.print(" \npuntos acumulados individuales==> " + ptotal[pruebacontrol].getPuntosindividualesfantasy() + " puntos equipo Fnatsay acumulados ==> " + ptotal[pruebacontrol].getPuntostotalesfantasy());

                    }
                    System.out.println("\n ================ ");
                    jornadas++;
                    break;


            }
        }while (opcion != 5) ;


    }

    public static int doMenu() {
     /*
           public static int domenu(){
           }
         */
        Scanner menuselect = new Scanner(System.in);
        System.out.println("\n--<=== BIENVENIDO AL MENU FANTASY ===>--");
        System.out.println("\n pulsa el numero correspondiente para acceder a las secciones");
        System.out.println("- 1. MERCADO(NO IMPLEMENTADO).");
        System.out.println("- 2. TU EQUIPO FANTASY(FUNCIONA) ");
        System.out.println("- 3. CLASIFICACION FANTASY(IMPLEMENTADO SIN ACABAR) ");
        System.out.println("- 4. PARTIDO MANUAL(FUNCIONA)");
        System.out.println("- 5. SALIR DE LA APLICACCION (FUNCIONA) ");
        System.out.println(" etc work in progress... ");
        System.out.println("TU SELECCION =>");

        int menu = menuselect.nextInt();

        return menu;
    }




}
