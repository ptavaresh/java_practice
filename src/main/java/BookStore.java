/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Tavares
 */
import java.util.Scanner;

public class BookStore {
        public static void main(String[] args) {    
            
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        Double precio =  Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito:");
        Boolean gratuito = scanner.nextBoolean();
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito:" + gratuito);
        
    }
}