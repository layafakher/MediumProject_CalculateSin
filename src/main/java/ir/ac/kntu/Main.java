package ir.ac.kntu;

import java.util.Scanner;

public class Main {
    private static double fact(int n)
    {
        if (n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return (n * fact(n - 1));
        }
    }
    private static double pow(double x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return (x * pow(x, n - 1));
        }
    }
    public static void main(String[] args) {
        int n, i, sign = 1;
        double x, sum = 0;
        System.out.print("Enter x:");
        x = (new Scanner(System.in)).nextDouble();
        System.out.print("Enter n:");
        n = (new Scanner(System.in)).nextInt();
        for (i = 1; i <= n; i += 2)
        {
            sum += sign * pow(x, i) / fact(i);
            sign = -sign;
        }
        System.out.printf("Sin(%s) = %s", x, sum);
    }
}

