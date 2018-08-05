public abstract class Alive implements Eatable, Fightable, Runable, Sleepable, Voicable {

    //public abstract void display();
    public void introduce (char aClass, char gender, String name, String owner, String livAddress)
    {
        String aClassWR = "";
        switch (aClass) {
            case 'D':
                aClassWR = "собака";
                break;
            case 'C':
                aClassWR = "кошка";
                break;

        }

        String genderWR = "";
        switch (gender) {
            case 'F':
                genderWR = "женский";
                break;
            case 'M':
                genderWR = "мужской";
                break;
            case 'U':
                genderWR = "не определен";
                break;
        }

        System.out.println(String.format("Меня зовут %s, я %s, пол %s. Мой хозяин: %s, живу я здесь: %s", name, aClassWR, genderWR, owner, livAddress));
    }
}
