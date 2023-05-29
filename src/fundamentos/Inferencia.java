package fundamentos;
import java.util.Scanner;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        a = 12;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);;

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        System.out.println("Digite seu sobrenome");
        String sobrenome = scan.nextLine();

    }
}
