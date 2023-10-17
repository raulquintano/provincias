
package dominio;

import java.util.ArrayList;
import java.util.List;


public class Provincia {
    private String nombre;
    private List<Municipio> municipios;

    public Provincia(String nombre) {
        this.nombre = nombre;
        municipios = new ArrayList<>();
    }

    public void addMunicipio(Municipio m) {
        municipios.add(m);
    }

    public String toString() {
        String cadena = "Municipio: " + nombre + "\n";
        for (Municipio m : municipios) {
            cadena += (m + "\n");
        }
        return cadena;
    }

    public int contarHabitantes() {
        int total = 0;
        for (Municipio m : municipios) {
            total += m.contarHabitantes();
        }
        return total;
    }
}
