
public class SistemaEstudiantes {

    public static void main(String[] args){


        System.out.println("Bienvenido al sistema estudiantil");

        Estudiante estudiante1 = new Estudiante("Daniel Parada", 3);
        Estudiante estudiante2 = new Estudiante("Juliana", 3);

        GestorEstudiantes estudiante = new GestorEstudiantes(2);

        estudiante1.ingresoAsignatura(0, "Matemmaticas");
        estudiante1.ingresoAsignatura(1, "Español");
        estudiante1.ingresoAsignatura(2, "Programacion");

        estudiante2.ingresoAsignatura(0, "Matemmaticas");
        estudiante2.ingresoAsignatura(1, "Español");
        estudiante2.ingresoAsignatura(2, "Programacion");

        estudiante1.ingresoNota(0, 5);
        estudiante1.ingresoNota(1, 3.5);
        estudiante1.ingresoNota("Programacion", 5);

        estudiante2.ingresoNota(0, 4.5);
        estudiante2.ingresoNota(1, 3.0);
        estudiante2.ingresoNota("Programacion", 5); 

        estudiante.agregarEstudiante(0, estudiante1);
        estudiante.agregarEstudiante(1, estudiante2);

        estudiante.mostrarEstudiante();


    }

}