/*
Desafios TQI - Java
3 / 5 - Distância Entre Dois Pontos

 Avançado
 Princípios Básicos


Desafio
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, conforme a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

 
Exemplo de Entrada	Exemplo de Saída
1.0 7.0
5.0 9.0

4.4721

-2.5 0.4
12.1 7.3

16.1484

2.5 -0.4
-12.2 7.0

16.4575



*/

// implemente sua solução aqui

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        double distancia, X1, X2, Y1, Y2;
        String[] linha1;
        String[] linha2;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            //quebra string em várias substrings a partir de um caracter
            linha1 = scan.nextLine().split(" ");
            linha2 = scan.nextLine().split(" ");


            X1 = Double.parseDouble(linha1[0]);
            Y1 = Double.parseDouble(linha1[1]);
            X2 = Double.parseDouble(linha2[0]);
            Y2 = Double.parseDouble(linha2[1]);

//        //System.out.println("Entre com a coordenada X1: ");
//        double X1 = scan.nextDouble();
//        //System.out.println("Entre com a coordenada Y1: ");
//        double Y1 = scan.nextDouble();
//        //System.out.println("Entre com a coordenada X2: ");
//        double X2 = scan.nextDouble();
//        //System.out.println("Entre com a coordenada Y2: ");
//        double Y2 = scan.nextDouble();

            distancia = Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));

            System.out.printf("%.4f", distancia);
            
            return;
        }
    }
}