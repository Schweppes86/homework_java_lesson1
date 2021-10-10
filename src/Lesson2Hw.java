public class Lesson2Hw {
    public static void main(String[] args) {
        System.out.println(compareTwoNumbers(2,18));
        positiveOrNegative(-0);
        System.out.println(positiveOrNegativeBoolean(-1));
        printString(2,"Мир");
        System.out.println(findLeapYear(400));

    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    private static boolean compareTwoNumbers(int a, int b) {
        if ((10 <= (a+b)) && ((a+b)<=20)) {
            return true;
        }
        else {
            return false;
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    private static void positiveOrNegative(int a) {
        if (a>=0) {
            System.out.println(a + " is positive number");
        }
        else {
            System.out.println(a + " is negative number");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    private static boolean positiveOrNegativeBoolean(int a) {
        if (a>=0) {
            return false;
        }
        else {
            return true;
        }
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    private static void printString (int count, String printString){
        for (int i=0; i<count; i++) {
            System.out.print(printString + " ");
        }
    }

    //5 * Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    private static boolean findLeapYear (int year) {
        if (year%4==0) {
            if(year%400==0 && year%100==0) {
                return true;
            }
            else if (year%100==0) {
                return false;
            }
            return true;
        }
        return false;
    }
}