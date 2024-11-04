import java.util.List;
import java.util.ArrayList;

public class GestorOnibus {
    private List<Onibus> listaOnibus;

    public GestorOnibus() {
        this.listaOnibus = new ArrayList<>();
    }

    public void adicionarOnibus(Onibus onibus) {
        listaOnibus.add(onibus);
    }

    public List<Onibus> getListaOnibus() {
        return listaOnibus;
    }
}