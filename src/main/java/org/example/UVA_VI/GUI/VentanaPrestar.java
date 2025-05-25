package org.example.UVA_VI.GUI;

import org.example.UVA_VI.Controlador.ControladorLibreria;

import javax.swing.*;

public class VentanaPrestar extends JFrame {
    public VentanaPrestar(ControladorLibreria controlador) {
        setTitle("Prestar Libro");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JTextField campoISBN = new JTextField(15);
        JButton btnPrestar = new JButton("Prestar");
        JLabel resultado = new JLabel();

        btnPrestar.addActionListener(e -> {
            boolean exito = controlador.prestarLibro(campoISBN.getText());
            resultado.setText(exito ? "Libro prestado." : "No se encontró el libro.");
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("ISBN:"));
        panel.add(campoISBN);
        panel.add(btnPrestar);
        panel.add(resultado);

        add(panel);
    }
}
