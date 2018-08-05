public class Solution1 {

    public static void main (String[] args)
    {
        /*
        В initialStr указывается строка, в которой необходимо произвести замену. Для указания обратного слэша '\' его необходимо экранировать одним обратным слэшом
        В search указываются символы для замены (выражение чувствительно к регистру). Для указания обратного слэша '\' его необходимо экранировать тремя обратными слэшами
        */
        String initialStr, search, replace, result;
        initialStr = "Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался»";
        search = "рР";
        replace = "*";
        result = initialStr.replaceAll("["+search+"](\\w*)", replace);
        System.out.println(result);

    }
}
