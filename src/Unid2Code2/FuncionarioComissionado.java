package Unid2Code2;

public class FuncionarioComissionado extends Funcionario{
    private double comissao;
    private int quantidadeVendida;

    public FuncionarioComissionado( String nome,
                                    String sobrenome,
                                    double salario, double comissao){
        super.funcionario(nome, sobrenome, salario);
        this.comissao = comissao;
    }
    public double calcPagamento(){
        return (getSalario() + (comissao * this.quantidadeVendida));
    }
    public void vendeu(int qtdVendida){
        this.quantidadeVendida = this.quantidadeVendida + qtdVendida;
    }
    public void zeraVendas(){
        this.quantidadeVendida = 0;
    }
}