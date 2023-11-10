package Models;

public class AdminModel {

    private int id_adm;

    private String usuario;

    private String senha;

    public AdminModel() {
    }

    public AdminModel(int id_adm, String usuario, String senha) {
        this.id_adm = id_adm;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId_adm() {
        return id_adm;
    }

    public void setId_adm(int id_adm) {
        this.id_adm = id_adm;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
