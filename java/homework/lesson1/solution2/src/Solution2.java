public class Solution2 {
    //переиспользуем код другого проекта, т.е. задачи 1
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        //объявляем переменные целочисленного типа
        int a, b, resMath, resFloor, resCeil;
        double n;
        //присваиваем значения
        a = 0; // левая граница диапазона случайных значений
        b = 1000; // правая граница
        n = a + (double) (Math.random() * b); //генерим случайное целое
        /*//проверяем обработку остатка от деления = 0
        n = 100;
        */
        resMath = (int)Math.round(n);
        resFloor = (int)Math.floor(n);
        resCeil = (int)Math.ceil(n);

            System.out.println("Задача округлить число " + ANSI_BLUE + Double.toString(n) + ANSI_RESET + "\n");
            if (n == resMath) //если число итак круглое
            {
                System.out.println("...но оно итак круглое :)"+ "\n");
            }
            else
            {
                System.out.println("При округлении числа " + ANSI_BLUE + Double.toString(n) + ANSI_RESET + " по правилам математического округления - до ближайшего целого - получается число "  + ANSI_BLUE + resMath + ANSI_RESET + "\n");
                System.out.println("Ещё можно округлять всегда вниз " + ANSI_BLUE + resFloor + ANSI_RESET + "\n");
                System.out.println("Или вверх " + ANSI_BLUE + resCeil + ANSI_RESET + "\n");
            }
            System.out.println("Не согласен? Звони +79161234567!");
        }
}
