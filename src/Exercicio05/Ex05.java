package Exercicio05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------");
        System.out.println("Programa para converter Temperatura Fahrenheit para Celsius");
        System.out.println("-----------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Favor informar a temperatura a ser convertida: ");
        double temperatura = input.nextDouble();

        input.close();

        double calculo = (temperatura - 32) / 1.8;

        System.out.println("A temperatura em Celsius é de " +calculo);





    }
}
