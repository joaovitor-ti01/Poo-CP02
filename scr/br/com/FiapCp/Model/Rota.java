package br.com.FiapCp.Model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote != null && veiculo != null) {
            this.pacote = pacote;
            this.veiculo = veiculo;
        } else {
            System.out.println("Pacote e veículo são obrigatórios.");
        }
    }

public void enviarPacote() {

    System.out.println("\n===== PROCESSO DE ENTREGA =====");

    if (pacote == null || veiculo == null) {
        System.out.println("[ERRO] Dados inválidos.");
        return;
    }

    if (!veiculo.isValido()) {
        System.out.println("[ERRO] Veículo inválido. Entrega cancelada.");
        return;
    }

    if (pacote.getPeso() <= 0) {
        System.out.println("[ERRO] Peso inválido. Entrega cancelada.");
        return;
    }

    System.out.println("[PACOTE]");
    System.out.println("Código: " + pacote.getCodigo());
    System.out.println("Peso: " + pacote.getPeso());
    System.out.println("Situação antes: " + pacote.getSituacao());

    System.out.println("\n[VEÍCULO]");
    System.out.println("Placa: " + veiculo.getPlaca());
    System.out.println("Capacidade: " + veiculo.getCapacidade());
    System.out.println("Tipo: " + veiculo.getClass().getSimpleName());

    if (veiculo.suportaPeso(pacote.getPeso())) {
        pacote.atualizarSituacao("Enviado");

        System.out.println("\n[SUCESSO] Entrega realizada.");
        System.out.println("Situação depois: " + pacote.getSituacao());
    } else {
        System.out.println("\n[ERRO] Peso excede a capacidade do veículo.");
    }

    System.out.println("===== FIM =====\n");
}

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
