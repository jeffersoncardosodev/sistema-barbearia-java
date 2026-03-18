package dao;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AgendamentoDAO {

    public void salvarAgendamentos(int clienteId, int servicoId, String data) {

        String sql = "INSERT INTO agendamentos(cliente_id, servico_id, data_agendamento) VALUES (?, ? ,?)";


        try {

            Connection conn = Conexao.conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, clienteId);
            stmt.setInt(2, servicoId);
            stmt.setTimestamp(3, java.sql.Timestamp.valueOf(data));

            stmt.executeUpdate();

            System.out.println("Agendamendo salvo com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar agendamento: " + e.getMessage());
        }

    }

}
