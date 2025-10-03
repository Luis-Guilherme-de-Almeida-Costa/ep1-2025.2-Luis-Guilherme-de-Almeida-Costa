package Controllers;


import java.util.ArrayList;

public class Pacientes extends Pessoa{

    private int id_pacientes;

    private int idade;

    private String historicoConsultas;

    public Pacientes() {
    }

    public Pacientes(String nome, String cpf, int id_pacientes, int idade, String historicoConsultas) {
        super(nome, cpf);
        this.id_pacientes = id_pacientes;
        this.idade = idade;
        this.historicoConsultas = "";
    }

    public int getId_pacientes() {
        return id_pacientes;
    }

    public void setId_pacientes(int id_pacientes) {
        this.id_pacientes = id_pacientes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHistoricoConsultas() {
        return historicoConsultas;
    }

    public void setHistoricoConsultas(String historicoConsultas) {
        this.historicoConsultas = historicoConsultas;
    }

    public String toCSV() {
        return this.id_pacientes + "," + this.getNome() + "," + this.getCpf() + "," + this.idade + "," + this.historicoConsultas;
    }
}
