import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10; //целое число
        int c = 25; //тип данных ставится обязательно
        int d = 45;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        int sum = a + c;
        int sub = a - c;
        int mul = a * c;
        int div = a / c;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        double a1 = 10.1;
        double a2 = 15.3;
        double sum1 = a1 + a2;

        System.out.println(sum1);

        float a3 = 10.1f;
        float a4 = 15.3f;
        float sum2 = a3 + a4;
        System.out.println(sum2);

        boolean trueVar = true;
        boolean falseVar = false;

        char digit = '1';
        String digits = "123456";

        boolean sumBool = true && false; // логическое И && - перемножение , логическое ИЛИ || - сложение, условно говоря true = 1; false = 0
        boolean antiTrueVar = !trueVar;

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(a1 + " " + str3);

        int calculation = (1 + 2) * 3 * (4 + 8);
        System.out.println(calculation);

        int result = 1 + 2 / (3 * 4) + 6;
        System.out.println(result);//sout = сокращение етой констуркции

        // можно ли продать человеку буиылочку вина?? )))
        System.out.print("Введите возраст: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
// если больше 18 но меньше 25, продаем с документами. больше или равно 25 но меньше 65, продаем без документов
        // больше 65 но меньше 100, продаем с лекарствами
        if (age >= 18 && age < 25) {
            System.out.println("предъяви документы и я тебе продам");
        } else if (age >= 25 && age < 65) {
            System.out.println("продаем");
        } else if (age >= 65 && age < 100) {
            System.out.println("продаем и не забываем продать лекарства");
        } else {
            System.out.println("куда ему продавать, вы видели его");
        }
}
}
