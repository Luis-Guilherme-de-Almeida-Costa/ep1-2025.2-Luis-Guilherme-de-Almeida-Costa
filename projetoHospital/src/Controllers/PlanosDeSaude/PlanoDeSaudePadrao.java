package Controllers.PlanosDeSaude;

public abstract class PlanoDeSaudePadrao {
    private int idPlanoDeSaude;

    private String nomePlanoDeSaude;

    private int pacienteId;

    private double desconto;


    public PlanoDeSaudePadrao(int idPlanoDeSaude, String nomePlanoDeSaude, int pacienteId, double desconto) {
        this.idPlanoDeSaude = idPlanoDeSaude;
        this.nomePlanoDeSaude = nomePlanoDeSaude;
        this.pacienteId = pacienteId;
        this.desconto = desconto;
    }

    public String getNomePlanoDeSaude() {
        return nomePlanoDeSaude;
    }

    public void setNomePlanoDeSaude(String nomePlanoDeSaude) {
        this.nomePlanoDeSaude = nomePlanoDeSaude;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getIdPlanoDeSaude() {
        return idPlanoDeSaude;
    }

    public void setIdPlanoDeSaude(int idPlanoDeSaude) {
        this.idPlanoDeSaude = idPlanoDeSaude;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String toCSV() {
        return this.idPlanoDeSaude + "," + this.nomePlanoDeSaude + "," + this.pacienteId + "," + this.desconto + "," + "Não";
    }
}
