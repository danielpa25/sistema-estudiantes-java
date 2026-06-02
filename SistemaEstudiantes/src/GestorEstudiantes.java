
public class GestorEstudiantes{

    private Estudiante[] estudiantes;


    public GestorEstudiantes( int numeroEstudiantes){

        this.estudiantes = new Estudiante[numeroEstudiantes];
    
    }
//Ingreso Estdiantes
    public void agregarEstudiante(int i,  Estudiante estudiante ){

        estudiantes[i] = estudiante;

    }

    public void mostrarEstudiante( ){

        for (int i = 0; i < estudiantes.length; i++){
            estudiantes[i].mostrarPromedio();
        }

    }

}