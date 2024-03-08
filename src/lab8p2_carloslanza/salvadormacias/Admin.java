package lab8p2_carloslanza.salvadormacias;

public class Admin extends User {
    private int torneos;

    public Admin(String usuario, String password) {
        super(usuario, password);
    }

    public int getTorneos() {
        return torneos;
    }

    public void setTorneos(int torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
