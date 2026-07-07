
public class Curso {

    private int grado;
    private char grupo;
    private Estudiante[] estudiantes;

    public Curso(int numEstudiantes, int grado, char grupo) {

        this.grado = grado;
        this.grupo = grupo;
        this.estudiantes = new Estudiante[numEstudiantes];

    }

    // Ingreso Estudiantes
    public void agregarEstudiante(int i, Estudiante estudiante) {

        estudiantes[i] = estudiante;

    }

    // Mostrar estudiantre
    public void mostrarEstudiante() {

        System.out.println("Curso: " + grado + grupo);

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].mostrarPromedio();
        }

    }

    public int getGrado() {
        return grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

}
