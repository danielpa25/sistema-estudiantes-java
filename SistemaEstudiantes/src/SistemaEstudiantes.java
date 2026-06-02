import java.util.Scanner;

public class SistemaEstudiantes{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al sistema estudiantil");

        Estudiante estudiante = new Estudiante("Daniel Parada", 3);

        estudiante.ingresoAsignatura(0, "Matemmaticas");
        estudiante.ingresoAsignatura(1, "Español");
        estudiante.ingresoAsignatura(2, "Programacion");

        estudiante.ingresoNota(0, 5);
        estudiante.ingresoNota(1, 3.5);

        estudiante.ingresoNota("Programacion", 5);

        estudiante.calculoPromedio();

        estudiante.mostrarPromedio();







    }

    
}