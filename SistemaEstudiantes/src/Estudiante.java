
public class Estudiante {

    private String nombre;
    private String[] asignaturas;
    private double[] notas;
    private double[] porcentajes;


    //Constructor Estudiante
    public Estudiante( String nombre, int numAsignaturas){

        this.nombre = nombre;
        this.asignaturas = new String[numAsignaturas];
        this.notas = new double [numAsignaturas];
        this.porcentajes =  new double [numAsignaturas];
    }

    // Ingresar Asignatura
    public void ingresoAsignatura(int i, String asignatura){

        asignaturas[i] = asignatura;

    }

    //Ingresar Nota
    public void  ingresoNota(int i, double nota){

        notas[i] = nota;

    }

    //Ingreso nota -sobrecarga de metodo
    public void ingresoNota(String asignatura, double nota){

        for(int i = 0; i < asignaturas.length; i++){

            if(asignaturas[i].equals(asignatura)){
                notas[i] =  nota;   
            }
        }
    }

    //ingreso porcentaje nota
    public void ingresoPorcentaje(int i, double porcentaje){

        porcentajes[i] = porcentaje;
    }

    //Calculo de promedio
    public double calculoPromedio(){

        double calculo = 0.0;

        for (int i = 0 ; i < notas.length; i++){

            calculo += (notas[i] * porcentajes[i]);
            System.out.println("calculo: " + calculo);
           //calculo += calculo;
            System.out.println("calculo 2: " + calculo);
        
        }

        //calculo = calculo/notas.length;

        return calculo;
    }

    //Mostrar promedio
    public void mostrarPromedio(){

        System.out.println(nombre + " sus notas son: ");
        for(int i = 0; i < asignaturas.length; i++){

            System.out.println(asignaturas[i] +" : " + notas[i]);

        }
       // System.out.println(" ");
        System.out.println("Su promedio es: " + calculoPromedio());

    }

}
