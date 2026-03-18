import dao.AgendamentoDAO;
import dao.ClienteDAO;
import dao.ServicoDAO;
import model.Agendamento;
import model.Cliente;
import model.Servico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Servico> servicos = new ArrayList<>();
    static ArrayList<Agendamento> agendamentos = new ArrayList<>();

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
                    cadastrarServico();
                    break;

                case 5:
                    listarServicos();
                    break;

                case 6:
                    agendar();
                    break;

                case 7:
                    listarAgendamentos();
                    break;

                case 8:
                    atualizarCliente();
                    break;

                case 9:
                    deletarCliente();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!!");
            }
        } while (opcao != 0);


    }

    private static void mostrarMenu() {
        System.out.println("\n===== BARBEARIA =====");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Buscar Clientes");
        System.out.println("4 - Cadastrar Servicos");
        System.out.println("5 - Listar Servicos");
        System.out.println("6 - Agendar");
        System.out.println("7 - Listar Agendamentos");
        System.out.println("8 - Atualizar Cliente");
        System.out.println("9 - Deletar Cliente");
        System.out.println("0 - Sair");
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

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();


        Cliente cliente = new Cliente(nome, telefone, email);

        ClienteDAO dao = new ClienteDAO();
        dao.salvar(cliente);

        System.out.println("model.Cliente cadastrado com sucesso!!");

    }

    private static void listarClientes(){
        ClienteDAO dao = new ClienteDAO();
        dao.listarClientes();

    }

    private static void buscarCliente(){
        // percorre a lista
        // compara com equalsIgnore case
        // se encontrar, mostra cliente
        // se nao encontrar mostra a mensagem

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
            System.out.println("model.Cliente nao encontrado!");
        }
    }

    private static void cadastrarServico(){
        System.out.println("Digite o nome do servico: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preco: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // limpar o buffer

        Servico servico = new Servico(nome, preco);

        ServicoDAO dao = new ServicoDAO();
        dao.salvarServico(servico);

    }

    private static void listarServicos(){
        if (servicos.isEmpty()){
            System.out.println("Nenhum servico cadastrado!");
            return;
        }
        for (Servico  servico : servicos){
            servico.exibirServico();
        }
    }

    private static void agendar(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== CLIENTES ====");
        listarClientes();

        System.out.println("Digite o ID do cliente: ");
        int clienteId = scanner.nextInt();

        System.out.println("==== SERVICOS ====");
        listarServicos();

        System.out.println("Digite o ID do servico: ");
        int servicoId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a data e hora: ");
        String horario = scanner.nextLine();


        AgendamentoDAO dao = new AgendamentoDAO();
        dao.salvarAgendamentos(clienteId, servicoId, horario);

        System.out.println("model.Agendamento realizado com sucesso!");


    }

    private static void listarAgendamentos(){
        if (agendamentos.isEmpty()){
            System.out.println("Nenhum agendamento encontrado!");
        }
        for (Agendamento agendamento : agendamentos){
            agendamento.mostrarAgendamento();
        }
    }

    private static void atualizarCliente(){

        System.out.println("Digite o ID do cliente:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Novo nome: ");
        String nome = scanner.nextLine();

        System.out.println("Novo telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Novo email: ");
        String email = scanner.nextLine();

        ClienteDAO dao = new ClienteDAO();
        dao.atualizarCliente(id, nome, telefone, email);

    }

    private static void deletarCliente(){

        System.out.println("Digite o ID do cliente para excluir: ");
        int id = scanner.nextInt();

        ClienteDAO dao = new ClienteDAO();
        dao.deletarCliente(id);

    }


}