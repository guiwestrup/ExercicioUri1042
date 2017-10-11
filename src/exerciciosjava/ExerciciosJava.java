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
    public static void ordena(int num[])
    {
        boolean troca = true;
        while (troca) 
        {
                troca = false;

                for (int posicao = 0; posicao < (num.length)-1; posicao++)
                {
                        if (num[posicao] > num[posicao+1])
                        {
                                int variavelAuxiliar = num[posicao+1];
                                num[posicao+1] = num[posicao];
                                num[posicao] = variavelAuxiliar;
                                troca = true;
                        }
                }

        }
        for (int n=0;n<3;n++)
        {
            System.out.println(num[n]);
        }
        System.out.println();
    }
    public static void imprimi(int copia[])
    {
        for (int posicao = 0; posicao<3;posicao++)
        {
            System.out.println(copia[posicao]);
        }
    }
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
        ordena(num);
        imprimi(copia);
    }

}
