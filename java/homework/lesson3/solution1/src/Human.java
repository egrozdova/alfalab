public class Human extends Alive {

    char aClass, gender;
    String name, livAddress;
    int health;

    Human (char aClass, char gender, String name, String livAddress)
    {
        this.aClass = aClass;
        this.gender = gender;
        this.name = name;
        this.livAddress = livAddress;
        this.health = 100;
    }

    public char getGender() {
        return gender;
    }

    public char getAClass() {
        return aClass;
    }

    public String getLivAddress() {
        return livAddress;
    }

    public String getName() {
        return name;
    }

    public void setHealth (int health) {this.health = this.health - health;}
    public int getHealth() {
        return health;
    }

    public void voice ()
    {
        System.out.println(name + ": Говорю");
    }

    public void run ()
    {
        health = health - 20;
        System.out.println(name + ": Делаю ноги. Уровень здоровья: " + health);

    }

    public void eat ()
    {
        health = health + 13;
        System.out.println(name + ": Наворачиваю еду. Уровень здоровья: " + health);

    }

    public void sleep ()
    {
        health = health + 11;
        System.out.println(name + ": ZzzzZzzzz. Уровень здоровья: " + health);

    }

    public int fight ()
    {
        int force = 30;

        System.out.println(name + ": Бью палкой. Уровень здоровья противника: -" + force);
        return force;
    }

    @Override
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
            case 'H':
                aClassWR = "человек";
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

        System.out.println(String.format("Меня зовут %s, я %s, пол %s. Живу я здесь: %s", name, aClassWR, genderWR, livAddress));
    }

}
