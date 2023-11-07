package aplicacion;
import dominio.*;
import presentacion.Interfaz;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        Interfaz interfaz=new Interfaz();
        String peticion;
        System.out.println("---------------------------------------");
        System.out.println("Introduzca (help) para mostrar opciones");
        System.out.println("---------------------------------------");
        interfaz.procesarPeticion("help");
        do {
            peticion=interfaz.leerPeticion();
        } while (interfaz.procesarPeticion(peticion));
    }
}