package Modulos;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IdAutomatico {
    public static String linha;
    public static int id;

    public static int criarIdAutomatico(int col, String FILE_PATH) {
        File arquivo = new File(FILE_PATH);
        if (!arquivo.exists()) {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo CSV para os pacientes encontrado.");
            return 1;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            ArrayList<Integer> meusIds = new ArrayList<>();

            if((linha = reader.readLine()) == null) {
                return 1;
            } else {
                String[] data = linha.split(",");
                meusIds.add(Integer.parseInt(data[col]));
            }

            while ((linha = reader.readLine()) != null) {
                String[] data = linha.split(",");
                meusIds.add(Integer.parseInt(data[col]));
            }

            id = (meusIds.get(meusIds.toArray().length - 1) + 1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Houve algum erro na criação automática dos IDs");
        }

        return id;
    }
}
