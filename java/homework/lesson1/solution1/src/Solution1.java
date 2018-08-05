public class Solution1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        //объявляем переменные целочисленного типа
        int a, b, j, n, v;
        //присваиваем значения
        a = 0; // левая граница диапазона случайных целочисленных
        b = 1000; // правая граница
        v = a + (int) (Math.random() * b); //генерим случайное целое
        n = Math.max (v, b - v); //определяем числитель - что побольше
        j = b - n; //знаменатель - что поменьше
        /*//проверяем обработку деления на 0 с красным сообщение
        j = 0;
        */
        /*//проверяем обработку остатка от деления = 0
        n = 100;
        j = 20;
        */
        if (j==0) //на ноль не делим
        {
            System.out.println(ANSI_RED + "Мы делили апельсин...на ноль! Попробуй ещё разочек!" + ANSI_RESET);
        }
        else
        {
            System.out.println("Пробуем поделить " + ANSI_BLUE + Integer.toString(n) + ANSI_RESET + " на " + ANSI_BLUE + Integer.toString(j) + ANSI_RESET + ":" + "\n");
            if (n % j == 0) //если делится нацело, про остаток не пишем
            {
                System.out.println(ANSI_BLUE + Integer.toString(n) + ANSI_RESET + " ÷ " + ANSI_BLUE + Integer.toString(j) + ANSI_RESET + " = " + ANSI_BLUE + n / j + ANSI_RESET + "\n");
            }
            else
            {
                System.out.println(ANSI_BLUE + Integer.toString(n) + ANSI_RESET + " ÷ " + ANSI_BLUE + Integer.toString(j) + ANSI_RESET + " = " + ANSI_BLUE + n / j + ANSI_RESET + " и " + ANSI_BLUE + n % j + ANSI_RESET + " в остатке " + "\n");
            }
            System.out.println("Не согласен? Звони +79161234567!");
        }


    }

}
