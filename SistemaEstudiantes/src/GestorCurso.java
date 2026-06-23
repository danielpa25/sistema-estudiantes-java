
public class GestorEstudiantes{

    private Estudiante[] estudiantes;

    //Constructor GestorEstudiante 
    public GestorEstudiantes( int numeroEstudiantes){

        this.estudiantes = new Estudiante[numeroEstudiantes];
    
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