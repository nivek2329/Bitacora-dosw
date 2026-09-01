package ejercicio09;

public class Credentials {
    private final String usuario;
    private final String tipoUsuario;
    private final String ubicacion;
    private final int horaSolicitud;

    public Credentials(String usuario, String tipoUsuario, String ubicacion, int horaSolicitud) {
        this.usuario = usuario;
        this.tipoUsuario = tipoUsuario;
        this.ubicacion = ubicacion;
        this.horaSolicitud = horaSolicitud;
    }

    public String getUsuario() { return usuario; }
    public String getTipoUsuario() { return tipoUsuario; }
    public String getUbicacion() { return ubicacion; }
    public int getHoraSolicitud() { return horaSolicitud; }
}
