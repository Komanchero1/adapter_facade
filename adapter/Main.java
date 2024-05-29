public class Main {

    public static void main(String[] args) {
        //создаем объект класса IntsCalculator который реализует
        // интерфейс Ints определяющий методы для выполнения
        // математических операций
        Ints calc = new IntsCalculator();

        //производим вычисления и выводим их в консоль
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sum(10, 22));
        System.out.println(calc.pow(2, 10));
    }
}
