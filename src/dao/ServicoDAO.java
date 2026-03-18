package dao;

import model.Servico;

import java.sql.Connection;
import database.Conexao;
import java.sql.PreparedStatement;

public class ServicoDAO {

    public void salvarServico(Servico servico) {

        String sql = "INSERT INTO servicos (nome, preco) VALUES (?, ?)";

        try {

            Connection conn = Conexao.conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, servico.getNome());
            stmt.setDouble(2, servico.getPreco());

            stmt.executeUpdate();

            System.out.println("Servico salvo no banco com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar o servico: " + e);
        }


    }


}
