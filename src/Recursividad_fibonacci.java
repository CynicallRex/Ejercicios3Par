import java.util.Scanner;

public class Recursividad_fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de resultados: ");
        long limite = sc.nextLong();

        System.out.println("\n Los Primeros "+limite+" de la serie fibonacci son: ");
        fibonaci(limite, 0, 1);
    }

    public static void fibonaci(long limite, long anterior, long actual){
        if (limite > 0){
            System.out.println(" " +actual);
            fibonaci(limite-1, actual, anterior + actual);
        }
    }
}
