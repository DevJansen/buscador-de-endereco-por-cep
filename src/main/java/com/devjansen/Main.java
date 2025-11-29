package com.devjansen;

import com.devjansen.controller.ConsultaCep;
import com.devjansen.model.Endereco;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static final String RESET = "\u001B[0m";
    static final String CYAN = "\u001B[36m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String RED = "\u001B[31m";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(GREEN + "***********************************" + RESET);
        System.out.println(GREEN + "******* " +RESET+ "Buscado De Endereço" +GREEN+ " *******");
        System.out.println(GREEN + "***********************************"+ RESET);
        System.out.println(" ");
        System.out.println("Digite o CEP para ser consultado: ");
        String cep = sc.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco endereco = consultaCep.buscaEndereco(cep);

        System.out.println(endereco);


    }
}