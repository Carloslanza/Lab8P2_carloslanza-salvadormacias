package lab8p2_carloslanza.salvadormacias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdministrarGanadores {
    private ArrayList<Participante> participantes = new ArrayList<>();
    private File archivo = null;

    public AdministrarGanadores(String path) {
        archivo = new File("./" + path);
    }

    public String getArchivoNombre() {
        return archivo.getName();
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
}
