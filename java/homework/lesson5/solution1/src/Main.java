import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Main {


    public static void main (String[] args)
    {
        Pet koshka = new Pet('C', 'F', "Глаша", "", "", 'R');
        Pet kot = new Pet('C', 'M', "Мурзик", "", "", 'G');
        Pet sobakaS = new Pet('D', 'F', "Алебардия", "", "", 'B');
        Pet sobakaH = new Pet('D', 'F', "Хавроша", "", "", 'W');

        Set<Pet> petSet = new HashSet<Pet>();
        petSet.add(koshka);
        petSet.add(kot);
        petSet.add(sobakaS);
        petSet.add(sobakaH);
        //Сдать в приют животное
        petSet.add (new Pet('D', 'F', "Глаша2", "", "", 'G'));
        petSet.add (new Pet('D', 'F', "Глаша3", "", "", 'G'));



        // Конвертируем HashSet в массив
        Pet[] priutArray = {};
        priutArray = petSet.toArray(new Pet[petSet.size()]);

        //Забрать из приюта рандомное животное
        int a, b, n;
        a = 0; // левая граница диапазона случайных значений
        b = priutArray.length-1; // правая граница
        n = a + (int) (Math.random() * b); //генерим случайное целое


        for (int i = 0; i<= b; i++) {

            if (i==n) {
                System.out.print("Вы забираете из приюта "+priutArray[i].name);

                //petSet.remove();

                for( Pet entry : petSet ){

                        if(entry.name==priutArray[i].name) {
                        petSet.remove(entry);
                        break;
                        }
                    }
                }

            }

        // Забрать из приюта определенное животное
        char selectColor, selectAClass, selectGender;
        selectColor = 'G';
        selectAClass = 'D';
        selectGender = 'F';
        int check = 0;
        for( Pet entry : petSet ){

            if(entry.aClass==selectAClass && entry.gender==selectGender&&entry.color==selectColor) {
                System.out.print(" и "+entry.name);
                petSet.remove(entry);
                check = 1;
                break;
            }
                    }
        if(check==0) {System.out.println(""); System.out.println("Животного искомого цвета, пола и класса нет :(");}
    }










}