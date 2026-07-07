
import java.io.*;

public class GestorCurso {

    private Curso[] cursos;

    public GestorCurso(int numCursos) {

        this.cursos = new Curso[numCursos];

    }

    public void agregarCurso(int i, Curso curso) {

        cursos[i] = curso;
    }

    public void mostrarCurso() {

        for (int i = 0; i < cursos.length; i++) {
            cursos[i].mostrarEstudiante();
        }
    }

    public void guardarDatos() {

        try {
            FileWriter archivo = new FileWriter("datos.txt");
            BufferedWriter escritor = new BufferedWriter(archivo);

            for (int i = 0; i < cursos.length; i++) {

                escritor.write("curso" + cursos[i].getGrado() + cursos[i].getGrupo()); // escribe texto
                escritor.newLine();

                for (int j = 0; j < cursos[i].getEstudiantes().length; j++) {

                    escritor.write(cursos[i].getEstudiantes()[j].getNombre());
                    escritor.newLine();

                    for (int y = 0; y < cursos[i].getEstudiantes()[j].getAsignaturas().length; y++) {

                        escritor.write(cursos[i].getEstudiantes()[j].getAsignaturas()[y]);
                        escritor.newLine();

                        for (int x = 0; x < cursos[i].getEstudiantes()[j].getNotas().length; x++) {

                            escritor.write(String.valueOf(cursos[i].getEstudiantes()[j].getNotas()[y][x]));
                            escritor.newLine();
                            escritor.write(String.valueOf(cursos[i].getEstudiantes()[j].getPorcentajes()[y][x]));
                            escritor.newLine();
                        }
                    }
                }
            }
            escritor.close();

        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
        }

    }
    // Metodo de creacion de archivo
    /*
     * public void guardarDatos() {
     * 
     * String contenido = "Este es un ejemplo de uso de BufferedWriter en Java.";
     * 
     * try {
     * 
     * FileWriter archivo = new FileWriter("Archivo.txt"); // Creacion del archivo
     * 
     * BufferedWriter escritor = new BufferedWriter(archivo); // Inicializacion del
     * buffer
     * escritor.write(contenido); // escribe texto
     * escritor.newLine(); // salto de línea
     * escritor.flush(); // vacía el buffer al archivo
     * escritor.close();
     * 
     * } catch (Exception e) {
     * System.out.println("Error al crear el archivo"); // Menssaje de alerta en
     * caso de elrror al crear el archivo
     * }
     * 
     * }
     */

}