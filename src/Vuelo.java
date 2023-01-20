import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private Integer totalPasajeros;

    public Vuelo(String nomre, String origen, String destino, Date fechaLlegada,
                 Integer totalPasajeros) {
        this.nombre         = nomre;
        this.origen         = origen;
        this.destino        = destino;
        this.fechaLlegada   = fechaLlegada;
        this.totalPasajeros = totalPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public Integer getTotalPasajeros() {
        return totalPasajeros;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + " ==> " +
                " origen= " + origen + " ==> " +
                " destino= " + destino + " ==> " +
                " fechaLlegada= " + fechaLlegada + " ==> " +
                " totalPasajeros=" + totalPasajeros;
    }
}


