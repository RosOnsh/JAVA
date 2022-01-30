package finalStatic;

public class task5 {

    public static double Pi = 3.14;

    public double plosh(double radius) {
        double Pl = Pi * radius * radius;
        return Pl;
    }

    public static double dlina(double radius2) {
        double Dl = 2 * Pi * radius2;
        return Dl;
    }

    public void showInfo(double radius3) {
        System.out.println("Радиус : " + radius3);
        System.out.println("Площа Круга  : " + plosh(radius3));
        System.out.println("Длина круга : " + dlina(radius3));
    }

}

class task5Test {
    public static void main(String[] args) {
        task5 Ts = new task5();
        Ts.plosh(5);
        task5.dlina(7.5);
        Ts.showInfo(3);

    }
}