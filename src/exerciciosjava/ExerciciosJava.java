/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gui1_
 */
public class ExerciciosJava 
{
    private Ordena ordena;
    private Imprime imprimi;
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int num[] = new int[3];
        int copia[] = new int[3];
        for (int n=0; n<3;n++)
        {
            num[n] = input.nextInt();
            copia[n] = num[n];
        }
        Ordena.ordena(num);
        Imprime.imprimi(num);
        System.out.println();
        Imprime.imprimi(copia);
    }
}
