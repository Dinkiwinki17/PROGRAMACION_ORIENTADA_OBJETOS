package org.example.UVA_VI.GUI;

import org.example.UVA_IV.Libro;
import org.example.UVA_VI.Controlador.ControladorLibreria;

import javax.swing.*;
import java.awt.*;

public class VentanaDevolver extends JFrame {
    public VentanaDevolver(ControladorLibreria controlador) {
        setTitle("Devolver Libro");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField campoTitulo = new JTextField(15);
        JTextField campoAutor = new JTextField(15);
        JTextField campoAnio = new JTextField(4);
        JTextField campoISBN = new JTextField(15);
        JButton btnDevolver = new JButton("Devolver");
        JLabel resultado = new JLabel();

        btnDevolver.addActionListener(e -> {
            try {
                Libro libro = new Libro(
                        campoTitulo.getText(),
                        campoAutor.getText(),
                        Integer.parseInt(campoAnio.getText()),
                        campoISBN.getText()
                );
                controlador.devolverLibro(libro);
                resultado.setText("Libro devuelto.");
            } catch (NumberFormatException ex) {
                resultado.setText("Año inválido.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Título:")); panel.add(campoTitulo);
        panel.add(new JLabel("Autor:")); panel.add(campoAutor);
        panel.add(new JLabel("Año:")); panel.add(campoAnio);
        panel.add(new JLabel("ISBN:")); panel.add(campoISBN);
        panel.add(btnDevolver); panel.add(resultado);

        add(panel);
    }
}
