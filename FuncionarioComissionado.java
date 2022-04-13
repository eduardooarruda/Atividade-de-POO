public final class FuncionarioComissionado extends Funcionario {
    private int qtdVendas;
    private double comissao;

    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario) {
    super(primeiro_nome, segundo_nome, salario);
    this.qtdVendas = 0;
    this.comissao = 0.0;
    }

    public void adicionarComissao(double valorVenda, int qtdVendas){
        this.comissao += 0.1 * valorVenda;
        this.qtdVendas += qtdVendas;
    }

    public double getComissao(){
        return this.comissao;
    }

    public int getQtdVendas(){
        return this.qtdVendas;
    }
    
    public double salarioTotal(){
        return getSalario() + getComissao();
    }
    



}
