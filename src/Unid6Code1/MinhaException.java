package Unid6Code1;

import java.util.Scanner;
public class MinhaException extends Exception {
    private static final long serialVersionUID = 1L;
    public MinhaException() {
        super();
    }
    public MinhaException(String e) {
        super(e);
    }
    //podemos executar um método específico durante um exception
    public String valorDoParametro(){
        return "Valor menor do que o solicitado";
    }
    public void TesteThrowNew() {
        Scanner scan = new Scanner(System.in); // Lê uma entrada digitada
        System.out.print("ThrowNew - Digite um número inteiro: ");
        int i = scan.nextInt();
        try {
            if (i > 10) {
                throw new MinhaException("Valor maior que 10");
            } else {
                System.out.println("Número aceito.");
            }
        } catch (MinhaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bloco finalizado.");
        }
    }
}