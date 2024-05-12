package controller;

import java.util.Locale;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

/**
 * <h1>Desafio Lab DIO Trilha Java Basico</h1>
 * 
 *  <p>- Coletar 2 parâmetros inteiros do usuário; </p>
 * 
 *  <p>- Validar qual é o maior parâmetro, seguindo as condições: </p>
 * 
 *  <p> a) Se o parâmetro1 for MAIOR que o parâmetro2, lançar excessão 
 * personalizada ParametrosInvalidosException;</p>
 * 
 *  <p> b) Se o parâmetro2 for maior que o parâmetro1, subtrair 
 * parâmetro2 de parâmetro1 e gerar contagem de 1 até o valor 
 * resultado da subtração efetuada.</p>
 */

public class Contador {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro:");
        int parametro1 = scan.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametro2 = scan.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("--- Necessário que o parâmetro 1 seja MENOR que o parâmetro 2 ---");
        }

        scan.close();
    }

    public static void contar( int parametro1, int parametro2 ) throws ParametrosInvalidosException{
        // validar se parametro1 é MAIOR que parametro2. Se for, lançar exceção:
        if ( parametro1 > parametro2 ) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;
        System.out.println("Cálculo para a contagem:");
        System.out.printf("%d - %d = %d \n", parametro2, parametro1, contagem);
        System.out.println("Atenção para a contagem:");
        for ( int contador = 1 ; contador <= contagem ; contador ++ ) {
            System.out.println( contador );
        }
        System.out.println("Fim da contagem!");
    }

}
