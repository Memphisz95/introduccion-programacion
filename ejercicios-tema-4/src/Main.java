public class Main {
    public static void main(String[] args) {

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = 1;

        if(numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo.");
        }else if(numeroIf == 0) {
            System.out.println("El numero es 0.");
        }else {
            System.out.println("El numero " + numeroIf + " es negativo.");
        }

        System.out.println("---------------------------------");

        //Creamos un bucle while, y mientras sea menor a 3, incrementamos valor
        int numeroWhile = 0;
        while(numeroWhile < 3) {
            System.out.println("Numero " + numeroWhile);
            numeroWhile++;
        }

        System.out.println("---------------------------------");

        //Utilizamos el bucle do-while como el ejercicio anterior pero solo se ejecutara una vez
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);

        System.out.println("---------------------------------");

        //Creamos un bucle for e incrementamos en 1 su valor mientras sea menor o igual a 3
        for(int i = 0; i <= 3; i++) {
            System.out.println("Numero " + i);
        }

        System.out.println("---------------------------------");

        //Creamos switch para la variable estacion
        String estacion = "primavera";
        switch (estacion) {
            case "invierno":
                System.out.println("Estacion: invierno");
                break;
            case "primavera":
                System.out.println("Estacion: primavera");
                break;
            case "verano":
                System.out.println("Estacion: verano");
                break;
            case "otoño":
                System.out.println("Estacion: otoño");
                break;
        }
    }
}