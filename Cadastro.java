import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    BancoDeDados bancoDeDados = new BancoDeDados();
    Produtos produtos = new Produtos();
    Funcionarios funcionarios = new Funcionarios();


    void adicionarProdutos(){
        bancoDeDados.connect();
        produtos.createTable();
        List<String[]> produtos = new ArrayList<>();
        while(true) {
            String[] produto = {"", ""};
            System.out.println("Digite o nome do produto");
            produto[0] = scanner.nextLine();
            //saída do loop
            if (produto[0].equalsIgnoreCase("fim")) {
                break;

            }

            bancoDeDados.close();
        }
    }

    void lerProduto(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do produto a ser consultado: ");
        produtos.lerProduto(scanner.nextLine());
        bancoDeDados.close();

    }
    void deletarProduto(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do produto a ser deletado: ");
        produtos.deleteProduto(scanner.nextLine());
        bancoDeDados.close();
    }

    void adicionarFuncionario(){
        List<String[]> lista = new ArrayList<>();
        bancoDeDados.connect();
        funcionarios.createTable();
        while(true) {
            String[] funcionarios ={"", "", ""};
            System.out.println("Digite o nome do professor (ou fim para sair): ");
            funcionarios[0] = scanner.nextLine();

            if (funcionarios[0].equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite o numéro de telefone");
            funcionarios[1] = scanner.nextLine();
            System.out.println("Digite a data de contratação");
            funcionarios[2] = scanner.nextLine();
            lista.add(funcionarios);
        }
        funcionarios.inserirFuncionario(lista);
        bancoDeDados.close();
    }

    void lerFuncionario(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do funcionário a ser consultado: ");
        funcionarios.lerFuncionario(scanner.nextLine());
        bancoDeDados.close();
    }
    void deletarFuncionário(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do funcionário a ser deletado: ");
        funcionarios.deleteFuncionario(scanner.nextLine());
        bancoDeDados.close();
    }

    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir produto");
        System.out.println("2- Deletar produto");
        System.out.println("3- Consultar produto");
        System.out.println("4- Inserir funcionário");
        System.out.println("5- Consultar funcionário");
        System.out.println("6- Deletar funcionário");
        System.out.println("7- Sair");
    }
}
}

