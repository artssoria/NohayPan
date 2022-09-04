
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo
 */
public class Principal {
    public static void main(String[] args) {
        int bizcochos = 0;
        double totalPago=0;
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Ingrese cuantos kilos de bizcochos quiere comprar ");
        bizcochos=scanner.nextInt();
        if (bizcochos >=50 && bizcochos<100) {
            totalPago=bizcochos*500;
        }
        else if (bizcochos>=100) {
            totalPago=bizcochos*400;
        }
        else{
            totalPago=bizcochos*500;
        }
        System.out.println("El cliente compro "+ bizcochos + " de bizcochos");
        System.out.println("El total a pagar es: $" + totalPago + " pesos");
    }
}
