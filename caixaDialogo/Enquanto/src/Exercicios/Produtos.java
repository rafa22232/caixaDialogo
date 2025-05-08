package Exercicios;

import java.util.Scanner;

public class Produtos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        double total = 0;

        while (cont < 5) {
            System.out.println(cont+ "Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            if (valor > 100) {
                valor *= 0.90;

                
            }else{
                valor *= 1.02;
            }

            System.out.println(cont + "Valor ajutado: " + valor);
            total += valor;
            cont++;
            
        }
            System.out.println(cont+ "Total da compra: " + total);
            scanner.close();
    }
    
}
