/**
 * @author Wesleyleopoldo
 * @since 15/09/2024
 */

import logicafibonacci.Fibonacci;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Fibonacci fibonacci = new Fibonacci();

        System.out.print("Digite o número que você deseja verificar: ");
        Integer numeroVerificado = scanner.nextInt();

        System.out.println(fibonacci.verificarNumero(numeroVerificado));
    }
}