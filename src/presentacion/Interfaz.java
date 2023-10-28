package presentacion;
import dominio.*;
import java.util.*;


public class Interfaz
{

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Provincia> provincias = new ArrayList<>();

    public static boolean procesarPeticion(String peticion, ArrayList<Provincia> l)
    {
        String[] p = peticion.split(" ");

        if(p.length == 2 )
        {
            if(p[0].equals("addProvincia"))
                anadirProvincia(p[1], l);
                else if(p[0].equals("addMunicipio"))
                anadirMunicipio(p[1], l);
            else if(p[0].equals("addLocalidad"))
                anadirLocalidad(p[1], l);
            else
            System.out.println("ERROR, para más información consulte en 'help'");
        }
        else if(p.length == 1)
        {
            if(p[0].equals("leer"))
            leer();
            else if(p[0].equals("list"))
            System.out.println(1);
            else if(p[0].equals("help"))
            System.out.println("Puede usar: \n add Provincia nombre: añadir Provincia\n addMunicipio nombre: añadir Municipio\n addLocalidad: añadir Localidad");
            else if(p[0].equals("exit"))
            return false;
        }
        else
        {
            System.out.println("ERROR");
            procesarPeticion("help", l);
        }
        return true;
    }
    public static ArrayList<Provincia> leer()
    {
        public static void anadirProvincia(String nombre, ArrayList<Provincia> l)
        {
            Provincia p = new Provincia(nombre);
            l.add(p);
        }
    }
        public static void anadirMunicipio(String nombre, ArrayList<Provincia> l)
        {
            Municipio m = new Municipio(nombre);
            for( int i = 0; i <l.size(); i++)
            {
                System.out.println(i + ": "+ l.get(i).getNombre());
            }
            System.out.println("Introduzca el número de la provincia: ");
            int i = sc.nextInt();
            sc.nextLine();
            l.get(i).add(m);
        }
        public static void anadirLocalidad(String nombre, ArrayList<Provincia> l)
        {
            System.out.println("Numero de habitantes: ");
            int poblacion = sc.nextInt();
            sc.nextLine();
            Localidad d = new Localidad( nombre,poblacion);
            for (int i = 0; i <l.size(); i++)
            {
                System.out.println(i + ": " + l.get(i).getMunicipio(j).getNombre());
            }
            System.out.println("Introduzca el número del municipio: ");
            int j = sc.nextInt;
            sc.nextLine();
            l.get(i).getMunicipio(j).add(d);
        }
        
    
}





