package Modulos;

import javax.swing.JOptionPane;


public class Validator {

    public void verificarNome(String nome) {
        if(nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome não pode estar vazio.");
            return;
        }

        if(nome.length() < 2 || nome.length() >= 99) {
            JOptionPane.showMessageDialog(null, "O nome deve ter entre 2 e 100 caracteres.");
            return;
        }
    }


}
