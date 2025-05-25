package org.example.UVA_VI.GUI;

import org.example.UVA_IV.Libro;
import org.example.UVA_VI.Controlador.ControladorLibreria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaBuscar extends JFrame {

    public VentanaBuscar(ControladorLibreria controlador) {
        setTitle("Buscar Libro");
        setSize(400, 200);
        setLocationRelativeTo(null);

        JTextField campoBusqueda = new JTextField(20);
        JComboBox<String> criterio = new JComboBox<>(new String[]{"Título", "Autor", "ISBN"});
        JTextArea resultado = new JTextArea(5, 30);
        resultado.setEditable(false);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener((ActionEvent e) -> {
            String texto = campoBusqueda.getText();
            String tipo = (String) criterio.getSelectedItem();
            Libro libro = null;

            switch (tipo) {
                case "Título" -> libro = controlador.buscarLibroPorTitulo(texto);
                case "Autor" -> libro = controlador.buscarLibroPorAutor(texto);
                case "ISBN" -> libro = controlador.buscarLibroPorISBN(texto);
            }

            resultado.setText(libro != null ? libro.toString() : "Libro no encontrado.");
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Buscar por:"));
        panel.add(criterio);
        panel.add(campoBusqueda);
        panel.add(btnBuscar);
        panel.add(new JScrollPane(resultado));

        add(panel);
    }
}
