package Unid6Code1;

public class ClasseExcecao {
    void valorMenorQueDez(int x) throws
            MinhaException {
        if (x
                < 10) {
            throw new MinhaException();
        }
    }
}
