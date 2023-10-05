package integracao;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public boolean autenticarUsuario(Usuario usuario) {
        if (usuario != null && usuario.nome != null && usuario.senha != null) {
            return this.nome.equals(usuario.nome) && this.senha.equals(usuario.senha);
        }
        return false;
    }
}
