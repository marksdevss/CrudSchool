package Models;

import java.sql.Date;

public class AlunosModel {

    private int id;
    private String nome;
    private String DataNascimento;
    private String email;
    private String telefone;
    private String endereco;
    private String Turma;

    public AlunosModel() {
    }

    public AlunosModel(int id, String nome, String DataNascimento, String email, String telefone, String endereco, String Turma) {
        this.id = id;
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.Turma = Turma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

}
