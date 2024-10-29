import java.io.*;
public class Analisis{
    public static final int MAX_ESTUDIANTES = 20;
    public static String[] nombres = new String[MAX_ESTUDIANTES];
    public static double[] notas = new double[MAX_ESTUDIANTES];
    public static int contadorEstudiantes = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int CE = Integer.parseInt(reader.readLine());
        if (CE > MAX_ESTUDIANTES) {
            System.out.println("Error: El número de estudiantes es " + MAX_ESTUDIANTES);
            return;
        }
        for (int i = 0; i < CE; i++) {
            ingresarDatosEstudiante(reader, i);
        }
        calcularResultados();
    }
    private static void ingresarDatosEstudiante(BufferedReader reader, int index) throws IOException {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = reader.readLine();
        // Validar que el nombre
        if (nombre.length()==0) {
            System.out.println("Error: El estudiante debe tener nombre.");
            return;
        }
        nombres[index] = nombre;
        double nota;
        do {
            System.out.print("Ingrese la nota del estudiante: ");
            nota = Double.parseDouble(reader.readLine());
            if (nota < 0 || nota > 20) {
                System.out.println("Error: La nota debe ser entre 0 y 20.");
            }
        } while (nota < 0 || nota > 20);

        notas[index] = nota;
        contadorEstudiantes++;
    }

    private static void calcularResultados() {
        if (contadorEstudiantes == 0) {
            System.out.println("No se han ingresado estudiantes.");
            return;
        }
        double sumaNotas = 0;
        double notAlta = notas[0];
        double notBaja = notas[0];

        for (int i = 0; i < contadorEstudiantes; i++) {
            sumaNotas += notas[i];
            if (notas[i] > notAlta) {
                notAlta = notas[i];
            }
            if (notas[i] < notBaja) {
                notBaja = notas[i];
            }
        }

        double promedio = sumaNotas / contadorEstudiantes;

        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Nota más alta: " + notAlta);
        System.out.println("Nota más baja: " + notBaja);
    }
}