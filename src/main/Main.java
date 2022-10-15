package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, limite;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número: ");
        numero = input.nextInt();
        System.out.println("Digite o limite: ");
        limite = input.nextInt();
        System.out.println(somaInterativa(numero, limite));
        System.out.println(somaRecursiva(numero, numero, limite));
    }

    private static int somaRecursiva(int numero, int controle, int limite) {
        if (numero <= limite) {
            return numero + somaRecursiva(numero + controle, controle, limite);
        }
        return 0;
    }

    private static int somaInterativa(int numero, int limite) {
        int controle = numero;
        int soma = 0;
        while (numero <= limite) {
            soma += numero;
            numero += controle;
        }
        return (soma);
    }
}