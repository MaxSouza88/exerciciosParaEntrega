package Exercicio03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("Programa que converte Metros para Centímetros");
        System.out.println("---------------------------------------------");

        System.out.println("Favor informar a medida a ser convertida, separados por vírgula");
        double medida = input.nextDouble();

        input.close();

        double calculo = medida * 100;

        System.out.println("A medida calculada é de: " +calculo + " centímetros");

    }


}
