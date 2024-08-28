package org.example;

import org.example.buscabinaria.BuscaBinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        BuscaBinaria buscaBinaria = new BuscaBinaria();

        System.out.println("Entre com o nome que deseja buscar");
        String nome = ler.next();

        System.out.println("O nome é " + buscaBinaria.getBuscaBinaria(nome));
    }



}