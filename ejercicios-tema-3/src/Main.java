public class Main {
    public static void main(String[] args) {

        int resultado;
        resultado = suma(1, 2, 3);
        System.out.println("Resultado de la suma: " + resultado);

        //instanciamos objeto
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puerta/s.");
    }

    //función que suma tres números
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

//clase coche
class Coche {

    //propiedad de la clase
    int puertas = 0;

    //función que incrementa la propiedad puerta de la clase coche
    public int incrementarPuertas() {
        return puertas++;
    }

}