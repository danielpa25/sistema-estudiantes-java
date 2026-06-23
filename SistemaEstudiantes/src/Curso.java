
public class Curso {

    private int grado;
    private char grupo;
    private Estudiante[] estudiantes; 
 



    public Curso(int numEstudiantes){

        this.grado = grado;
        this.grupo = grupo;
        this.estudiantes = new Estudiante[numEstudiantes];

    }

     //Ingreso Estudiantes
    public void agregarEstudiante(int i,  Estudiante estudiante ){

        estudiantes[i] = estudiante;

    }

    // Mostrar estudiantre
    public void mostrarEstudiante( ){

        for (int i = 0; i < estudiantes.length; i++){
            estudiantes[i].mostrarPromedio();
        }

    }
}
