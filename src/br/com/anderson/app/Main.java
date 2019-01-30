package br.com.anderson.app;

import java.util.Scanner;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.print("Digite sua idade: ");
        int idade = new Scanner(System.in).nextInt(); 

        String resultado = (idade >= 18) ? "adulto" : (idade <= 12) ? "crianca" : "adolescente";      
        
        System.out.println("Resultado: " + resultado);
    }
}
