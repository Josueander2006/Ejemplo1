import java.io.*;
public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int nota[]= new int [100];
        int N,i,sn=0,cd=0,s=0,pro;
        do {
            System.out.println("Ingresa El numero la cantidad de estudiantes:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0||N>100);
        System.out.println("ingresar las notas del estudiante");
        for (i = 0; i <N; i++)
        {
            do {
                System.out.println("ingrese nota :");
                nota[i]=Integer.parseInt(br.readLine());
            } while (nota[i]<0|| nota[i]>20);

        }
        System.out.println("reporte de las notas :");
        for (i = 0; i <N; i++)
        {
            System.out.println( nota[i]);
        }
        System.out.println("Nota mas alta:");
        for (i = 0;  i<N; i++)
        {
            if (nota[i]>=11)
            {System.out.println(nota[i]);
                sn=sn+nota[i];
            }
        }
        System.out.println("Nota mas baja:");
        for (i = 0;  i<N; i++)
        {
            if (nota[i]<11)
            {System.out.println(nota[i]);
                cd=cd+1;
            }
        }
        System.out.println("cantidad de notas desaprobatorias:"+cd);

        for (i = 0; i <N; i++)
        {
            s=s+nota[i];
        }
        pro=s/N;
        System.out.println("promedio"+pro);
    }}