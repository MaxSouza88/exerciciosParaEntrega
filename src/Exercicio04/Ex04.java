package Exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        System.out.println("Programa para calculo de Salário");
        System.out.println("---------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Informe ganho por hora");
        double valorHora = input.nextDouble();

        System.out.println("Informe quantidade de horas trabalhadas");
        double horasMes = input.nextDouble();

        input.close();

        double salario = valorHora * horasMes;

        System.out.println("O salario deste mês é de " + salario);

    }
}
