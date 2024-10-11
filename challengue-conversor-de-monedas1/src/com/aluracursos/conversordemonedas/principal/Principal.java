package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.conversores.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("*****************");
            System.out.println("Sea bienvenido/a al Conversor de moneda =]");
            System.out.println("1) Dólar =>> Pesos argentinos");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el valor que desee convertir: ");
                double cantidad = scanner.nextDouble();
                double resultado = 0;

                try {
                    switch (opcion) {
                        case 1:
                            resultado = new ConversorDolarARSPeso().convertir(cantidad);
                            System.out.printf("El valor %.2f [USD] corresponde al valor final de =>> %.2f [ARS]%n", cantidad, resultado);
                            break;
                        case 2:
                            resultado = new ConversorARSDolar().convertir(cantidad);
                            System.out.printf("El valor %.2f [ARS] corresponde al valor final de =>> %.2f [USD]%n", cantidad, resultado);
                            break;
                        case 3:
                            resultado = new ConversorDolarBRL().convertir(cantidad);
                            System.out.printf("El valor %.2f [USD] corresponde al valor final de =>> %.2f [BRL]%n", cantidad, resultado);
                            break;
                        case 4:
                            resultado = new ConversorBRLDolar().convertir(cantidad);
                            System.out.printf("El valor %.2f [BRL] corresponde al valor final de =>> %.2f [USD]%n", cantidad, resultado);
                            break;
                        case 5:
                            resultado = new ConversorDolarCOP().convertir(cantidad);
                            System.out.printf("El valor %.2f [USD] corresponde al valor final de =>> %.2f [COP]%n", cantidad, resultado);
                            break;
                        case 6:
                            resultado = new ConversorCOPDolar().convertir(cantidad);
                            System.out.printf("El valor %.2f [COP] corresponde al valor final de =>> %.2f [USD]%n", cantidad, resultado);
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
                }
            }
        } while (opcion != 7);

        System.out.println("Gracias por usar el conversor de moneda. ¡Hasta luego!");
        scanner.close();
    }
}
