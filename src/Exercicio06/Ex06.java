package Exercicio06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------");
        System.out.println("Programa que imprime antecessor e sucessor de um numero");
        System.out.println("--------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero");
        int numero = input.nextInt();

        input.close();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O numero informado foi: " +numero);
        System.out.println("Seu antecessor é: " +antecessor);
        System.out.println("Seu sucessor é: " +sucessor);

    }
}
