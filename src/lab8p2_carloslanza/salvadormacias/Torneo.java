package lab8p2_carloslanza.salvadormacias;

import java.io.Serializable;
import java.util.ArrayList;

public class Torneo implements Serializable {
    private String nombre;
    private ArrayList<Participante> participantes;
    private boolean inscripciónAbierta = true;
    private int rondas;
    private boolean terminado = false;
    private Participante ganador;

    public Torneo(String nombre, int rondas) {
        this.nombre = nombre;
        this.rondas = rondas;
        participantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public boolean isInscripciónAbierta() {
        return inscripciónAbierta;
    }

    public void setInscripciónAbierta(boolean inscripciónAbierta) {
        this.inscripciónAbierta = inscripciónAbierta;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }
    
    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
