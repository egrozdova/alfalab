import java.util.*;
public class Solution4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String inStr = "Я у мамы программист";
        String lowLiterStr = inStr.toLowerCase().replaceAll("[^а-яa-z]+", "");
        for (int i=0; i < lowLiterStr.length(); ) list.add(lowLiterStr.substring(i, ++i));
        Collections.sort(list);
        Set<String> set = new LinkedHashSet<>(list);
        String[] resultArray  = set.toArray(new String[set.size()]);
        System.out.println(Arrays.toString(resultArray));
    }
}
