package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
      double raio = 3.4;
      final double PI = 3.14159;

      double area = PI * raio * raio;

      System.out.println("A área da circunferência é " + area + "m2");

      raio = 10;
      area = PI * raio * raio;
        System.out.println("A nova área da cricunferência é " + area + "m2");
    }
}
