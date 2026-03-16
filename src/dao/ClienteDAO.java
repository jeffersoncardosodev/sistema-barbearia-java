package dao;

import model.Cliente;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ClienteDAO {

    public void salvar(Cliente cliente) {

        String sql= "INSERT INTO clientes (nome, telefone, email) VALUES(?, ?, ?)";

        try {

            Connection conn = Conexao.conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());

            stmt.executeUpdate();

            System.out.println("model.Cliente salvo com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar o cliente: " + e);
        }

    }

    public void listarClientes() {

        String sql = "SELECT * FROM clientes";

        try {

            Connection conn = Conexao.conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("Telefone");
                String email = rs.getString("email");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Telefone: " + telefone);
                System.out.println("Email: " + email);
                System.out.println("============================");

            }

        } catch (Exception e) {
            System.out.println("Erro ao listar clientes " + e);
        }

    }

    public void atualizarCliente(int id, String nome, String telefone, String email) {

        String sql = "UPDATE clientes SET nome = ?, telefone = ?, email = ? WHERE id = ?";

        try {

            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, email);
            stmt.setInt(4, id);

            int linhas = stmt.executeUpdate();

            if (linhas > 0){
                System.out.println("model.Cliente atualizado com sucesso!");
            } else {
                System.out.println("model.Cliente nao encontrado!");
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar o cliente: " + e);
        }

    }

    public void deletarCliente(int id) {

        String sql = "DELETE FROM clientes WHERE id = ?";

        try {

            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            int linhas = stmt.executeUpdate();

            if (linhas > 0){
                System.out.println("model.Cliente deletado com sucesso!!");
            } else {
                System.out.println("model.Cliente nao encontrado!!");
            }


        } catch (Exception e) {
            System.out.println("Erro ao deletar o cliente: " + e);
        }

    }

}
