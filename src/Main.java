import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar Buffer

            switch (opcao){
                case 1:
                    cadastrarCliente();
                    break;

                case 2:
                    listarClientes();
                    break;

                case 3:
                    buscarCliente();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!!");
            }
        } while (opcao != 4);


    }

    private static void mostrarMenu() {
        System.out.println("\n===== BARBEARIA =====");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Buscar Clientes");
        System.out.println("4 - Sair");
        System.out.println("Escolha: ");
    }

    private static void cadastrarCliente(){
        // cria o objeto
        // adiciona na lista
        // mostra a mensagem de sucesso
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, telefone);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!!");

    }

    private static void listarClientes(){
        // percorre a lista
        // chama o mostrarCliente()
        if (clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado!");
            return;
        }
        for (Cliente cliente : clientes){
            cliente.mostrarCliente();
        }

    }

    private static void buscarCliente(){
        // percorre a lista
        // compara com equalsIgnore case
        // se encontrar, mostra cliente
        // se nao encontrar mostra a mensagem
        if (clientes.isEmpty()){
            System.out.println("Nenhum cliente encontrado!");
            return;
        }
        System.out.println("Digite o nome para buscar");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        for (Cliente cliente : clientes){
            if (cliente.getNome().equalsIgnoreCase(nomeBusca)){
                cliente.mostrarCliente();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente nao encontrado!");
        }
    }


}