package br.com.descomplica;


public class Cadastro {
    private String login;
    private String senha;
    private String nomeUsuario;

    public Cadastro(String login, String senha, String nomeUsuario) {
        this.login = login;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    
}
