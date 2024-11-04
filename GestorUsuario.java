import java.util.List;
import java.util.ArrayList;

public class GestorUsuario {
    private List<Usuario> listaUsuario;

    public GestorUsuario() { // Corrigido aqui
        this.listaUsuario = new ArrayList<>(); // Corrigido aqui
    }

    public void adicionarUsuario(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }
}