
public class Usuario {
    private int id_usuario;
    private String nome;
    private String email;
    private Endereco localizacao;

    public Usuario(int id_usuario, String nome, String email, Endereco localizacao) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public int getId_usuario() {
        return id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getLocalizacao() {
        return localizacao;
    }
}