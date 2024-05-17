package zad5004;

import java.util.function.Function;

public class Main {
    public static void main(String[] args)
    {
        Function<Integer, Integer > fun = (n) -> {
            int wynik = 1;

            for (int i = 1; i <= n; i++)
            {
                wynik = i * wynik;
            }
            return wynik;
        };

        System.out.println("Silnia z liczby 12 wynosi: " + fun.apply(12) + ".");
    }
}
