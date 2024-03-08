package lab8p2_carloslanza.salvadormacias;

import java.util.ArrayList;

public class Participante extends User {
    private ArrayList<Torneo> torneos;

    public Participante(String usuario, String password) {
        super(usuario, password);
        torneos = new ArrayList<>();
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
