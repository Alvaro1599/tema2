package package1;

import java.util.Scanner;

public class tema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio:");
        Double price=scanner.nextDouble();
        getIva(price);
    }
    static void getIva(Double price){
        System.out.println("El precio final es: "+ (price*1.18));

    }
}
