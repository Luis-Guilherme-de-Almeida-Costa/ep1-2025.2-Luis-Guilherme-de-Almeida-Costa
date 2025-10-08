package Controllers;

public class Consultas {
    private int idConsultas;

    private int pacienteId;

    private int medicoId;

    private String dataHora;

    private String local;

    private String status;

    private Double valorDescontado;

    public Consultas(int idConsultas, int pacienteId, int medicoId, String dataHora, String local, String status, Double valorDescontado) {
        this.idConsultas = idConsultas;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.dataHora = dataHora;
        this.local = local;
        this.status = status;
        this.valorDescontado = valorDescontado;
    }

    public String toCSV() {
        return this.idConsultas + "," + this.pacienteId + "," + this.medicoId + "," + this.dataHora + "," + this.local + "," + this.status + "," + this.valorDescontado;
    }
}
