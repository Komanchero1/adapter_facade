public class IntsCalculator implements Ints {


    protected final Calculator target;

    //конструктор
    public IntsCalculator() {
        //создаем новый экземпляр класса Calculator
        // присваиваем этот объект полю  target это
        // позволяет объектам класса IntsCalculator использовать
        // методы и ресурсы класса Calculator
        this.target = new Calculator();
    }

    //переопределенный метод из интерфейса Ints для сложения 2 чисел
    @Override
    public int sum(int arg0, int arg1) {
        //создаем новый объект класса Formula для выполнения арифметических операций
        Calculator.Formula formula = target.newFormula()
                .addOperand(arg0)//добавляем первый операнд
                .addOperand(arg1)//добавляем второй операнд
                //вызываем метод calculate и передаем в него операнды и указываем какое
                // арифметическое действие надо делать
                .calculate(Calculator.Operation.SUM);
        return (int) formula.result();//возвращаем результат приведенный к int
    }

    //переопределенный метод из интерфейса Ints для умножения 2 чисел
    @Override
    public int mult(int arg0, int arg1) {
        //создаем новый объект класса Formula для выполнения арифметических операций
        Calculator.Formula formula = target.newFormula()
                .addOperand(arg0)//добавляем первый операнд
                .addOperand(arg1)//добавляем второй операнд
                //вызываем метод calculate и передаем в него операнды и указываем какое
                // арифметическое действие надо делать
                .calculate(Calculator.Operation.MULT);
        return (int) formula.result();//возвращаем результат приведенный к int
    }

    //переопределенный метод из интерфейса Ints для сложения
    // для возвведения первого операнда в степень второго операнда
    @Override
    public int pow(int a, int b) {
        //создаем новый объект класса Formula для выполнения арифметических операций
        Calculator.Formula formula = target.newFormula()
                .addOperand(a)//добавляем первый операнд
                .addOperand(b)//добавляем второй операнд
                //вызываем метод calculate и передаем в него операнды и указываем какое
                // арифметическое действие надо делать
                .calculate(Calculator.Operation.POW);
        return (int) formula.result();//возвращаем результат приведенный к int
    }
}
