/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosjava;

/**
 *
 * @author gui1_
 */
public class Ordena 
{
public static int[] ordena(int num[])
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
        return num;
    }
}
