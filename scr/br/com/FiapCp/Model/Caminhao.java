package br.com.FiapCp.Model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);

        if (eixos > 0) {
            this.eixos = eixos;
        } else {
            this.eixos = 0;
            System.out.println("Número de eixos inválido.");
        }
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos > 0) {
            this.eixos = eixos;
        } else {
            System.out.println("Número de eixos inválido.");
        }
    }

@Override
    public boolean isValido() {
        return eixos > 0;
    }
}