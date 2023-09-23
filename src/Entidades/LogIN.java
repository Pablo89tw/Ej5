package Entidades;

public class LogIN {
    private int usuario;
    private String clave;

    public LogIN(int usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   
}
