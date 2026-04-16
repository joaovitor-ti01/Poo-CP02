package br.com.FiapCp.Model;

public class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;

        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            this.capacidade = 0;
            System.out.println("Capacidade inválida.");
        }
    }

    public boolean suportaPeso(double peso) {
        return peso <= capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Capacidade inválida.");
        }
    }

    public boolean isValido() {
    return true;
}
}