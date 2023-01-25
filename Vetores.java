package com.mycompany.vetores;

/*
 * Este programa tem como intuito, Exibir uma Matriz de várias maneiras.
 * Devem existir outras maneiras de exibir uma Matriz, mas acredito que as maneiras de exibição mostradas aqui, ja vão ajudar muitas pessoas.
 * Como o foco é exibir a Matriz, no código não é feito nenhum calculo de Matrizes.
 */

/**
 *
 * @author leoncio Silva
 */
public class Vetores
{
    public static void main(String[] args)
    {
        // Definindo as Variáveis e o tamanho da Matriz
        int matriz[][] = new int[9][9];
        int i, j;
        int n = 9;
        
        // Preenchendo os campos da Matriz com valor 0
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                matriz[i][j] = 0;
            }
        }
        
        
        //Exibindo a Matriz completa
        System.out.println("\nMatriz Completa");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Exibindo o Triangulo Superior
        System.out.println("Triangulo Superior");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if(i < j)
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Exibindo o Triangulo Inferior
        System.out.println("Triangulo Inferior");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if(i > j)
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Exibindo a Diagonal Principal da Matriz
        System.out.println("Diagonal Principal");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if(i == j)
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Diagonal Principal Oculta
        System.out.println("Matriz com diagonal Principal Oculta");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if(i != j)
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Diagonal secundária
        System.out.println("Diagonal Secundaria");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i + j) == (n - 1))
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Diagonal secundária Oculta
        System.out.println("Diagonal Secundaria Oculta");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i + j) != (n - 1))
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Triangulo Superior da Diagonal Secundária
        System.out.println("Triangulo Superior da Diagonal Secundária");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i + j) < (n - 1))
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Triangulo Inferior da Diagonal Secundária
        System.out.println("Triangulo Inferior da Diagonal Secundária");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i + j) > (n - 1))
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Diagonais Ocultas
        System.out.println("Diagonais Ocultas");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i == j) || (i + j) == (n - 1))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Exibindo somente as diagonais
        System.out.println("Exibindo somente as diagonais");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i == j) || (i + j) == (n - 1))
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Exibindo as casas pares da Matriz
        System.out.println("Exibindo as casas pares da Matriz");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i + j) % 2 == 0)
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        
        // Exibindo as casas impares da Matriz
        System.out.println("Exibindo as casas impares da Matriz");
        System.out.println("=================================================");
        for(i = 0; i < 9; i++)
        {
            for(j = 0; j < 9; j++)
            {
                if((i + j) % 2 == 1)
                {
                    System.out.print(matriz[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}