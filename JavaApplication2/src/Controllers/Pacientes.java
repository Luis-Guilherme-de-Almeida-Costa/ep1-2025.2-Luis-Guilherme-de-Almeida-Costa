package Controllers;
import com.opencsv.bean.CsvBindByName;

import java.util.ArrayList;

public class Pacientes extends Pessoa{

    @CsvBindByName(column = "PlanoDeSaude")
    private boolean planoSaude = false;

    @CsvBindByName(column = "Idade")
    private int idade;

    @CsvBindByName(column = "HistoricoDeConsultas")
    private ArrayList<String> historicoConsultas;

    public Pacientes(String nome, String cpf, boolean planoSaude, int idade, ArrayList<String> historicoConsultas) {
        super(nome, cpf);
        this.planoSaude = planoSaude;
        this.idade = idade;
        this.historicoConsultas = historicoConsultas;
    }

    public boolean isPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(boolean planoSaude) {
        this.planoSaude = planoSaude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public void setHistoricoConsultas(ArrayList<String> historicoConsultas) {
        this.historicoConsultas = historicoConsultas;
    }
}
