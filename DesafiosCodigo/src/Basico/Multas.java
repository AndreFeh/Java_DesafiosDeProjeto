package Basico;

import java.util.Scanner;

//TODO: A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida
// na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e a prefeitura não deu conta
// de enviar as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.
// O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma mensagem
// dizendo se o motorista será multado ou não.
public class Multas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int velocidade = scan.nextInt();

        int velocidadeMaxima = 60;
        if(velocidade>velocidadeMaxima){
            System.out.println("Foi multado");
        }else System.out.println("Nao foi multado");
    }
}
