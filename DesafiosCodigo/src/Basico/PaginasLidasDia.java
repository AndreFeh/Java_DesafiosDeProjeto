package Basico;

import java.util.Scanner;

public class PaginasLidasDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int livro = scan.nextInt();
        int paginasPorDia = 3;
        int dias = livro / paginasPorDia;

        System.out.println(dias + " dias");
    }
}