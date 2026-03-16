package model;

public class Cliente {

    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Cliente(String nome, String telefone, String email){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void mostrarCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("-------------");
    }

}
