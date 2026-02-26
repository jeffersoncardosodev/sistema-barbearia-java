public class Agendamento {

    private Cliente cliente;
    private Servico servico;
    private String horario;

    public Agendamento(Cliente cliente, Servico servico, String horario){
        this.cliente = cliente;
        this.servico =  servico;
        this.horario = horario;
    }

    public void mostrarAgendamento(){
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Serviço: " + servico.getNome());
        System.out.println("Horário: " + horario);
        System.out.println("Valor: " + servico.getPreco());
        System.out.println("------------------------");
    }



}
