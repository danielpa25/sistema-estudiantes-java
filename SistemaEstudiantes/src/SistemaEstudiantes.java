import java.util.Scanner;

public class SistemaEstudiantes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al sistema estudiantil");

        // Ingreso cantidad de estudiantes por teclado
        System.out.println("Ingrese la cantidad de estudiantes ");
        int qtyEstudiantes = teclado.nextInt();
        teclado.nextLine();// Eliminar salto de linea

        System.out.println("Ingrese la cantidad de cursos: ");
        int qtyCursos = teclado.nextInt();
        teclado.nextLine();// Eliminar salto de linea

        GestorCurso gescurso = new GestorCurso(qtyCursos);

        // Ingreso cantidad de materias por teclado
        System.out.println("Ingrese la cantidad de materias");
        int qtyMaterias = teclado.nextInt();
        teclado.nextLine();

        // Ingreso cantidad de notas por teclado
        System.out.println("Ingrese la cantidad de notas");
        int qtyNotas = teclado.nextInt();
        teclado.nextLine();

        for (int y = 0; y < qtyCursos; y++) {

            // Ingreso grado
            System.out.println("Ingrese el grado: ");
            int grado = teclado.nextInt();
            teclado.nextLine();// Eliminar salto de linea

            System.out.println("Ingrese el grupo: ");
            String grupoTexto = teclado.nextLine(); // JAVA no permite leer un solo caracter, por lo que solo permite leer un string
            char grupo = grupoTexto.charAt(0); // Conversion de String a Chart tomando el primer valor del String

            Curso curso = new Curso(qtyEstudiantes, grado, grupo);
            gescurso.agregarCurso(y, curso);

            for (int i = 0; i < qtyEstudiantes; i++) {

                System.out.println("Ingrese el estudiante " + (i + 1));
                String estudianteIngresado = teclado.nextLine();

                Estudiante estudiante = new Estudiante(estudianteIngresado, qtyMaterias, qtyNotas);

                for (int x = 0; x < qtyMaterias; x++) {

                    System.out.println("Ingrese la materia: ");
                    String materia = teclado.nextLine();

                    estudiante.ingresoAsignatura(x, materia);

                    for (int j = 0; j < qtyNotas; j++) {

                        System.out.println("Ingrese la nota " + (j + 1));
                        double nota = teclado.nextDouble();
                        teclado.nextLine();

                        // Condicion nota menor a 5 y mayor a 0
                        while (nota < 0 || nota > 5) {
                            System.out.println("Nota incorrecta, ingrese nuevamente la nota: ");
                            nota = teclado.nextDouble();
                            teclado.nextLine();
                        }

                        System.out.println("Ingrese el porcentaje");
                        double porcentaje = teclado.nextDouble();
                        teclado.nextLine();

                        // Condicion porcentaje menor a 1 y mayor a 0
                        while (porcentaje < 0 || porcentaje > 1) {

                            System.out.println("porcentaje incorrecto, ingrese nuevamente el porcentaje de la nota: ");
                            porcentaje = teclado.nextDouble();
                            teclado.nextLine();
                        }

                        estudiante.ingresoNota(x, j, nota);
                        estudiante.ingresoPorcentaje(x, j, porcentaje);

                    }

                }

                curso.agregarEstudiante(i, estudiante);

            }
            
        }

       gescurso.mostrarCurso();

    }

}