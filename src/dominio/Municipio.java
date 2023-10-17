package dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private String nombre;
    private List<Localidad> localidades;

    public Municipio(String nombre) {
        this.nombre = nombre;
        localidades = new ArrayList<>();
    }

    public void addLocalidad(Localidad l) {
        localidades.add(l);
    }

    public String toString() {
        String cadena = "Municipio: " + nombre + "\n";
        for (Localidad l : localidades) {
            cadena += (l + "\n");
        }
        return cadena;
    }

    public int contarHabitantes() {
        int total = 0;
        for (Localidad l : localidades) {
            total += l.getNumeroDeHabitantes();
        }
        return total;
    }
}

