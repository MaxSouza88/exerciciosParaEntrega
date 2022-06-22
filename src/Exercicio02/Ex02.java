package Exercicio02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Favor informar a primeira nota");
        double nota1 = input.nextDouble();

        System.out.println("Favor informar a segunda nota");
        double nota2 = input.nextDouble();

        System.out.println("Favor informar a terceira nota");
        double nota3 = input.nextDouble();

        System.out.println("Favor informar a quarta nota");
        double nota4 = input.nextDouble();

        input.close();

        double resultado = (nota1 + nota2 + nota3 + nota4) / 4 ;

        if(resultado >=7){
            System.out.println("Aluno passou de Ano");
        } else if (resultado >=5 && resultado<=6) {
            System.out.println("Aluno ficou de recuperação");
        }
        else {
            System.out.println("Aluno reprovado");
        }
        System.out.printf("A media do Aluno foi de " +resultado);

    }


}
