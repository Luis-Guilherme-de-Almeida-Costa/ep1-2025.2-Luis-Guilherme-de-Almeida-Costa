package Controllers;

public class Internacao {

    private int idInternacao;

    private int pacienteId;

    private int medicoId;

    private String dataHora;

    private String local;

    private String status;

    private Double valorDoDesconto;

    private Double valorComOuSemDesconto = 1000.0;

    public Internacao(int idInternacao, int pacienteId, int medicoId, String dataHora, String local, String status, Double valorDoDesconto) {
        this.idInternacao = idInternacao;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.dataHora = dataHora;
        this.local = local;
        this.status = status;
        this.valorDoDesconto = valorDoDesconto;
        valorComOuSemDesconto *=  valorDoDesconto;
    }

    public Internacao(int idInternacao, int pacienteId, int medicoId, String dataHora, String local, String status) {
        this.idInternacao = idInternacao;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.dataHora = dataHora;
        this.local = local;
        this.status = status;
    }

    public String toCSV() {
        return this.idInternacao + "," + this.pacienteId + "," + this.medicoId + "," + this.dataHora + "," + this.local + "," + this.status + "," + valorComOuSemDesconto;
    }
}
