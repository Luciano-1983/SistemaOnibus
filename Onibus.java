public class Onibus {
    private int id_onibus;
    private Rota rotaAtual;
    private String hora_estimada_chegada;
    private PosicaoEmTempoReal posicao;

    public Onibus(int id_onibus, Rota rotaAtual, String hora_estimada_chegada, PosicaoEmTempoReal posicao) {
        this.id_onibus = id_onibus;
        this.rotaAtual = rotaAtual;
        this.hora_estimada_chegada = hora_estimada_chegada;
        this.posicao = posicao;
    }

    // Getters e Setters
    public int getId_onibus() {
        return id_onibus;
    }

    public Rota getRotaAtual() {
        return rotaAtual;
    }

    public String getHora_estimada_chegada() {
        return hora_estimada_chegada;
    }

    public PosicaoEmTempoReal getPosicao() {
        return posicao;
    }
}