public class Jugador {
    private String nombre = "sergio";
    private String apellido = "vazquez";
    private int puntos = 0;
    private int minutos = 0;
    private int penalizacionFaltas = 0;
    private int puntosindividuales = 0;
    private int puntostotales = 0;
    private int partidosjugados = 0;

    public int getPuntosindividuales() {
        return puntosindividuales;
    }

    public void setPuntosindividuales(int puntosindividuales) {
        this.puntosindividuales = puntosindividuales;
    }

    public int getPuntostotales() {
        return puntostotales;
    }

    public void setPuntostotales(int puntostotales) {
        this.puntostotales = puntostotales;
    }

    public int getPartidosjugados() {
        return partidosjugados;
    }

    public void setPartidosjugados(int partidosjugados) {
        this.partidosjugados = partidosjugados;
    }


    public Jugador(String apellido, String nombre, int puntos, int minutos, int penalizacionFaltas, int puntosindividuales, int puntostotales, int partidosjugados) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.puntos = puntos;
        this.minutos = minutos;
        this.penalizacionFaltas = penalizacionFaltas;
        this.puntosindividuales = puntosindividuales;
        this.puntostotales = puntostotales;
        this.partidosjugados = partidosjugados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getPenalizacionFaltas() {
        return penalizacionFaltas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setPenalizacionFaltas(int penalizacionFaltas) {
        this.penalizacionFaltas = penalizacionFaltas;
    }
}
