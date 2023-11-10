package Models;


public class ProfessoresModel {

    private int id;
    private String Nome;
    private String Disciplina;
    private String email;
    private String telefone;
    private String DataContratacao;

    public ProfessoresModel() {
    }

    public ProfessoresModel(int id, String Nome, String Disciplina, String email, String telefone, String DataContratacao) {
        this.id = id;
        this.Nome = Nome;
        this.Disciplina = Disciplina;
        this.email = email;
        this.telefone = telefone;
        this.DataContratacao = DataContratacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
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

    public String getDataContratacao() {
        return DataContratacao;
    }

    public void setDataContratacao(String DataContratacao) {
        this.DataContratacao = DataContratacao;
    }

}
