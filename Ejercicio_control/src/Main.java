public class Main {
    public static void main(String[] args){

    System.out.println("Hello world!");
   System.out.println(" Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0. " +
           "Pista: Los números inferiores a 0 son negativos y los superiores, positivos.\\n");
        System.out.println();
        int numeroIf=-1;
        int numeroWhile=0;
        int numerodoWhile=3;
        String estacion="primavera";



        if(numeroIf>0) {

            System.out.println("El numero: "+numeroIf+" Es positivo");
        }else if (numeroIf<0){
            System.out.println("El numero: "+numeroIf+" Es Negativo");
        }else{
            System.out.println("es cero");
        }
        System.out.println();
        System.out.println();
        System.out.println("Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:");
        System.out.println("Incrementar el valor de la variable en uno cada vez que se ejecute.");
        System.out.println("Mostrarlo por pantalla cada vez que se ejecute.");

        while(numeroWhile < 3) {

            System.out.println("while: "+numeroWhile);
            numeroWhile++;
        }
        System.out.println();
        System.out.println();
        System.out.println("Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.");


        do{

            System.out.println("do while: "+numerodoWhile);
            numerodoWhile++;
        }while(numerodoWhile < 3);

        System.out.println();
        System.out.println();
        System.out.println("Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.");

        for (int numeroFor=0; numeroFor<=3 ;  numeroFor=numeroFor+1 ){
            System.out.println("for: numeroFor = "+numeroFor);
        }
        System.out.println();
        System.out.println();
        System.out.println("Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.");

        System.out.println();

        switch (estacion){
            case "primavera":
                System.out.println("La estacion del año: " +estacion); break;
            case "verano":
                System.out.println("La estacion del año: " +estacion); break;
            case "otoño":
                System.out.println("La estacion del año: " +estacion); break;
            case "Invierno":
                System.out.println("La estacion del año: " +estacion); break;

            default:  System.out.println("No es una estación"); break;
        }
    }
}