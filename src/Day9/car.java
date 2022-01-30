package Day9;

public class car {

    int h = 5;  // Длина имени может быть очень длинная.


    String color;    //instance переменные,они пренадлежат обьекту каждый обьект класса кар будет иметь эти переменные.можно испольховать и внутри класса и внутри метода
    String engine;
    static int count;
    int a = 10;


    car(String color, String engine) {   //String color , String engine  параметр называю так же как и свои object переменные.области видимости не соответсвуют друг другу .
        this.count++;
        this.color = color;
        this.engine = engine;
    }

    void ChengedColor(String color) {
        System.out.println(color);

    }

    public static void main(String[] args) {
        car Meow = new car("red", "v6");
        System.out.println(Meow.color);
        Meow.ChengedColor("Black");
        System.out.println(Meow.color);
    }
}

/*
int cena локальная переменная.Создал ее в методе ChangeColor.Могу использовать ее внутри блока метода ChangeColor.
String color область видимости параметра это вся область метода(все тело) Будет не видна вне тела метода


 */