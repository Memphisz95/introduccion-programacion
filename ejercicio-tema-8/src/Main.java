public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setNombre("Adrian");
        persona.setTelefono(678980654);

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

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
}