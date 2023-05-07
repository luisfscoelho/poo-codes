package Unid2Code1;

public class Unid2Code1 {
    public void debug(String mensagem){
        print("DEBUG", mensagem);
    }
    public void info(String mensagem){
        print("INFO", mensagem);
    }
    public void warning(String mensagem){
        print("WARNING", mensagem);
    }
    public void error(String mensagem){
        print("ERROR", mensagem);
    }
    public void fatal(String mensagem){
        print("FATAL", mensagem);
        System.exit(0);
    }
    private void print(String severidade, String mensagem){
        System.out.println(severidade + " : " + mensagem);
    }
    public static void main(String[] args) {
        // Cria um objeto "log" para faz os logs da aplicação
        Unid2Code1 log = new Unid2Code1();
        log.debug("Debugando...");
    }
}