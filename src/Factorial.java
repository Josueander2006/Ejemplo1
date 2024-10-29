import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String [] args) throws IOException {
        System.out.println("Bienvenido");
        int numero = Leernumero();
        //Calcular factorial
        int resultado=factorial(numero);
        System.out.println(numero);

    }
    public static int Leernumero()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = Integer.parseInt(br.readLine());
        return Math.abs(numero);
    }
    public static int factorial(int numero) {
        int valor = 0;
        for (int i = numero; i > 0; i--) {
            valor *= i;
        }
        return valor;
    }
}
