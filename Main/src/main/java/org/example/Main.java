package org.example;

import org.example.buscabinaria.BuscaBinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        BuscaBinaria buscaBinaria = new BuscaBinaria();

        System.out.println("Entre com o nome que deseja pesquisar e com o numero");
        String numero = ler.nextLine();

        System.out.println("O nome é " + buscaBinaria.getBuscaBinaria(numero));
    }



}