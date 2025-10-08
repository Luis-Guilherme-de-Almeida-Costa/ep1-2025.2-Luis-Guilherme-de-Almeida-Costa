package Controllers.PlanosDeSaude;

public class PlanoDeSaudeEspecial extends PlanoDeSaudePadrao{

    private boolean tempoInternacao = true;

    public PlanoDeSaudeEspecial(int idPlanoDeSaude, String nomePlanoDeSaude, int pacienteId, double desconto) {
        super(idPlanoDeSaude, nomePlanoDeSaude, pacienteId, desconto);
        this.setDesconto(0.7);
    }

    public boolean isTempoInternacao() {
        return tempoInternacao;
    }

    public void setTempoInternacao(boolean tempoInternacao) {
        this.tempoInternacao = tempoInternacao;
    }

    @Override
    public String toCSV() {
        return this.getIdPlanoDeSaude() + "," + this.getNomePlanoDeSaude() + "," + this.getPacienteId() + "," + this.getDesconto() + "," + "Sim";
    }
}
