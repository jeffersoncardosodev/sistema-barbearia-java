public class Servico {

    private String nome;
    private String preco;

    public Servico(String nome, String preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public String getPreco(){
        return preco;
    }


}
