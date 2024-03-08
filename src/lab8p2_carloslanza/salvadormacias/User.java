package lab8p2_carloslanza.salvadormacias;

import java.io.Serializable;

public class User implements Serializable {
    private String usuario;
    private String password;

    public User(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
}
