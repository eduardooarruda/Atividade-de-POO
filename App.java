import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
    

        while(true){
            App.menu();
            int opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Este funcionario e comissionado? 1 - SIM 2 - NAO");
                    opcao = sc.nextInt();
                    System.out.println("Insira o primeiro nome:");
                    String primeiroNome = sc.next();
                    System.out.println("Insira o segundo nome:");
                    String segundoNome = sc.next();
                    System.out.println("Insira o salario:");
                    double salario = sc.nextDouble();

                    if(opcao == 1){
                        System.out.println("Insinara a quantidade total de itens vendidos: ");
                        int qtdVendas = sc.nextInt();
                        System.out.println("Insinara o valor total de itens vendidos: ");
                        double valorVenda = sc.nextDouble();

                        funcionario.add(new FuncionarioComissionado(primeiroNome, segundoNome, salario));

                        funcionario.get(funcionario.size()-1);
                    }
                    else if(opcao == 2){
                        funcionario.add(new Funcionario(primeiroNome, segundoNome, salario));
                    }
                    break;
                case 2:
                    System.out.println("Insira o ID do funcionario: ");
                    int id = sc.nextInt();
                    System.out.println(funcionario.get(id));
            }

            System.out.println("Deseja continuar? 1 - Sim 2- Nao");
            opcao = sc.nextInt();

            if(opcao == 2){
                break;
            }

        }
        
    }

    public static void menu(){
         System.out.println("1 - inserir funcionario\n"+ 
                            "2 - mostrar dados do funcionario\n");
    }
}