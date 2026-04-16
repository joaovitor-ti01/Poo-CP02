package br.com.FiapCp.Main;

import br.com.FiapCp.Model.Caminhao;
import br.com.FiapCp.Model.Moto;
import br.com.FiapCp.Model.Pacote;
import br.com.FiapCp.Model.Rota;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("ABC1234", 500.0, 4);
        Pacote pacote1 = new Pacote(-10.5, "BR999", "Pendente");
        Moto moto1 = new Moto("ACC1234", 500.0, true);
        Rota r = new Rota(pacote1, moto1);
        r.enviarPacote();
    }
}