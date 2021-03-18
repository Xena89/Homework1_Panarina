//Ксения Панарина, ДЗ 1 Java 1 Уровень

public class Homework1 {
        public static void main(String[] args) {
            doOne();
            System.out.println("a * (b + (c / d)) = " + doTwo(5,12,36,117));
            System.out.println(doThree(11, 3));
            doFour(-49);
            System.out.println(doFive(-10));
            doSix("добрый человек");
            doSeven(2020);
        }

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        static void doOne() {
            System.out.println("Задание 2.");
            boolean b = false;
            byte bt = 0;
            char c = 'w';
            short s = 32766;
            int i = -2147483647;
            long l = 92233720;
            float f = 67689.0f;
            double d = 3022.3793874397;
            System.out.println("Boolean = " + b);
            System.out.println("Byte = " + bt);
            System.out.println("Char = [" + c + "]");
            System.out.println("Short = " + s);
            System.out.println("Int = " + i);
            System.out.println("Long = " + l);
            System.out.println("Float = " + f);
            System.out.println("Double = " + d);
        }

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – входные параметры этого метода;
        static double doTwo(double a, double b, double c, double d) {
            System.out.println("\nЗадание 3.");
            return a * (b + (c / d));
        }

        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от
        // 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        static boolean doThree(int a, int b) {
            System.out.println("\nЗадание 4.");
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен
        // напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        static void doFour(int a) {
            System.out.println("\nЗадание 5.");
            if (a >= 0) System.out.println("Число " + a + "положительное");
            else System.out.println("Число " + a + " отрицательное");
        }

        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        static boolean doFive(int a) {
            System.out.println("\nЗадание 6.");
            if (a < 0) return true;
            return false;
        }

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        static void doSix(String name) {
            System.out.println("\nЗадание 7.");
            System.out.println("Привет, " + name + "!");
        }

        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й високосный.
        static void doSeven(int year) {
            System.out.println("\nЗадание 8.");
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " год не високосный");
            else System.out.println(year + " год високосный");
        }
}
