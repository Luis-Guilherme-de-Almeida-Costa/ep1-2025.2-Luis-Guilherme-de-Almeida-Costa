package Controllers;


import java.util.ArrayList;

public class Medicos extends Pessoa {

    private int id_medicos;

    private String crm;

    private String especialidade;

    private float custoConsulta;

    private ArrayList<String> agendaHorarios;

    public Medicos(String nome, String cpf, int id_medicos, String crm, String especialidade, float custoConsulta, ArrayList<String> agendaHorarios) {
        super(nome, cpf);
        this.id_medicos = id_medicos;
        this.crm = crm;
        this.especialidade = especialidade;
        this.custoConsulta = custoConsulta;
        this.agendaHorarios = agendaHorarios;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<String> getAgendaHorarios() {
        return agendaHorarios;
    }

    public void setAgendaHorarios(ArrayList<String> agendaHorarios) {
        this.agendaHorarios = agendaHorarios;
    }

    public float getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(float custoConsulta) {
        this.custoConsulta = custoConsulta;
    }
}

