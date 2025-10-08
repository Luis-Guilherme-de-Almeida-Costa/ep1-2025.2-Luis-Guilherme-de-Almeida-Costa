package Controllers.PlanosDeSaude;

public class PlanoDeSaudeBasico extends PlanoDeSaudePadrao {

    public PlanoDeSaudeBasico(int idPlanoDeSaude, String nomePlanoDeSaude, int pacienteId, double desconto) {
        super(idPlanoDeSaude, nomePlanoDeSaude, pacienteId, desconto);
    }
}
