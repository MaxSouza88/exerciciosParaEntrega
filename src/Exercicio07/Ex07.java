package Exercicio07;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Programa que Calcula Salário com Descontos");
        System.out.println("--------------------------------------------------------");

        System.out.println("Informe valor por hora trabalhada");
        double valorHoraTrabalhada = input.nextDouble();

        System.out.println("Informe quantidade de horas trabalhadas");
        double horasTrabalhadas = input.nextDouble();

        double salarioBruto = valorHoraTrabalhada * horasTrabalhadas;

        double impostoRenda = (salarioBruto * 11) / 100;
        double inss = (salarioBruto * 8) /100;
        double sindicato = (salarioBruto * 5)/100;

        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("Salário Bruto é de: " + salarioBruto);
        System.out.println("Valor desconto Imposto de Renda é de: " +impostoRenda);
        System.out.println("Valor desconto INSS: " +inss);
        System.out.println("Valor desconto Sindicato: " +sindicato);
        System.out.printf("Salário Líquido é de %.2f  ",salarioLiquido);

        input.close();

    }
}
