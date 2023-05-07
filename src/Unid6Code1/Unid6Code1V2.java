package Unid6Code1;

import javax.swing.JOptionPane;

public class Unid6Code1V2 {

    public static void main(String[] args) {
        int x;
        int y;
        int z;
        System.out.println("Testando uma exceção...[Unid6Code1V2]");
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
//Fazendo um teste da nossa exection
        System.out.println("=== Testanto uma excetion ===");
        MinhaException teste10 = new MinhaException();
        teste10.TesteThrowNew();
    }
}
