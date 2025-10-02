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

    public boolean isNumero(String valor, String campo) {
        if(!(valor != null && valor.matches("\\d+"))) {
            JOptionPane.showMessageDialog(null, "O campo " + campo + " deve ser inserido em formato de número!");
            return false;
        }
        return true;
    }

    public boolean isString(String valor, String campo) {
        if(!(valor != null && valor.matches("[A-Za-zÀ-ÿ\\s]+"))) {
            JOptionPane.showMessageDialog(null, "O campo " + campo + " deve ser inserido em formato de texto!");
            return true;
        }
        return true;
    }
}
