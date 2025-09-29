package Controllers;

import com.opencsv.bean.CsvBindByName;

import java.util.ArrayList;

public class Medicos extends Pessoa {

    @CsvBindByName(column = "id_medicos")
    private String id_medicos;

    @CsvBindByName(column = "Crm")
    private String crm;

    @CsvBindByName(column = "Especialidade")
    private String especialidade;

    @CsvBindByName(column = "CustoConsulta")
    private float custoConsulta;

    @CsvBindByName(column = "AgendaHorarios")
    private ArrayList<String> agendaHorarios;

    public Medicos(String nome, String cpf, String crm, String especialidade, float custoConsulta, ArrayList<String> agendaHorarios) {
        super(nome, cpf);
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

