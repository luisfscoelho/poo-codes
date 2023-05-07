package Unid6Code3;

import java.io.*;

public class Unid3Code3 {
    public static void main(String[] args) {
        try{
            //o arquivo "meuarquivo.txt" deve existir na raiz do seu projeto
            BufferedReader le = new BufferedReader(new FileReader("meuarquivo.txt"));
            String linha = "";
            while (linha != null){
                linha = le.readLine();
                System.out.println(linha);
            }
            le.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
