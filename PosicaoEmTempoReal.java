public class PosicaoEmTempoReal {
    private int id_posicao;
    private double latitude;
    private double longitude;
    private String horario;

    public PosicaoEmTempoReal(int id_posicao, double latitude, double longitude, String horario) {
        this.id_posicao = id_posicao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.horario = horario;
    }

    // Getters e Setters
    public int getId_posicao() {
        return id_posicao;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getHorario() {
        return horario;
    }
}