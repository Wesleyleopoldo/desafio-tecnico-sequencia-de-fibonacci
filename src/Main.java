/**
 * @author Wesleyleopoldo
 * @since 15/09/2024
 */

import letraprocurada.ProcuraLetra;
import logicafibonacci.Fibonacci;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ProcuraLetra procuraLetra = new ProcuraLetra();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Fibonacci fibonacci = new Fibonacci();

        System.out.print("Digite o número que você deseja verificar: ");
        Integer numeroVerificado = scanner.nextInt();

        System.out.println(fibonacci.verificarNumero(numeroVerificado));

        System.out.print("Digite a palavra que você quer inserir: ");
        String palavra = scanner.next().toLowerCase();

        procuraLetra.setPalavra(palavra);

        System.out.print("Digite a palavra que você quer inserir: ");
        char letra = scanner.nextLine().charAt(0);

        System.out.println(procuraLetra.verificaLetra(letra));

    }
}