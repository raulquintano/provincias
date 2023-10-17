package aplicacion;
import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;

public class Principal {
    public static void main(String[] args) {
        Localidad localidad1 = new Localidad();
        localidad1.setNombre("Vigo");
        localidad1.setNumeroDeHabitantes(300000);
        
        Localidad localidad2 = new Localidad();
        localidad2.setNombre("Lugo");
        localidad2.setNumeroDeHabitantes(10000);
        
        Municipio municipio1 = new Municipio("Baiona");
        municipio1.addLocalidad(localidad1);
        municipio1.addLocalidad(localidad2);
        
        Provincia provincia1 = new Provincia("Pontevedra");
        provincia1.addMunicipio(municipio1);
        
        System.out.println(provincia1);
        
    }
}
