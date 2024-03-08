package lab8p2_carloslanza.salvadormacias;

public class Admin extends User {
    private int torneosCreados;

    public Admin(String usuario, String password) {
        super(usuario, password);
    }

    public int getTorneosCreados() {
        return torneosCreados;
    }

    public void setTorneosCreados(int torneosCreados) {
        this.torneosCreados = torneosCreados;
    }

    @Override
    public String toString() {
        return "Admin{" + "torneosCreados=" + torneosCreados + '}';
    }
    
}
