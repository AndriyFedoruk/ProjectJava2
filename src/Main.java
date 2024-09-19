public class Main {
    public static void main(String[] args) {
        // Викликаємо методи для кожного завдання
        runTask1();
        runTask2();
        runTask3();
    }

    // Завдання 1
    public static void runTask1() {
        double a = -2.98;
        double b = 5.55;
        double c = 0.045;
        double d = 0.129;

        double y = (Math.sin(Math.abs(a)) + Math.cos(Math.sqrt(b))) / (2 * Math.tan(c) + Math.pow(Math.E, d));
        System.out.println("Завдання 1: y = " + y);
    }

    // Завдання 2
    public static void runTask2() {
        double a = 1.234;
        double b = -3.12;
        double c = 5.45;
        double d = 2.0;

        double numerator = Math.pow(Math.tan(a), 1.0 / c);
        double denominator = 1 + (Math.sinh(b) / Math.log(Math.abs(d + c)));
        double y = numerator / denominator;

        System.out.println("Завдання 2: y = " + y);
    }

    // Завдання 3
    public static void runTask3() {
        double a = -2.86;
        double b = 1.62;
        double c = 10.874;
        double d = 2.91;

        double term1 = 2 * Math.cos(Math.sqrt(Math.abs(a)) / b);
        double term2 = 4 * Math.log(d + Math.sqrt(d * d + 1));
        double y = Math.pow(term1 + term2, c);

        System.out.println("Завдання 3: y = " + y);
    }
}
