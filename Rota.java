public class Rota {
    private int id_rota;
    private Endereco ponto_inicial;
    private Endereco ponto_final;

    public Rota(int id_rota, Endereco ponto_inicial, Endereco ponto_final) {
        this.id_rota = id_rota;
        this.ponto_inicial = ponto_inicial;
        this.ponto_final = ponto_final;
    }

    // Getters e Setters
    public int getId_rota() {
        return id_rota;
    }

    public Endereco getPonto_inicial() {
        return ponto_inicial;
    }

    public Endereco getPonto_final() {
        return ponto_final;
    }
}