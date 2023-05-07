package Unid5Code1;

import javax.swing.*;

public class Unid5Code1 {

    public static void main(String[] args) {
        //declara x do tipo inteiro
        int x;
        //declara sx do tipo string
        String sx;
        //faz a leitura e grava em sx
        sx = JOptionPane.showInputDialog("Digite o valor de x");
        //converte sx(string)inteiro
        x = Integer.parseInt(sx);
        //mostra o resultado na janela gráfica.
        JOptionPane.showMessageDialog(null, "Valor de x: " + x);
    }
}
