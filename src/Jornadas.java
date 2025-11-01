public class Jornadas {


    private String nombre;
    private String apellido;
    private int jornadas;
    private int puntosindividualesfantasy;
    private int puntostotalesfantasy ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getJornadas() {
        return jornadas;
    }

    public void setJornadas(int jornadas) {
        this.jornadas = jornadas;
    }

    public int getPuntosindividualesfantasy() {
        return puntosindividualesfantasy;
    }

    public void setPuntosindividualesfantasy(int puntosindividualesfantasy) {
        this.puntosindividualesfantasy = puntosindividualesfantasy;
    }

    public int getPuntostotalesfantasy() {
        return puntostotalesfantasy;
    }

    public void setPuntostotalesfantasy(int puntostotalesfantasy) {
        this.puntostotalesfantasy = puntostotalesfantasy;
    }
    public Jornadas(String nombre, String apellido, int jornadas, int puntosindividualesfantasy, int puntostotalesfantasy) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.jornadas = jornadas;
        this.puntosindividualesfantasy = puntosindividualesfantasy;
        this.puntostotalesfantasy = puntostotalesfantasy;
    }

}
