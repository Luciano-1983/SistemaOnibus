import java.util.List;
import java.util.ArrayList;

public class GestorRotas {
    private List<Rota> listaRotas;

    public GestorRotas() {
        this.listaRotas = new ArrayList<>();
    }

    public void adicionarRota(Rota rota) {
        listaRotas.add(rota);
    }

    public List<Rota> getListaRotas() {
        return listaRotas;
    }
}