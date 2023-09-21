package CalculadoraSimple;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner consl = new Scanner(System.in);
        while (true){

            System.out.println("***** Aplicación calculadora *****");
            //Mostramos el menu
            mostrarMenu();
            try {

                var opcion = Integer.parseInt(consl.nextLine());
                if (opcion >= 1 && opcion <= 5) {

                    ejecutarOpcion(opcion,consl);

                } else if (opcion == 6) { //Salir
                    System.out.println("Cerrando calculadora, hasta pronto!");
                    break;
                } else {
                    System.out.println("Opción invalida " + opcion);
                }
                //Imprimimos un salto antes de cada ciclo
                System.out.println();

            } //fin try
            catch (Exception e){
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            }
        } //fin de while
    } //fin de main


    private static void mostrarMenu(){

        System.out.println("""
                    1) Suma
                    2) Resta
                    3) Multiplicación
                    4) División
                    5) Resto
                    6)Salir   
                    """);
        System.out.println("Ingrese la opción a realizar");
    }


    private static void ejecutarOpcion(int opcion, Scanner consl){

        System.out.println("Ingrese el primer numero: ");
        var num1 = Double.parseDouble(consl.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        var num2 = Double.parseDouble(consl.nextLine());

        double resultado;
        switch (opcion) {
            case 1 -> { // Suma
                resultado = num1 + num2;
                System.out.println("Resultado suma: " + resultado);

            }
            case 2 -> { // Resta
                resultado = num1 - num2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { // Multiplicación
                resultado = num1 * num2;
                System.out.println("Resultado Multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = num1 / num2;
                System.out.println("Resultado División: " + resultado);
            }
            case 5 -> {
                resultado = num1 % num2;
                System.out.println("Resultado Resto: " + resultado);
            }
            default -> System.out.println("Opción invalida " + opcion);

        }

    }

} // fin de la clase
