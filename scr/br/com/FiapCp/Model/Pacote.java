package br.com.FiapCp.Model;

public class Pacote {
    private String codigo;
    private double peso;
    private String situacao;

    public Pacote(String codigo, double peso, String situacao) {
        this.codigo = codigo;

        if (peso > 0) {
            this.peso = peso;
        } else {
            this.peso = 0;
            System.out.println("Peso inválido.");
        }

        this.situacao = situacao;
    }

    public void atualizarSituacao(String novaSituacao) {
        this.situacao = novaSituacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido.");
        }
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}