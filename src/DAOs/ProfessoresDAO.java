package DAOs;

import Conexao.ConexaoSQL;
import Models.ProfessoresModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfessoresDAO {

    public void CadastrarProfessores(ProfessoresModel pm) {

        String sql = "INSERT INTO Professores (Nome,Disciplina,Email,Telefone,DataContratacao) VALUES (?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = ConexaoSQL.conexaoMySQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, pm.getNome());
            ps.setString(2, pm.getDisciplina());
            ps.setString(3, pm.getEmail());
            ps.setString(4, pm.getTelefone());
            ps.setString(5, pm.getDataContratacao());

            ps.execute();

            ps.close();

            JOptionPane.showMessageDialog(null, "Professor(a) cadastrado(a) com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

    public List<ProfessoresModel> ShowProfessores() {

        String sql = "SELECT * FROM Professores";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<ProfessoresModel> pms = new ArrayList<>();

        try {

            connection = ConexaoSQL.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                ProfessoresModel pm = new ProfessoresModel();

                pm.setId(resultSet.getInt("id"));
                pm.setNome(resultSet.getString("Nome"));
                pm.setDisciplina(resultSet.getString("Disciplina"));
                pm.setEmail(resultSet.getString("Email"));
                pm.setTelefone(resultSet.getString("Telefone"));
                pm.setDataContratacao(resultSet.getString("DataContratacao"));

                pms.add(pm);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em Mostrar Professor(a): " + e);

        }
        return pms;
    }

    public void UpdateProfessores(ProfessoresModel pm) {

        String sql = "UPDATE Professores SET Nome=?, Disciplina=?, Email=?, Telefone=?,DataContratacao =?  WHERE id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoSQL.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, pm.getNome());
            preparedStatement.setString(2, pm.getDisciplina());
            preparedStatement.setString(3, pm.getEmail());
            preparedStatement.setString(4, pm.getTelefone());
            preparedStatement.setString(5, pm.getDataContratacao());
            preparedStatement.setInt(6, pm.getId());

            preparedStatement.execute();
            preparedStatement.close();

            JOptionPane.showMessageDialog(null, "Professor(a) atualizado(a) com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();
        }

    }

    public void DeletarProfessores(int id) {

        String sql = "DELETE FROM Professores WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = ConexaoSQL.conexaoMySQL();
            ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();

            ps.close();

            JOptionPane.showMessageDialog(null, "Professor(a) deletado(a) com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em deletar Professor(a): " + e);

        }

    }

}
