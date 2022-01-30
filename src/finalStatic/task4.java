package finalStatic;

public class task4 {
    static double mnoz(double a, double b, double c) {
        return a * b * c;
    }

    static void delenie(int a, int b) {
        System.out.println("celoe chislo :" + a / b + "ostator " + a % b);
    }
}

class task4Test {
    public static void main(String[] args) {
        System.out.println(task4.mnoz(55.4, 23.4, 45 ));
        task4.delenie(12,6);
        System.out.println(task4.mnoz(45.34,34.2,23.9));
        task4.delenie(14,7);
    }
}