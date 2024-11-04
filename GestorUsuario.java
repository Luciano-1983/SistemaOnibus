import java.util.List;
import java.util.ArrayList;

public class GestorUsuario {
    private List<Usuario> listaUsuario;

    public GestorUsuario() { 
        this.listaUsuario = new ArrayList<>(); 
    }

    public void adicionarUsuario(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }
}
