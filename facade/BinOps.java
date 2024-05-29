public class BinOps {

    //метод для сложения двоичных чисел
    public String sum(String a, String b) {
        // переводим двоичные числа  "а"  и "b"  в  int  складываем
        // и сумму возвращаем в двоичное число
        return Integer.toBinaryString(Integer.parseInt(a) + Integer.parseInt(b));
    }
        //метод для перемножения двоичных чисел
    public String mult(String a, String b) {
        // переводим двоичные числа  "а"  и "b"  в  int  перемножаем
        // и результат возвращаем в двоичное число
        return Integer.toBinaryString(Integer.parseInt(a) * Integer.parseInt(b));
    }

}
