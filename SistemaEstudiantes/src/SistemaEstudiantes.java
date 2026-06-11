import java.util.Scanner;

public class SistemaEstudiantes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al sistema estudiantil");

        // Ingreso cantidad de estudiantes por teclado
        System.out.println("Ingrese la cantidad de estudiantes ");
        int qtyEstudiantes = teclado.nextInt();
        teclado.nextLine();// Eliminar salto de linea

        GestorEstudiantes gesEstudiante = new GestorEstudiantes(qtyEstudiantes);

        // Ingreso cantidad de materias por teclado
        System.out.println("Ingrese la cantidad de materias");
        int qtyMaterias = teclado.nextInt();
        teclado.nextLine();

        // Ingreso cantidad de notas por teclado
        System.out.println("Ingrese la cantidad de notas");
        int qtyNotas = teclado.nextInt();
        teclado.nextLine();

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

                    System.out.println("Ingrese el porcentaje");
                    double porcentaje = teclado.nextDouble();
                    teclado.nextLine();

                    estudiante.ingresoNota(x, j, nota);
                    estudiante.ingresoPorcentaje(x, j, porcentaje);

                }
               
            }

            gesEstudiante.agregarEstudiante(i, estudiante);

        }
        gesEstudiante.mostrarEstudiante();

    }

}