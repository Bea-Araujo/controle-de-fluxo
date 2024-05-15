package contador;

import java.util.Locale;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o parametro 1: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Insira o parametro 2: ");
        int parametroDois = scanner.nextInt();

        scanner.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Parametros inválidos, último número deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++){
            System.out.println("Nº " + (i + 1));
        }
    }

}
