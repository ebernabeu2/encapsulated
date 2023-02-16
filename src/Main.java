public class Main {
    public static void main(String[] args) {
        Persona cliente1 = new Persona();
        cliente1.setNombre("Ana");
        cliente1.setEdad(40);
        cliente1.setTelefono(918809070);

        Persona cliente2 = new Persona();
        cliente2.setNombre("Alberto");
        cliente2.setEdad(50);
        cliente2.setTelefono(955487858);

        System.out.println("Nombre   Edad   Telefono");
        System.out.println(cliente1.getNombre() + "       " + cliente1.getEdad() + "    " + cliente1.getTelefono());
        System.out.println(cliente2.getNombre() + "   " + cliente2.getEdad() + "    " + cliente2.getTelefono());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
}