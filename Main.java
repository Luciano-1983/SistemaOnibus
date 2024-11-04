public class Main {
    public static void main(String[] args) {
        // Criar objetos
        Endereco endereco = new Endereco(37.7749, -122.4194, "Rua 1", "123");
        Usuario usuario = new Usuario(1, "João", "joao@example.com", endereco);

        Rota rota = new Rota(1, endereco, new Endereco(37.7858, -122.4364, "Rua 2", "456"));
        Onibus onibus = new Onibus(1, rota, "10:00", new PosicaoEmTempoReal(1, 37.7858, -122.4364, "10:00"));

        GestorOnibus gestorOnibus = new GestorOnibus();
        gestorOnibus.adicionarOnibus(onibus);

        GestorRotas gestorRotas = new GestorRotas();
        gestorRotas.adicionarRota(rota);

        GestorUsuario gestorUsuario = new GestorUsuario();
        gestorUsuario.adicionarUsuario(usuario);

        // Exibir informações
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
        System.out.println("Ônibus: " + onibus.getId_onibus());
        System.out.println("Rota: " + rota.getId_rota());
        System.out.println("Posição em Tempo Real: " + onibus.getPosicao().getLatitude() + ", "
                + onibus.getPosicao().getLongitude());
    }
}