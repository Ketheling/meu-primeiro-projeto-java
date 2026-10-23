/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioimc;

import java.util.Scanner;

/**
 *
 * @author RafaelKeth
 */
public class ExercicioIMC {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); 
      
      System.out.print("Digite seu peso:");
      int peso = entrada.nextInt();
      
      System.out.print("Digite sua altura");
      double altura = entrada.nextDouble();
      
      double imc = peso/(altura*altura);
      System.out.printf("Seu IMC é : %.2f", imc);
    }
}
