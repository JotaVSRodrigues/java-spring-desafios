package start_spring_io.start_spring_io.model;

import java.util.Scanner;

public class Contador {
    public void contar(int number) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o número que você quer contar: ");
        int range = scan.nextInt();

        for (int i = 0; i <= range; i++) {
            System.out.println(i);
        }
    }
}
