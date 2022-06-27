public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 26;
        cliente.nombre = "Adrian";
        cliente.telefono = 657342123;
        cliente.credito = "Es de credito";

        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        System.out.println("----------------------------");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 26;
        trabajador.nombre = "Adrian";
        trabajador.telefono = 657342123;
        trabajador.salario = 1200;

        System.out.println("Trabajador: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    String credito;
}

class Trabajador extends Persona {
    double salario;
}