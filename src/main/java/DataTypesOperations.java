import java.util.Scanner;

public class DataTypesOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int num1 = input.nextInt();
        System.out.println("Введите второе целое число: ");
        int num2 = input.nextInt();
        if (num2!=0){
            System.out.println("Сумма чисел равна " + (num1 + num2));
            System.out.println("Разность чисел равна " + (num1 - num2));
            System.out.println("Результат целочисленного деления равен " + (num1 / num2));
            System.out.println("Результат умножения равен " + (num1 * num2));
            System.out.println("Остаток от деления равен " + (num1 % num2));
            System.out.println(num1>num2);
            System.out.println(num1==num2);
            System.out.println(num1<=num2);

            System.out.println("Введите число с плавающей точкой: ");
            double num3 = input.nextDouble();
            System.out.println("Напомню, вы ввели числа: " + num1 + ", " + num2 + ", " + num3);
            System.out.println("Получим произведение трех введеных чисел: " + (num1 * num2 * num3));
            System.out.println("Разделим сумму первых на третье: " + ((num1 + num2) / num3));
            System.out.println("Получим сумму трех чисел: " + (num1 + num2 + num3));
        }
        else System.out.println("Давайте не будем пытаться делить на 0, у нас же не Высшая Математика");
        System.exit(0);


    }

}
