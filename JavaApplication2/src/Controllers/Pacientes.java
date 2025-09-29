package Controllers;
import com.opencsv.bean.CsvBindByName;

import java.util.ArrayList;

public class Pacientes extends Pessoa {
    @CsvBindByName(column = "id_pacientes")
    private int id_pacientes;

    @CsvBindByName(column = "Idade")
    private int idade;

    @CsvBindByName(column = "HistoricoDeConsultas")
    private ArrayList<String> historicoConsultas;

    public Pacientes(String nome, String cpf, int id_pacientes, int idade, ArrayList<String> historicoConsultas) {
        super(nome, cpf);
        this.id_pacientes = id_pacientes;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>();
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
