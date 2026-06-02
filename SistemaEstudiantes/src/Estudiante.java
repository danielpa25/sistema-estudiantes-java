
public class Estudiante {

    private String nombre;
    private String[] asignaturas;
    private double[] notas;

    // Constructor Etudiante
    public Estudiante(String nombre, int numAsignaturas) {

        this.nombre = nombre;
        this.asignaturas = new String[numAsignaturas];
        this.notas = new double[numAsignaturas];
    }

    // Ingresar Asignatura
    public void ingresoAsignatura(int i, String asignatura) {

        asignaturas[i] = asignatura;

    }

    // Ingresar Nota
    public void ingresoNota(int i, double nota) {

        notas[i] = nota;

    }

    // Ingreso nota -sobrecarga de metodo
    public void ingresoNota(String asignatura, double nota) {

        for (int i = 0; i < asignaturas.length; i++) {

            if (asignaturas[i].equals(asignatura)) {
                notas[i] = nota;
            }
        }
    }

    public double calculoPromedio() {

        double calculo = 0.0;

        for (double nota : notas) {
            calculo += nota;
        }

        calculo = calculo / notas.length;

        return calculo;
    }

    public void mostrarPromedio() {

        System.out.println(nombre + " sus notas son: ");
        for (int i = 0; i < asignaturas.length; i++) {

            System.out.println(asignaturas[i] + " : " + notas[i]);

        }
        System.out.println("Su promedio es: %.2f" + calculoPromedio());
    }

}
