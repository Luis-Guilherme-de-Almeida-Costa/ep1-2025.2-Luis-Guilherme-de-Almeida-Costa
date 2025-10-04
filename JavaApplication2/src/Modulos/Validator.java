package Modulos;

import javax.swing.JOptionPane;


public class Validator {

    public boolean verificarNome(String nome) {
        if(nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome não pode estar vazio.");
            return false;
        }

        if(nome.length() < 2 || nome.length() >= 99) {
            JOptionPane.showMessageDialog(null, "O nome deve ter entre 2 e 100 caracteres.");
            return false;
        }

        return true;
    }

    public boolean verificarIdade(String idade) {

        int intIdade = Integer.parseInt(idade);

        if (intIdade <= 0) {
            JOptionPane.showMessageDialog(null, "A idade deve ser maior que 0.");
            return false;
        }

        if (intIdade > 120) {
            JOptionPane.showMessageDialog(null, "A idade não pode ser maior que 120 anos.");
            return false;
        }

        return true;
    }

    public boolean verificarCPF(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio.");
            return false;
        }

        String cpfLimpo = cpf.replaceAll("[^0-9]", "");

        if (cpfLimpo.length() != 11) {
            JOptionPane.showMessageDialog(null, "O CPF deve conter 11 dígitos.");
            return false;
        }

        if (cpfLimpo.matches("(\\d)\\1{10}")) {
            JOptionPane.showMessageDialog(null, "O CPF informado é inválido.");
            return false;
        }

        return true;
    }

    public boolean verificarCrm(String crm) {
        String regex = "^\\d{8}-\\d/(AC|AL|AP|AM|BA|CE|DF|ES|GO|MA|MT|MS|MG|PA|PB|PR|PE|PI|RJ|RN|RS|RO|RR|SC|SP|SE|TO|BR)$";
        if (crm.matches(regex)) {
            JOptionPane.showMessageDialog(null, "O Conselho Federal de Medicina informado é inválido.");
            return false;
        }

        return true;
    }

    public boolean verificarHorario(String horario) {
        String padrao = "^\\d{2}/(0[1-9]|1[0-2])/([0-2][0-9]|3[0-1]),([01][0-9]|2[0-3]):[0-5][0-9]$";
        if (!horario.matches(padrao)) {
            JOptionPane.showMessageDialog(null, "Formato de data e hora inserido inválido!");
            return false;
        }

        return true;
    }

    public boolean isNumeroInteiro(String valor, String campo) {
        if(!(valor != null && valor.matches("\\d+"))) {
            JOptionPane.showMessageDialog(null, "O campo " + campo + " deve ser inserido em formato de número!");
            return false;
        }
        return true;
    }

    public boolean isNumero(String valor, String campo) {
        if(!(valor != null && valor.matches("\\d+(\\.\\d+)?"))) {
            JOptionPane.showMessageDialog(null, "O campo " + campo + " deve ser inserido em formato de número!");
            return false;
        }
        return true;
    }

    public boolean isString(String valor, String campo) {
        if(!(valor != null && valor.matches("[A-Za-zÀ-ÿ\\s]+"))) {
            JOptionPane.showMessageDialog(null, "O campo " + campo + " deve ser inserido em formato de texto!");
            return false;
        }
        return true;
    }
}
