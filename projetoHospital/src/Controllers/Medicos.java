package Controllers;


import java.util.ArrayList;

public class Medicos extends Pessoa {

    private int id_medicos;

    private String crm;

    private String especialidade;

    private float custoConsulta;

    private String agendaHorarios;

    public Medicos(String nome, String cpf, int id_medicos, String crm, String especialidade, float custoConsulta, String agendaHorarios) {
        super(nome, cpf);
        this.id_medicos = id_medicos;
        this.crm = crm;
        this.especialidade = especialidade;
        this.custoConsulta = custoConsulta;
        this.agendaHorarios = agendaHorarios;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String toCSV() {
        return this.id_medicos + "," + this.getNome() + "," + this.getCpf() + "," + this.crm + "," + this.especialidade + "," + this.custoConsulta + "," + this.agendaHorarios;
    }
}

