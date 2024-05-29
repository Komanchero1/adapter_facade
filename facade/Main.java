public class Main {

    public static void main(String[] args) {
        String a = "2";
        String b = "4";
        //создаем экземпляр класса  BinOps для доступа к методам класса
        BinOps bins = new BinOps();
        //вызов метода sum у объекта bins и добавляем параметры
        // затем выводим результат в консоль
        System.out.println(bins.sum(a, b));
        //вызов метода mult у объекта bins и добавляем параметры
        // затем выводим результат в консоль
        System.out.println(bins.mult(a, b));
    }
}
