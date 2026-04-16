package br.com.FiapCp.Model;

public class Rota {
    public Pacote pacote;
    public Veiculo veiculo;
    private double peso;
    private int capacidade;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void enviarPacote() {
        if (pacote.getPeso() <= veiculo.getCapacidade()) {
            System.out.println("Levando " + pacote.getCodigo() + " no veiculo " + veiculo.getPlaca());
        } else System.out.println("Insira um peso/capacidade válido");
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