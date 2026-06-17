public class Curso {

    private int grado;
    private char grupo;
    private Estudiante[] estudiantes; 



    public Curso(int grado, char grupo, int numEstudiantes){

        this.grado = grado;
        this.grupo = grupo;
        this.estudiantes = new Estudiante[numEstudiantes];


    }
}
