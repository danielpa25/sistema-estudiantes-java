
public class Estudiante {

    private String nombre;
    private String[] asignaturas;
    private double[][] notas;
    private double[][] porcentajes;

    // Constructor Estudiante
    public Estudiante(String nombre, int numAsignaturas, int numNotas) {

        this.nombre = nombre;
        this.asignaturas = new String[numAsignaturas];
        this.notas = new double[numAsignaturas][numNotas];
        this.porcentajes = new double[numAsignaturas][numNotas];
    }

    // Ingresar Asignatura
    public void ingresoAsignatura(int i, String asignatura) {
        asignaturas[i] = asignatura;

    }

    // Ingresar Nota
    public void ingresoNota(int i, int j, double nota) {

        notas[i][j] = nota;

    }

    // Ingreso nota -sobrecarga de metodo
    /*
     * public void ingresoNota(String asignatura, double nota){
     * 
     * for(int i = 0; i < asignaturas.length; i++){
     * 
     * if(asignaturas[i].equals(asignatura)){
     * notas[i] = nota;
     * }
     * }
     * }
     */

    // ingreso porcentaje nota
    public void ingresoPorcentaje(int i, int j, double porcentaje) {

        porcentajes[i][j] = porcentaje;
    }

    // Calculo de definitava por materia
    public double calculoDefinitivaMateria(int i) {

        double calculo = 0.0;
        double divi = 0.0;

        for (int j = 0; j < porcentajes[i].length; j++) {  //c

            calculo += notas[i][j] * porcentajes[i][j];
            divi += porcentajes[i][j];
        }
        calculo = calculo / divi;

        return calculo;
    }

    //Claculo promedio de todas las materias
    public double calculoPromedio() {

        double definitiva = 0.0;

        for (int i = 0; i < notas.length; i++) {

            definitiva += calculoDefinitivaMateria(i);

        }

        definitiva = definitiva / notas.length;

        return definitiva;

    }

    // Mostrar promedio
    public void mostrarPromedio() {

        System.out.println(nombre + " sus notas son: ");
        for (int i = 0; i < asignaturas.length; i++) {

            System.out.println(asignaturas[i]);

            for (int j = 0; j < notas[i].length; j++) {

                System.out.println("nota " + (j + 1) + "=" + notas[i][j]);

            }
            System.out.println("Definitiva materia: " + String.format("%.2f", calculoDefinitivaMateria(i)));

        }

        System.out.println("definitiva periodo : " + calculoPromedio());

    }

}
