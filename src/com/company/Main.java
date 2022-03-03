package com.company;
/*Faça um programa para ler o valor de compra, o valor de venda e dias para a validade
do produto. O programa deve alertar se o produto está com o preço acima da faixa,
está na faixa ou abaixo da faixa, seguindo a seguinte regra:
Você deve calcular a porcentagem do acréscimo do produto e usar a data de valida
como ajuste de regra.
Se o acréscimo for maior que 10% e a data de validade menor que 15 dias, informar
que o produto está com lucro acima da faixa.
Se o acréscimo for menor que 25% e validade for maior que 15 dias, informar que o
produto está com o lucro abaixo da faixa.
Em todos os outros casos, o informar que está dentro da faixa. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dígite o valor de compra");
        double valor_compra = scanner.nextDouble();
        System.out.println("Dígite o valor de venda");
        double valor_venda = scanner.nextDouble();
        System.out.println("Dígite quantos dias faltam de validade");
        int validade = scanner.nextInt();

        if( valor_venda > 1.1* valor_compra && validade < 15  ){
            System.out.println("Produto com lucro acima da Faixa");
        }else if(valor_venda < 1.25* valor_compra && validade > 15  ){
            System.out.println("Produto com lucro abaixo da Faixa");
        }else{
            System.out.println("Produto com lucro dentro da faixa");
        }

    }

}