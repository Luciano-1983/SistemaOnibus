public class Endereco {
    private double latitude;
    private double longitude;
    private String rua;
    private String numero;

    public Endereco(double latitude, double longitude, String rua, String numero) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.rua = rua;
        this.numero = numero;
    }

    // Getters e Setters
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }
}