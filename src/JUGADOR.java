public class JUGADOR {
    private String nombre;
    private String apellido;
    private int puntos;
    private int minutos;
    private int penalizacionFaltas;

    public JUGADOR(String apellido, String nombre, int puntos, int minutos, int penalizacionFaltas) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.puntos = puntos;
        this.minutos = minutos;
        this.penalizacionFaltas = penalizacionFaltas;
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
