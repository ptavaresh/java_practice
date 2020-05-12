/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allei
 */
import java.util.Scanner;

public class LessOrGraater {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Proporciona el numero1:");
    int numero1 = Integer.parseInt(scanner.nextLine());
    System.out.println("Proporciona el numero2:");
    int numero2 = Integer.parseInt(scanner.nextLine());
    System.out.println("El numero mayor es:");
    System.out.println(numero1 > numero2 ? numero1 : numero2);
    }
}
