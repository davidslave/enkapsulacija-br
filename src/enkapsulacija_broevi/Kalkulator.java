package enkapsulacija_broevi;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        Broevi b = new Broevi();

        System.out.print("Vnesi vrednost za a:");
        int inputA = tastatura.nextInt();
        b.seta(inputA);

        System.out.print("Vnesi vrednost za b;");
        int inputB = tastatura.nextInt();
        b.setb(inputB);

        int c = b.geta() + b.getb();
        System.out.println("Zbirot na a i b e: " + c);
    }
}