public class Solution3 {
    /*
    Step by step story
    1.  Разобраться и исправить то, что подчёркивает идея
        1.1. Пропущена ;
        1.2. Несовместимость типов int<>double - т.к. по значениям видно,
            что рез-т целочисленный, можно воспользоваться явным приведением типов
            Для проверки можно вывести результат в консоль
    */
    public static void main(String[] args) {
        double c = 2.0;
        byte n = 50;
        long a = 200;
        int result = (int)((a/n) * c);
        //System.out.println(result);
    }

}
