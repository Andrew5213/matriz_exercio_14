package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] mat = {//aqui temos a matriz que sera utilizada
                {1, 1, 1, 2, 2, 2},
                {3, 1, 1, 2, 2, 2},
                {3, 1, 1, 1, 2, 2},
                {3, 3, 3, 3, 2, 2},
                {3, 3, 3, 3, 1, 2},
                {4, 3, 4, 1, 1, 1},
                {4, 4, 4, 3, 1, 1}};

        int linha = 6;
        //este x e a linha da matriz
        int coluna = 5;
        //este y e a coluna da matriz
        //aqui estamos chamando a função recursiva
        matRec(linha, coluna, 1, 5, mat);
        //quando passamos o Cvelho  estamos passando o valor real que esta dentro da matriz


    }

    //agora vamos preencer a matriz



    public static void matRec(int x, int y, int Cvelho, int Cnovo, int [][] matriz){ //Cvelho e  o valor que estava antes e c novo e o valor trocado

//to string vai imprimir a matriz

        toString(matriz);
        if(x < matriz.length && x > 0){
            if(y < matriz[0].length && y > 0){//comecamos na posição 0 e vai ate a ultima
                if(matriz[x][y] == Cvelho){//verifica se oque esta na posição indicada e igual o cAnt e se nao for igual a opraçao nao ocorre

                    matriz[x][y] = Cnovo;//aqui mudamos o elemento anterior da matriz
                    //apartir daqui vamos comecar a recursão mudando os  elementos da matriz
                    matRec(x, y + 1, Cvelho, Cnovo, matriz);
                    matRec(x, y - 1, Cvelho, Cnovo, matriz);
                    matRec(x - 1, y, Cvelho, Cnovo, matriz);
                    matRec(x + 1, y, Cvelho, Cnovo, matriz);
                }
            }
        }
    }
    //esse aqui e para imprimir

    public static void toString(int[][] matriz){
        System.out.print("\n ---------------------\n");
        for(int i=0; i<matriz.length;i++){
            System.out.print(" | ");
            for(int j =0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.print("\n ---------------------\n");
        }
    }


}
