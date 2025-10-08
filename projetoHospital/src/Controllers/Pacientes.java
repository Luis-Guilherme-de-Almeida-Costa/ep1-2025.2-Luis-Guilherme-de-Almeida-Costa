package Controllers;


import java.util.ArrayList;

public class Pacientes extends Pessoa{

    private int id_pacientes;

    private int idade;

    private String historicoConsultas;

    public Pacientes() {
    }

    public Pacientes(String nome, String cpf, int id_pacientes, int idade) {
        super(nome, cpf);
        this.id_pacientes = id_pacientes;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String toCSV() {
        return this.id_pacientes + "," + this.getNome() + "," + this.getCpf() + "," + this.idade;
    }
}
