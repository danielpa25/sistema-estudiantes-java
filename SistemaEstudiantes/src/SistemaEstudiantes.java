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

        for (int i = 0; i < qtyEstudiantes; i++) {

            System.out.println("Ingrese el estudiante " + (i + 1));
            String estudianteIngresado = teclado.nextLine();

            Estudiante estudiante = new Estudiante(estudianteIngresado, qtyMaterias);

            for (int x = 0; x < qtyMaterias; x++) {

                System.out.println("Ingrese la materia: ");
                String materia = teclado.nextLine();

                System.out.print("Ingrese la nota: ");
                double nota = teclado.nextDouble();
                teclado.nextLine();

                estudiante.ingresoAsignatura(x, materia);
                estudiante.ingresoNota(x, nota);

            }

        gesEstudiante.agregarEstudiante(i, estudiante);
    
        }

        gesEstudiante.mostrarEstudiante();

    }

}