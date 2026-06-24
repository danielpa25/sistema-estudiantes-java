
public class GestorCurso {

    private Curso[] cursos;

    public GestorCurso(int numCursos){

        this.cursos = new Curso[numCursos];

    }

    public void agregarCurso(int i, Curso curso) {

        cursos[i] = curso;
    }

    public void mostrarCurso(){

         for (int i = 0; i < cursos.length; i++){
            cursos[i].mostrarEstudiante();
        }
    }

}