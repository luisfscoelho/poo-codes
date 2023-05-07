package Unid6Code1;

import javax.swing.JOptionPane;

public class Unid6Code1V3 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        System.out.println("Testando uma exceção...");
        try {
//vamos tentar dividir um número por zero
            y = 3;
            z = 0;//troque o valor de z por 0 para testar
            x = y / z;
            JOptionPane.showMessageDialog(null, "O valor da divisão é " + x);
        } catch (Exception e) {
// Existindo uma exceção/erro ele é passado na variável e
            System.out.println("Ocorreu um erro no programa: " + e);
        } finally {
            System.out.println("Comando executado...");
        }
//Fazendo um teste da nossa exception
        System.out.println("=== Testando uma excetion ===");
        MinhaException teste10 = new MinhaException();
        teste10.TesteThrowNew();
//Fazendo a chamada de um método específico da Exception
        System.out.println("=== Testando uma chama de um método específico na Exception ===");
                ClasseExcecao ce = new ClasseExcecao();
        try {
            ce.valorMenorQueDez(9);
        } catch (MinhaException e) {
            System.out.println(e.valorDoParametro());
        }
    }
}