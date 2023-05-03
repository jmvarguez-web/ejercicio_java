public class Main {
    public static void main(String[] args) {

        System.out.println("Crea una clase Persona con las siguientes variables:\n" +
                "La edad\n" +
                "El nombre\n" +
                "El teléfono\n" +
                "Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.\n" +
                "Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.\n" +
                "Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.");

        Cliente cliente=new Cliente();
        System.out.println("\n Informacion Cliente.\n");
        cliente.setNombre("Jesus");
        System.out.println("Nombre:"+ cliente.getNombre());
        cliente.setEdad(35);
        System.out.println("Edad:"+cliente.getEdad());
        cliente.setTelefono("999420275");
        System.out.println("Telefono:"+cliente.getTelefono());
        cliente.setCredito((float) 18000.90);
         System.out.println("Credito:"+ cliente.getCredito());

        Trabajador trabajador=new Trabajador();
        System.out.println("\n Informacion Trabajador.\n");
        trabajador.setNombre("Jesus");
        System.out.println("Nombre:"+ trabajador.getNombre());
        trabajador.setEdad(35);
        System.out.println("Edad:"+trabajador.getEdad());
        trabajador.setTelefono("999420275");
        System.out.println("Telefono:"+trabajador.getTelefono());
        trabajador.setSalario((float) 28000.90);
        System.out.println("Salario:"+ trabajador.getSalario());


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

class Cliente extends Persona{

    private float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{

    private float salario;

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}