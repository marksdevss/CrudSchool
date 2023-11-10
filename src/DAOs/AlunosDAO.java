package DAOs;

import Models.AlunosModel;
import Conexao.ConexaoSQL;

import javax.swing.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunosDAO {

    public void CadastrarAlunos(AlunosModel am) {

        String sql = "INSERT INTO Alunos (Nome,DataNascimento,Email,Telefone,Endereco,Turma) VALUES (?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = ConexaoSQL.conexaoMySQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, am.getNome());
            ps.setString(2, am.getDataNascimento());
            ps.setString(3, am.getEmail());
            ps.setString(4, am.getTelefone());
            ps.setString(5, am.getEndereco());
            ps.setString(6, am.getTurma());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

    public List<AlunosModel> ShowAlunos() {

        String sql = "SELECT * FROM Alunos";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<AlunosModel> al = new ArrayList<>();

        try {

            connection = ConexaoSQL.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                AlunosModel am = new AlunosModel();

                am.setId(resultSet.getInt("id"));
                am.setNome(resultSet.getString("Nome"));
                am.setEndereco(resultSet.getString("Endereco"));
                am.setDataNascimento(resultSet.getString("DataNascimento"));
                am.setEmail(resultSet.getString("Email"));
                am.setTelefone(resultSet.getString("Telefone"));
                am.setTurma(resultSet.getString("Turma"));

                al.add(am);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return al;
    }

    public void DeletarAlunos(int am) {

        
        int id = 0;
        
        String sql = "DELETE FROM Alunos WHERE id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoSQL.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em deletar Aluno: " + e);

        }

    }

}
