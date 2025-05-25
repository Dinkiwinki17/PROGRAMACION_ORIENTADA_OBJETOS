package org.example.UVA_VI.GUI;

import org.example.UVA_VI.Controlador.ControladorLibreria;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal(ControladorLibreria controlador) {
        setTitle("Biblioteca UVA");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnBuscar = new JButton("Buscar Libro");
        JButton btnPrestar = new JButton("Prestar Libro");
        JButton btnDevolver = new JButton("Devolver Libro");
        JButton btnAdmin = new JButton("Administrar Libros");

        btnBuscar.addActionListener((ActionEvent e) -> new VentanaBuscar(controlador).setVisible(true));
        btnPrestar.addActionListener((ActionEvent e) -> new VentanaPrestar(controlador).setVisible(true));
        btnDevolver.addActionListener((ActionEvent e) -> new VentanaDevolver(controlador).setVisible(true));
        btnAdmin.addActionListener((ActionEvent e) -> new VentanaAdministrar(controlador).setVisible(true));

        JPanel panel = new JPanel();
        panel.add(btnBuscar);
        panel.add(btnPrestar);
        panel.add(btnDevolver);
        panel.add(btnAdmin);

        add(panel);
    }
}
