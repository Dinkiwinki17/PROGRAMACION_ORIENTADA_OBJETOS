package org.example.UVA_VI.GUI;

import org.example.UVA_IV.Libro;
import org.example.UVA_VI.Controlador.ControladorLibreria;

import javax.swing.*;
import java.awt.*;

public class VentanaAdministrar extends JFrame {
    public VentanaAdministrar(ControladorLibreria controlador) {
        setTitle("Administrar Libros");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JTextField titulo = new JTextField(15);
        JTextField autor = new JTextField(15);
        JTextField anio = new JTextField(4);
        JTextField isbn = new JTextField(15);

        JButton btnAgregar = new JButton("Agregar");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");

        JLabel resultado = new JLabel();

        btnAgregar.addActionListener(e -> {
            try {
                Libro libro = new Libro(titulo.getText(), autor.getText(), Integer.parseInt(anio.getText()), isbn.getText());
                controlador.agregarLibro(libro);
                resultado.setText("Libro agregado.");
            } catch (NumberFormatException ex) {
                resultado.setText("Año inválido.");
            }
        });

        btnEditar.addActionListener(e -> {
            boolean exito = controlador.editarLibro(isbn.getText(), titulo.getText(), autor.getText(), Integer.parseInt(anio.getText()));
            resultado.setText(exito ? "Libro editado." : "Libro no encontrado.");
        });

        btnEliminar.addActionListener(e -> {
            Libro libro = controlador.buscarLibroPorISBN(isbn.getText());
            if (libro != null) {
                controlador.eliminarLibro(libro);
                resultado.setText("Libro eliminado.");
            } else {
                resultado.setText("Libro no encontrado.");
            }
        });

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("Título:")); panel.add(titulo);
        panel.add(new JLabel("Autor:")); panel.add(autor);
        panel.add(new JLabel("Año:")); panel.add(anio);
        panel.add(new JLabel("ISBN:")); panel.add(isbn);
        panel.add(btnAgregar); panel.add(btnEditar);
        panel.add(btnEliminar); panel.add(resultado);

        add(panel);
    }
}
