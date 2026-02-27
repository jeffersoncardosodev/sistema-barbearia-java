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
        System.out.println("7 = Listar Agendamentos");
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

    private static void cadastrarServico(){
        System.out.println("Digite o nome do servico: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preco: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // limpar o buffer

        Servico servico = new Servico(nome, preco);
        servicos.add(servico);

        System.out.println("Servico cadastrado com sucesso!!");

    }

    public static void listarServicos(){
        if (servicos.isEmpty()){
            System.out.println("Nenhum servico cadastrado!");
            return;
        }
        for (Servico  servico : servicos){
            servico.exibirServico();
        }
    }

    public static void agendar(){
        if (clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado!");
            return;
        }

        if (servicos.isEmpty()){
            System.out.println("Nenhum servico cadastrado!");
            return;
        }
        System.out.println("Escolha o cliente: ");
        for (int i = 0; i < clientes.size(); i++){
            System.out.println((i + 1) + "-" + clientes.get(i).getNome());
        }
        int indiceCliente = scanner.nextInt() - 1;
        scanner.nextLine();
        Cliente clienteEscolhido = clientes.get(indiceCliente);

        System.out.println("Escolha o servico:");

        for (int i = 0; i < servicos.size(); i++){
            System.out.println((i + 1) + "-" + servicos.get(i).getNome());
        }

        int indiceServico = scanner.nextInt() - 1;
        scanner.nextLine();

        Servico servicoEscolhido = servicos.get(indiceServico);

        System.out.println("Digite o Horario: ");
        String horario = scanner.nextLine();

        Agendamento agendamento = new Agendamento(clienteEscolhido, servicoEscolhido, horario);
        agendamentos.add(agendamento);

        System.out.println("Agendamento realizado com sucesso!");


    }

    public static void listarAgendamentos(){
        if (agendamentos.isEmpty()){
            System.out.println("Nenhum agendamento encontrado!");
        }
        for (Agendamento agendamento : agendamentos){
            agendamento.mostrarAgendamento();
        }
    }


}