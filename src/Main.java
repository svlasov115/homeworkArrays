import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1

        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};

        String[] myCompletedHomeworks = {"Установка инструментов разработчика", "Переменные", "Переменные. Урок 2", "Условный оператор", "Условный оператор. Урок 2", "Циклы", "Циклы. Урок 2"};

        // Задача 2
        System.out.println("Задача 2");

        for (int index = 0; index < integerArray.length; index++) {
            if (index == integerArray.length - 1) {
                System.out.println(integerArray[index]);
                break;
            }
            System.out.print(integerArray[index] + ", ");
        }

        for (int index = 0; index < doubleArray.length; index++) {
            if (index == doubleArray.length - 1) {
                System.out.println(doubleArray[index]);
                break;
            }
            System.out.print(doubleArray[index] + ", ");
        }

        for (int index = 0; index < myCompletedHomeworks.length; index++) {
            if (index == myCompletedHomeworks.length - 1) {
                System.out.println(myCompletedHomeworks[index]);
                break;
            }
            System.out.print(myCompletedHomeworks[index] + ", ");
        }

        // Задача 3
        System.out.println("Задача 3");

        for (int index = integerArray.length - 1; index >= 0; index--) {
            System.out.print(integerArray[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int index = doubleArray.length - 1; index >= 0; index--) {
            System.out.print(doubleArray[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int index = myCompletedHomeworks.length - 1; index >= 0; index--) {
            System.out.print(myCompletedHomeworks[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        // Задача 4
        System.out.println("Задача 4");

        for (int index = 0; index < integerArray.length; index++) {
            if (integerArray[index] % 2 != 0) {
                integerArray[index] += 1;
            }
        }
        System.out.println(Arrays.toString(integerArray));
    }
}
