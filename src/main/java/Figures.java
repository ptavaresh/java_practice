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

public class Figures {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Cuanto de alto:");
    int alto = Integer.parseInt(scanner.nextLine());
    System.out.println("Cuanto de ancho:");
    int ancho = Integer.parseInt(scanner.nextLine());
    int area = alto * ancho;
    int perimetro = (alto + ancho) * 2;
    System.out.println("Area: " + area);
    System.out.println("Perimetro: " + perimetro);
    }
}
