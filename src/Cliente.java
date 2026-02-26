public class Cliente {

    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void mostrarCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("-------------");
    }

}
