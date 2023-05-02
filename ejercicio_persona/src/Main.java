public class Main {
    public static void main(String[] args) {

        System.out.println("Crear clase Persona.\n" +
                "Crear variables las privadas edad, nombre y telefono de la clase Persona.\n" +
                "Crear gets y sets de cada propiedad.\n" +
                "Crear un objeto persona en el main.\n" +
                "Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.");

        Persona persona=new Persona();
        System.out.println("\nResultado.\n");
        persona.setNombre("Jesus");
        System.out.println("Nombre:"+ persona.getNombre());
        persona.setEdad(35);
        System.out.println("Edad:"+persona.getEdad());
        persona.setTelefono("999420275");
        System.out.println("Telefono:"+persona.getTelefono());


    }
}

class Persona{

    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}