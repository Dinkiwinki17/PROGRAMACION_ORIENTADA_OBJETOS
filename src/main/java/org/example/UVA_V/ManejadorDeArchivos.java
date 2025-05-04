package org.example.UVA_V;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejadorDeArchivos {
    public void procesarArchivos() {
        String inputPath = "data_UvaV.txt";
        String outputPath = "output_UvaV.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputPath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
        ) {
            writer.write("Información traída de archivo origen");
            writer.newLine();

            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            System.out.println("Archivo copiado correctamente con encabezado.");
        } catch (IOException e) {
            System.out.println("Error al leer o escribir archivos: " + e.getMessage());
        }
    }


}
