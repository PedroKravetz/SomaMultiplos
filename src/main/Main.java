package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0, limite;
        Scanner input = new Scanner(System.in);
        while (numero <= 0) {
            System.out.println("Digite o número: ");
            numero = input.nextInt();
        }
        System.out.println("Digite o limite: ");
        limite = input.nextInt();
        System.out.println(somaInterativa(numero, limite));
        System.out.println(somaRecursiva(numero, numero, limite));
        input.close();
    }

    /**
     * Executa a soma dos múltiplos do número até o limite especificado recursivamente
     *
     * @param numero   int - O número que será incrementado para descobrir os múltiplos
     * @param controle int - O número constante que incrementará o numero para fazer todos os múltiplos
     * @param limite   int - O limite pelo qual o número poderá ser incrementado
     * @return int - A soma dos múltiplos ou 0 caso número seja maior que o limite
     */
    private static int somaRecursiva(int numero, int controle, int limite) {
        if (numero <= limite) {
            return numero + somaRecursiva(numero + controle, controle, limite);
        }
        return 0;
    }

    /**
     * Executa a soma dos múltiplos do número até o limite especificado iterativamente
     *
     * @param numero int - O número que será somados os múltiplos dele
     * @param limite int - O limite para qual o múltiplo do numero não pode passar
     * @return int - A soma dos múltiplos
     */
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