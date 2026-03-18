package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try{
            String url = "jdbc:mysql://localhost:3306/barbearia_db";
            String usuario = "root";
            String senha = "******";

            Connection conn = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Banco conectado com sucesso!!");

            return conn;

        } catch (Exception e) {
            System.out.println("Erro na conexao: " + e);
            return null;
        }

    }

}
