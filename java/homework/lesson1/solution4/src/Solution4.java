public class Solution4 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        //объявляем переменные целочисленного типа
        int a, b, n, len, res;
        //присваиваем значения
        a = 10; // левая граница диапазона случайных целочисленных
        b = 100; // правая граница
        n = a + (int)(Math.random() * (b-a)); //генерим случайное двузначное число
        //переводим число в строку и определяем длину
        len = Integer.toString(n).length();
        res = 0;
        /*загоняем строку в массив целочисленного типа соответствующей длины (на занятии проходили массивы. тренируемся)
        число преобразуем в строку, чтобы взять определенный символ
        символ преобразуем в цифру, иначе программа преобразует char в int как ASCI код символа
        зачем идея приписала мне radix:  - я не поняла*/
        int[] nums = new int[len];
        for (int i = 0; i < len; i++)
        {
            nums[i] = Character.digit(Integer.toString(n).charAt(i), 10);
        }
        //суммируем все элементы массива и выводим
        for (int i = 0; i < len; i++)
        {
            res = res + nums[i];
        }
        System.out.println("Если просуммировать все цифры числа " + ANSI_RED + n + ANSI_RESET + ", то получится " + ANSI_RED + res + ANSI_RESET);

        //ещё можно сделать всё то же самое, но без массива
        res = 0;
        for (int i = 0; i < len; i++)
        {
            res = res + Character.digit(Integer.toString(n).charAt(i), 10);
        }
        System.out.println("И вторым способом тоже получится " + ANSI_RED + res + ANSI_RESET);

        //ещё можно упражняться и дальше с делением и остатками
        //для числа длиною n будем складывать остатки от деления на 10, уменьшая при этом каждый раз число в 10 раз
        res = 0;
        for (int i = 1; i <= len; i++)
        {
            res = res + (n/(int)Math.pow(10,i-1))%(int)Math.pow(10,1);
        }
        System.out.println("И третьим способом тоже получится " + ANSI_RED + res + ANSI_RESET);

    }
}
