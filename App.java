public class App{
    public static void main(String[] agrs){
        FuncionarioComissionado f = new FuncionarioComissionado("Eduardo", "Arruda", 3000);

        f.adicionarComissao(1000);
        f.adicionarComissao(5000);
        f.adicionarComissao(100000);

        System.out.println(f.salarioTotal());
        System.out.printf("Foram vendidos %d produtos.",f.getQtdVendas());
    }
}