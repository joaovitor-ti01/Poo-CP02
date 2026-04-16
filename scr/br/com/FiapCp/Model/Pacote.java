package br.com.FiapCp.Model;

public class Pacote {
    private String codigo;
    private double peso;
    private String situacao;

    public Pacote(double peso, String codigo, String situacao) {
        this.peso = peso;
        this.codigo = codigo;
        this.situacao = situacao;
    }


    public void muda(String situacao, String x) {
        situacao = x;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
