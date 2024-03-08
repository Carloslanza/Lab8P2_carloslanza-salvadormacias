package lab8p2_carloslanza.salvadormacias;

import java.util.ArrayList;

public class Torneo {
    private String nombre;
    private ArrayList<Participante> participantes;
    private boolean inscripciónAbierta;
    private boolean terminado;
    private Participante ganador;

    public Torneo(String nombre, ArrayList<Participante> participantes, boolean inscripciónAbierta, boolean terminado, Participante ganador) {
        this.nombre = nombre;
        this.participantes = participantes;
        this.inscripciónAbierta = inscripciónAbierta;
        this.terminado = terminado;
        this.ganador = ganador;
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
        return "Torneo{" + "nombre=" + nombre + ", participantes=" + participantes + ", inscripci\u00f3nAbierta=" + inscripciónAbierta + ", terminado=" + terminado + ", ganador=" + ganador + '}';
    }
    
}
