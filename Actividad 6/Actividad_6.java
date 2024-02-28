public class Actividad_6 {
    public static void main(String[] args) {
        int[] calificaciones = { 82, 76, 91, 85, 79 };
        Estudiante estudiante = new Estudiante("David Mendez", calificaciones);
        estudiante.imprimirResultados();
    }
}

class Estudiante {
    private String nombre;
    private int[] calificaciones = new int[5];

    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50)
            return 'F';
        else if (promedio <= 60)
            return 'E';
        else if (promedio <= 70)
            return 'D';
        else if (promedio <= 80)
            return 'C';
        else if (promedio <= 90)
            return 'B';
        else
            return 'A';
    }

    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
}