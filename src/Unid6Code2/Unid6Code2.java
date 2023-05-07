package Unid6Code2;

import java.io.*;

public class Unid6Code2 {
    public static void main(String[] args) {
        try {
            FileWriter canal = new FileWriter(new File("meuarquivo.txt"),

                    true);
            PrintWriter escreve = new PrintWriter(canal);
            escreve.println("Aqui tem um texto");
            escreve.println("Continuando o texto aqui........ ");
            escreve.close();
            canal.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}