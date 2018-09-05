package br.com.s2it.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eight {
    /*
        8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes
        regras:
        - O primeiro número de C é o primeiro número de A;
        - O segundo número de C é o primeiro número de B;
        - O terceiro número de C é o segundo número de A;
        - O quarto número de C é o segundo número de B;
        Assim sucessivamente...
        - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
        dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
        - Caso C seja maior que 1.000.000, retornar -1
        Desenvolva um algoritmo que atenda a todos os requisitos acima.

     */
    public static Integer concatByPosition(Integer a, Integer b) {
        var aString = a.toString();
        var bString = b.toString();

        if ((aString + bString).length() < 7) {
            var strBuilder = new StringBuilder();
            var length = aString.length() >= bString.length() ? aString.length() : bString.length();
            for (var i = 0; i < length; i++) {
                if (i < aString.length()) {
                    strBuilder.append(aString.charAt(i));
                }
                if (i < bString.length()) {
                    strBuilder.append(bString.charAt(i));
                }
            }
            return Integer.valueOf(strBuilder.toString());
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        try {
            System.out.println("Entre com o valor de A");
            a = in.nextInt();
            System.out.println("Entre com o valor de B");
            b = in.nextInt();
            System.out.println("Resposta: "+Eight.concatByPosition(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Os valores digitados devem ser numeros inteiros");
        }
    }


}
